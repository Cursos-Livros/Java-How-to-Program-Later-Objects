package exercise.exercise16;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The number 0 not supported like denominator");
        }

        // Se o denominador for negativo, transferimos o sinal para o numerador
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int mdc = mdcCalculator(Math.abs(numerator), Math.abs(denominator));

        this.numerator = numerator / mdc;
        this.denominator = denominator / mdc;
    }

    private static int mdcCalculator(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator;
        }
        return mdcCalculator(denominator, numerator % denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static String addRationalNumber(int numeratorNumber1Value, int denominatorNumber1Value,
                                           int numeratorNumber2Value, int denominatorNumber2Value) {
        if (denominatorNumber1Value == denominatorNumber2Value) {
            int numeratorSum = numeratorNumber1Value + numeratorNumber2Value;
            return String.format("%d/%d", (numeratorSum), denominatorNumber1Value);
        }

        int numeratorNumber1 = mmcCalculator(numeratorNumber1Value, denominatorNumber1Value);
        int numeratorNumber2 = mmcCalculator(numeratorNumber2Value, denominatorNumber2Value);
        int numeratorSum = numeratorNumber1 + numeratorNumber2;
        return String.format("%d/%d", (numeratorSum), denominatorNumber1Value);
    }

    public static String subRationalNumber(int numeratorNumber1Value, int denominatorNumber1Value,
                                           int numeratorNumber2Value, int denominatorNumber2Value) {
        if (denominatorNumber1Value == denominatorNumber2Value) {
            int numeratorSub = numeratorNumber1Value - numeratorNumber2Value;
            return String.format("%d/%d", (numeratorSub), denominatorNumber1Value);
        }

        int numeratorNumber1 = mmcCalculator(numeratorNumber1Value, denominatorNumber1Value);
        int numeratorNumber2 = mmcCalculator(numeratorNumber2Value, denominatorNumber2Value);
        int numeratorSub = numeratorNumber1 - numeratorNumber2;
        return String.format("%d/%d", (numeratorSub), denominatorNumber1Value);
    }

    private static int mmcCalculator(int numerator, int denominator) {
        return (numerator * denominator) / mdcCalculator(numerator, denominator);
    }

    public static String multRationalNumber(int numeratorNumber1Value, int denominatorNumber1Value,
                                            int numeratorNumber2Value, int denominatorNumber2Value) {

        int numeratorMultiplicacion = numeratorNumber1Value * numeratorNumber2Value;
        int denominatorMultiplication = denominatorNumber1Value * denominatorNumber2Value;

        return String.format("%d/%d", (numeratorMultiplicacion), denominatorMultiplication);
    }

    public static String divtRationalNumber(int numeratorNumber1Value, int denominatorNumber1Value,
                                            int numeratorNumber2Value, int denominatorNumber2Value) {

        int numeratorDivision = numeratorNumber1Value * denominatorNumber1Value;
        int denominatorDivision = denominatorNumber2Value * numeratorNumber2Value;

        return String.format("%d/%d", (numeratorDivision), denominatorDivision);
    }


    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
