package exercise.exercise11;

public class Complex {
//    Nao se deve fazer isto pois variaveis staticas sao compartilhadas entre todas as instancias da classe
//    private static Double realPart;
//    private static Double imaginaryPart;
//    private static Double i = Math.sqrt(-1);

    private Double realPart;
    private Double imaginaryPart;


    public Complex(Double realPart, Double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex() {
        this.realPart = 1.0;
        this.imaginaryPart = 1.0;
    }

    public Double getRealPart() {
        return realPart;
    }

    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(Double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex addComplex(Complex numberComplex1) {
        double sumRealPart = this.getRealPart() + numberComplex1.getRealPart();
        double sumImaginaryPart = this.getImaginaryPart() + numberComplex1.getImaginaryPart();
        return new Complex(sumRealPart, sumImaginaryPart);
    }

    public Complex subComplex(Complex otherNumberComplex) {
        double sumRealPart = this.getRealPart() + (-1 * otherNumberComplex.getRealPart());
        double sumImaginaryPart = this.getImaginaryPart() + (-1 * otherNumberComplex.getImaginaryPart());
        return new Complex(sumRealPart, sumImaginaryPart);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", realPart, imaginaryPart);
    }
}
