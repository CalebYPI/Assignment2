package za.ac.cput.group3badp;

public class VatCalculator  implements VatInterface {
    @Deprecated
    public int calcVat(int amount) {
        int vat = 15/100;
        return amount * vat;
    }
}
