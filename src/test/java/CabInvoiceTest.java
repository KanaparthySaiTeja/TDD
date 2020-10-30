import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    @Test
    public void shouldReturnTotalFareOfJourney() {
        Cabinvoice cb=new Cabinvoice();
        int Fare= cb.invoiceGenerator(0,6);
        Assert.assertEquals(6,Fare);
    }
}
