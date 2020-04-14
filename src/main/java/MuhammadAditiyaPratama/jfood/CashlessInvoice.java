import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
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
        super.totalPrice=0;
        for(Food foods : getFoods())
        {
            if (promo != null && foods.getPrice() >= promo.getMinPrice() && promo.getActive())
            {
                super.totalPrice = super.totalPrice - promo.getDiscount();
            }
            else
            {
                super.totalPrice = super.totalPrice + foods.getPrice();
            }
        }

    }
    public String toString()
    {
        String string="";
        int foodPrice=0;
        for(int i = 0; i <= super.getFoods().size(); i++){
            foodPrice+=super.getFoods().get(i).getPrice();
        }

        if(promo!=null&& promo.getActive() &&foodPrice>promo.getMinPrice())
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now();
            string=
                    ("================Invoice================" + "\n" +
                            "ID: "+super.getId()+
                            "\nFood: "+super.getFoods()+
                            "\nDate: "+dtf.format(now)+
                            "\nCustomer: "+super.getCustomer().getName()+
                            "\nPromo: "+promo.getCode()+
                            "\nTotal Price: "+super.totalPrice+
                            "\nStatus: "+super.getInvoiceStatus()+
                            "\nPaymentType: "+ getPaymentType() +"\n\n");
        }
        else
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now();
            string=
                    ("================Invoice================" + "\n" +
                            "ID: "+super.getId()+
                            "\nFood: \n"+super.getFoods()+
                            "\nDate: "+dtf.format(now)+
                            "\nCustomer: "+super.getCustomer().getName()+
                            "\nTotal Price: "+super.totalPrice+
                            "\nStatus: "+super.getInvoiceStatus()+
                            "\nPaymentType: "+getPaymentType()+"\n\n");
        }
        System.out.println(string);
        return string;
    }
}
