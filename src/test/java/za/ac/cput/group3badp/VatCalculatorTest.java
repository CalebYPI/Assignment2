package za.ac.cput.group3badp;

import org.junit.Assert;
import org.junit.Test;

public class VatCalculatorTest {
    private VatInterface vatInterface;

    @Test
    public void testVat() {
        int result = vatInterface.calcVat(100);
        Assert.assertEquals(15,result);
    }
}
