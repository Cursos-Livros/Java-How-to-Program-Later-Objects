package exercise.exercise4;

import examples.example1.Time1;

public class InternalDataRepresentationTest {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("After time object is created", time);

        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        // Tratamos o erro IllegalArgumentException lancado pela classe caso o horario estiesse em um intervalo nao
        // permitido
        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
    }

    public static void displayTime(String header, Time1 time) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, time.toUniversalString(),
                time.toString());
    }
}
