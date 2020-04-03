import java.util.ArrayList;
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
  
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
    }
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer,  Promo promo)
    {
        super(id, foods, customer);
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
        int foodPrice=0;
        for(int i = 0; i < super.getFoods().size(); i++)
        {
            foodPrice+=super.getFoods().get(i).getPrice();
        }
        if(promo!=null&&promo.getActive()==true&&foodPrice>promo.getMinPrice())
        {
            super.totalPrice=foodPrice-promo.getDiscount();
        }
        else super.totalPrice=foodPrice;
    }
    public String toString()
    {
        String string="";
        Date date = super.getDate().getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        String date1 = format1.format(date);

        int foodPrice=0;
        for(int i = 0; i < super.getFoods().size(); i++){
            foodPrice+=super.getFoods().get(i).getPrice();
        }

        if(promo!=null&&promo.getActive()==true&&foodPrice>promo.getMinPrice())
        {
            string=
                            "ID: "+super.getId()+
                            "\nFood: "+super.getFoods()+
                            "\nDate: "+date1+
                            "\nCustomer: "+super.getCustomer().getName()+
                            "\nPromo: "+promo.getCode()+
                            "\nTotal Price: "+super.totalPrice+
                            "\nStatus: "+super.getInvoiceStatus()+
                            "\nPaymentType: "+PAYMENT_TYPE+"\n\n";

            System.out.println(string);
        }
        else
        {
            string=
                            "ID: "+super.getId()+
                            "\nFood: \n"+super.getFoods()+
                            "\nDate: "+date1+
                            "\nCustomer: "+super.getCustomer().getName()+
                            "\nTotal Price: "+super.totalPrice+
                            "\nStatus: "+super.getInvoiceStatus()+
                            "\nPaymentType: "+PAYMENT_TYPE+"\n\n";

            System.out.println(string);
        }
        return string;
    }
}
