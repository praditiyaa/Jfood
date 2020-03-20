import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class CashlessInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.cashless;
    private Promo promo;
  
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
    }
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, customer, invoiceStatus);
        this.promo=promo;
    }
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    public Promo getPromo()
    {
        return promo;
    }
    public void setPromo(Promo promo)
    {
        this.promo=promo;
    }
    public void setTotalPrice()
    {
        if (promo !=null && promo.getActive() == true && promo.getMinPrice() < getFood().getPrice())
        {
            super.totalPrice = getFood().getPrice() - promo.getDiscount();
        }
        else
        {
            super.totalPrice = getFood().getPrice();
        }
    }
    public String toString()
    {
        String string = "";
        if (promo !=null && promo.getActive() == true && promo.getMinPrice() < getFood().getPrice())
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now(); 
            string=
            ("================INVOICE================" +
            "\nID: " +super.getId() +
            "\nFood: " +super.getFood().getName() +
            "\nDate: " +dtf.format(now)+
            "\nCustomer: " +super.getCustomer().getName() +
            "\nTotal Price: " +getFood().getPrice() +
            "\nStatus: " +super.getInvoiceStatus() +
            "\nPayment Type: " +PAYMENT_TYPE + "\n");
        }
        else
        {
            DateTimeFormatter skrg = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now(); 
            string=
            ("================INVOICE================" +
            "\nID: " +super.getId() +
            "\nFood: " +super.getFood().getName() +
            "\nDate: " +skrg.format(now)+ 
            "\nCustomer: " +super.getCustomer().getName() +
            "\nPromo : " + getPromo().getCode() +
            "\nTotal Price: " +super.getTotalPrice() +
            "\nStatus: " +super.getInvoiceStatus() +
            "\nPayment Type: " +PAYMENT_TYPE + "\n");
        }
       System.out.println(string);
       return string;
    }
}
