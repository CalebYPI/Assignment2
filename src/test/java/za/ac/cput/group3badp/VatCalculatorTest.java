package za.ac.cput.group3badp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VatCalculatorTest {

    private VatCalculator vatCalculator;

    @Before
    public void setUp() throws Exception {
        vatCalculator = new VatCalculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calcTest() {
        double result = vatCalculator.calcVat(100);
        Assert.assertEquals(0, result, 15);
    }

}
