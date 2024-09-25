package exercise.exercise7enhancingclassdate;

/*
    Composition
    Uma classe pode apontar para objetos de outra classe
    Uma Relacao tem um

 */

public class Date {
    private Integer month;
    private Integer day;
    private Integer year;

    // Relembrando
    // private quer dizer que nenhuma classe tem acesso a esses dados
    // static o valor permanecera sempre o mesmo independente do comportamento do objeto
    // final entao uma vez que a classe e carregada o valor nao pode mudar
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //constructor
    public Date(int month, int day, int year) {
        //checa se o mes esta no intervalo
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1 -12");
        }

        // checa se o dia esta no intervalo de mes
        // 1 checa se o dia e menor que 0
        // ou se o dia e maior que dia da lista dias por mes month ali e o indice do mes
        // Exemplo se a entrada for (09,04,2024)
        // day = 09 e daysPerMonth[09] = 30 nesse caso e verdade
        // e por ultimo checa se o mes nao e 2 e dia nao e 29
        if (day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
            throw new IllegalArgumentException("day (" + day + ") out- of-range for " +
                    "the specified month and year");
        }

        // Checa se o ano e bissexto
        // Se o usuario digitar 29/02
        // Se torna necessario checar se o ano e bissexto
        // caso o ano seja bissexto ele nao entrara no if
        // caso o ano nao seja ele entra if e joga uma excessao
        // Se o ano for divisivel por 400 ele ja é bissexto
        // Mesmo que nao seja divisivel por 4 ou seja divisivel por 100
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the " +
                    "specified month and year");
        }

        if (year < 1900 || year > 2024) {
            throw new IllegalArgumentException("year (" + year + ") out-of-range for the " +
                    "specified year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date %s%n", this);
    }

    public void incrementDay(int daysToPass) {
        if (daysToPass > daysPerMonth[month]) {
            System.out.println(daysToPass + " its not permitted to the month" + month);
        } else {
            for (int days = 1; days < daysToPass; days++) {
                day++;
                System.out.println(this.toString());
            }
        }

        if()
    }

    public void incrementMonth(int monthToPass) {
        if (monthToPass > 0 && monthToPass < 12) {
            for (int months = 1; months <= monthToPass; months++) {
                month++;
                System.out.println(this.toString());
            }
        } else {
            System.out.println(monthToPass + " its not permitted to the month " + month);
        }
    }

    public void incrementYear(int yearToPass) {
        if (year < 1900 || year > 2024) {
            throw new IllegalArgumentException("year (" + year + ") out-of-range for the " +
                    "specified year");
        } else {
            for (int years = 1; years <= yearToPass; years++) {
                year++;
                System.out.println(this.toString());
            }
        }
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
