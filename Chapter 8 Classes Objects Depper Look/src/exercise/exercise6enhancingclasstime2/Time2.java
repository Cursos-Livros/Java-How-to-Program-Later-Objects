package exercise.exercise6enhancingclasstime2;

// Quando um construtor nao e criado
// E utilizado ao menos um construtor chamado de construtor padrao
// O construtor padrao nao tem nenhum argumento quando criado
// Porem inicia a variavel de instancia objeto(variavel Intancia1, variavel intancia2)
// Com alguns valores padroes
// 0 para tipos primitivos numericos
// false para booleans
// null para referencias

// Metodos Set tambem podem chamados de metodos modificadores
// Metodos get podem ser chamados tambem de metodos de acesso ( diferentes de modificadores de acesso)

public class Time2 {
    private int hour; // 0-23
    private int minute; // 0 - 60
    private int second; // 0 - 60


    // No argumet contructor
    // Construtor sem argumento ele e invocado sem argumentos
    // Certifica a criacao de um objeto com valores default
    // Nesse caso 0,0,0
    // Esse construtor funciona chamando um construtor normal (linha 18)
    // Sua vantagem e um tamanho mais curto
    // Um contrutor que funciona chamando outro construtor e chamado delegating constructor
    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time) {
        this(time.hour, time.minute, time.second);
    }

    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.minute = minute;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    public void tick() {
        second++;
        int hourAux = hour;

        if (second == 60) {
            second = 0;
            if (hourAux++ <= 24) {
                incrementMinute();
            }
        }
    }

    public void incrementMinute() {
        int hourAux = hour;
        if (hourAux++ != 24) {
            minute++;
        }

        if (minute == 60 && hourAux++ <= 24) {
            minute = 0;
            incrementHour();
        }
    }

    public void incrementHour() {
        int hourAux = hour;
        hour++;
        if (hourAux++ >= 24) {
            hour = 0;
        }
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
