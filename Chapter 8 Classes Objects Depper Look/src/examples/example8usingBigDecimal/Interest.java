package examples.example8usingBigDecimal;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {
    public static void main(String[] args) {
        // initial principal amount before interest
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        // display header
        System.out.printf("%s%20s%n", "Year", "Amount Deposit");

        //calculate amount on deposit for each ten years
        for (int year = 1; year <= 10; year++) {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            // display the year and the amount
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }

}
