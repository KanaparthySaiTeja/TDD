import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    @Test
    public void shouldReturnTotalFareOfJourney() {
        Cabinvoice cb=new Cabinvoice();
        cb.faredetail("Sai", 4, 2);
        cb.faredetail("Sai", 7, 2);
        cb.faredetail("Sai", 2, 8);

        int Total = cb.RideRepository("Sai").total;
        System.out.println(Total);
        Assert.assertEquals(142, Total);

    }
}
