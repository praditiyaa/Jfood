import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.cash;
    private int deliveryFee;

    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
        
    }
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, customer, invoiceStatus);
        this.deliveryFee=deliveryFee;
    }

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee=deliveryFee;
    }
    public void setTotalPrice()
    {
        if (deliveryFee != 0)
        {
            super.totalPrice = getFood().getPrice() + getDeliveryFee();
        }
        else
        {
            super.totalPrice = getFood().getPrice();
        }
    }
    public String toString()
    {
        if (deliveryFee != 0 )
        {
            System.out.println("====================FOOD====================");
            System.out.println("ID: "+ super.getId());
            System.out.println("Food: " + super.getFood().getName());
            System.out.println("Date: " + super.getDate());
            System.out.println("Customer: " + super.getCustomer().getName());
            System.out.println("Delivery Fee: " + getDeliveryFee());
            System.out.println("Total Price: " + totalPrice);
            System.out.println("Status: " + super.getInvoiceStatus());
            System.out.println("Payment Type: " + PAYMENT_TYPE);
        }
        else
        {
            System.out.println("====================FOOD====================");
            System.out.println("ID: "+ super.getId());
            System.out.println("Food: " + super.getFood().getName());
            System.out.println("Date: " + super.getDate());
            System.out.println("Customer: " + super.getCustomer().getName());
            System.out.println("Delivery Fee: " + getDeliveryFee());
            System.out.println("Total Price: " + totalPrice);
            System.out.println("Status: " + super.getInvoiceStatus());
            System.out.println("Payment Type: " + PAYMENT_TYPE);
        }
    }
}
