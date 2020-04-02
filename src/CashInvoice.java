import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
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
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
        
    }
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee)
    {
        super(id, foods, customer);
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
        int foodPrice=0;
        for(int i = 0; i < super.getFoods().size(); i++)
        {
            foodPrice+=super.getFoods().get(i).getPrice();
        }
        if(deliveryFee>0)
        {
            super.totalPrice=foodPrice+deliveryFee;
        }
        else
        {
            super.totalPrice=foodPrice;
        }
    }
    public String toString()
    {
        String string="";
        Date date = super.getDate().getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        String date1 = format1.format(date);

        if(deliveryFee>0)
        {
            string=
                    "ID: "+super.getId()+
                            "\nFood: "+super.getFoods()+
                            "\nDate: "+date1+
                            "\nCustomer: "+super.getCustomer().getName()+
                            "\nDelivery Fee: "+deliveryFee+
                            "\nTotal Price: "+super.totalPrice+
                            "\nStatus: "+super.getInvoiceStatus()+
                            "\nPaymentType: "+PAYMENT_TYPE+"\n\n";

            System.out.println(string);
        }
        else
        {
            string=
                    "ID: "+super.getId()+
                            "\nFoods: "+super.getFoods()+
                            "\nDate: "+date1+
                            "\nCustomer: "+super.getCustomer().getName()+
                            "\nDelivery Fee: 0"+
                            "\nTotal Price: "+super.totalPrice+
                            "\nStatus: "+super.getInvoiceStatus()+
                            "\nPaymentType: "+PAYMENT_TYPE+"\n\n";

            System.out.println(string);
        }
        return string;
    }
}
