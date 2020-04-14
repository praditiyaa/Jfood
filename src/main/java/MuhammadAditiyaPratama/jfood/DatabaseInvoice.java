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
    throws InvoiceNotFoundException
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId)
    {
        ArrayList<Invoice> listCust = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getCustomer().getId() == customerId)
            {
                listCust.add(invoice);
                return listCust;
            }
        }
        return null;
    }

    public static boolean addInvoice(Invoice invoice)
    throws OngoingInvoiceAlreadyExistsException
    {
        int customerId = invoice.getCustomer().getId();
        for(Invoice invoices : INVOICE_DATABASE)
        {
            if (invoices.getCustomer().getId() == customerId  && invoices.getInvoiceStatus() == InvoiceStatus.Ongoing)
            {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
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
    throws InvoiceNotFoundException
        {
            for (Invoice invoice : INVOICE_DATABASE)
            {
                if (invoice.getId() == id) {
                    INVOICE_DATABASE.remove(invoice);
                    return true;
                }
            }
            throw new InvoiceNotFoundException(id);
        }
}
