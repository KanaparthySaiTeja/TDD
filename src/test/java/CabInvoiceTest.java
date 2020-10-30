import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    @Test
    public void shouldReturnTotalFareOfJourney() {
        Cabinvoice cb=new Cabinvoice();
        cb.invoiceGenerator(0,6);
        cb.invoiceGenerator(0,3);
        cb.invoiceGenerator(2,5);
        Assert.assertEquals(36,cb.Total);
        Assert.assertEquals(3, cb.No_of_rides);
        Assert.assertEquals(12,cb.AvgFare(),0);
    }
}
