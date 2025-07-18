package exercise27;

public class SieveEratosthenes {
    public static void main(String[] args) {
        boolean[] sieveEratosthenesList = new boolean[15];
        fillTrue(sieveEratosthenesList);

        markList(sieveEratosthenesList);

        showSieve(sieveEratosthenesList);
    }

    public static void fillTrue(boolean[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = true;
        }
    }

    public static void markList(boolean[] list) {
        for (int i = 2; i < list.length; i++) {
            // Element is true
            if (list[i]) {
                // Percur just the multiple of this element set all for false
                for (int j = i * 2; j < list.length; j += i) { // Remember j= i*2 its the initial it's not means j will take i and multiply for 2 all the time
                    list[j] = false;
                }
            }
        }
    }


    private static void showSieve(boolean[] sieveEratosthenesList) {
        for (int i = 2; i < sieveEratosthenesList.length; i++) {
            if (sieveEratosthenesList[i]) {
                System.out.printf("%d ", i);
            }
            if (i == 10) {
                System.out.print("\n");
            }
        }
    }

}