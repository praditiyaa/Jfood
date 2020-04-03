import java.util.ArrayList;

public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>(0);
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }
    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoiceById(int id)
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId)
    {
        ArrayList<Invoice> listCust = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getCustomer().getId() == customerId)
            {
                listCust.add(invoice);
            }
        }
        return listCust;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        for (Invoice invoice1 : INVOICE_DATABASE) {
            if (invoice1.getInvoiceStatus().equals(invoice.getInvoiceStatus().Ongoing))
            {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for (Invoice invoice1 : INVOICE_DATABASE)
        {
            if (invoice1.getId() == id && invoice1.getInvoiceStatus() == InvoiceStatus.Ongoing)
            {
                invoice1.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice ( int id)
        {
            for (int i = 0; i < INVOICE_DATABASE.size(); i++)
            {
                Invoice invoice = INVOICE_DATABASE.get(i);
                if (invoice.getId() == id) {
                    INVOICE_DATABASE.remove(i);
                    return true;
                }
            }
            return false;
        }
}
