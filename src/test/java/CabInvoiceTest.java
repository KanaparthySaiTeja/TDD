import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    @Test
    public void InvoiceServiceTest() {
        Cabinvoice cb=new Cabinvoice();
        Invoicedetails invoice = new Invoicedetails();
        cb.faredetail("Sai", Cabinvoice.type.NORMAL, 4, 2);
        cb.faredetail("Sai", Cabinvoice.type.PREMIUM ,7, 2);
        cb.faredetail("Sai", Cabinvoice.type.NORMAL,2, 8);

        int total = cb.RideRepository("Sai").total;
        System.out.println("Total Fare is "+total);
        Assert.assertEquals(179, total);
    }
}
