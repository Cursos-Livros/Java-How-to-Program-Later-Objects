package examples.example7packageaccess;

public class PackageDataTest {
    public static void main(String[] args) {
        PackageData packageData = new PackageData();

        // output String representation of packageData
        System.out.printf("After instantiation:%n%s%n", packageData);

        // change package access data in packageData object
        packageData.number = 77;
        packageData.string = "Goodbye!";

        // output String representation of packageData
        System.out.printf("%nAfter changing values:%n%s%n", packageData);
    }
}

class PackageData {
    int number = 0;
    String string = "Hello";

    // return PackageData object String representation
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
}
