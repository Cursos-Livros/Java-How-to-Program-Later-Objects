package examples.example1;

public class Time1 {
    private int hour; // 0-23
    private int minute; // 0 - 60
    private int second; // 0 - 60

    // Configura uma nova hora utlizando uma hora universal (hora, minuto, segundos)
    // Ao menos que a hora esteja em um intervalo invalido
    public void setTime(int hour, int minute, int second) {
//        Caso o numero esteja em um intervalo nao permitido jogamos um illegalargumentexception
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Converte para uma string em formato univarsal hh:mm:ss
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public String toString() {
//        Caso seja 0 ou 12 volta 12 senao volta um numero entre 0 e 12
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
                (hour < 12 ? "AM" : "PM"));
    }
}