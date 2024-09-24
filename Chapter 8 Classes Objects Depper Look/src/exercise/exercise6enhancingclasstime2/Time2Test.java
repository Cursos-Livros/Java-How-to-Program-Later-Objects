package exercise.exercise6enhancingclasstime2;

public class Time2Test {
    public static void main(String[] args) {
        Time2 t4 = new Time2(0, 0, 0); // 12:25:42
        displayTime("t4: hour, minute and second specified", t4);

        for (int i = 0; i <86400; i++) {
            t4.tick();
        }
        displayTime("New second:", t4);
    }


    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n %s%n %s%n",
                header, t.toUniversalString(), t.toString());
    }
}

