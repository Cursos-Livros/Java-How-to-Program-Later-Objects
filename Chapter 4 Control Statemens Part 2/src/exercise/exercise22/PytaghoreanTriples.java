package exercise.exercise21;

public class PytaghoreanTriples {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                for (int k = 1; k <= 500; k++) {
                    if (Math.pow(i, 2.0) + Math.pow(j, 2.0) == Math.pow(k, 2.0)) {
                        System.out.println(i + " " + j + "=  " + k);
                    }
                }
            }
        }
    }
}
