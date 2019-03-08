package za.ac.cput.group3badp;

public class VatCalculator  implements VatInterface {
    @Override
    public double calcVat(double amount) {
        double vat = 15/100;
        return amount * vat;
    }
}
