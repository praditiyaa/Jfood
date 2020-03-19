

public class CashlessInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.cashless;
    private Promo promo;
  
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
    }
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, date, customer, invoiceStatus);
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
    public void printData()
    {
        if (promo !=null && promo.getActive() == true && promo.getMinPrice() < getFood().getPrice())
        {
            System.out.println("====================FOOD====================");
            System.out.println("ID: "+ super.getId());
            System.out.println("Food: " + super.getFood().getName());
            System.out.println("Date: " + super.getDate());
            System.out.println("Customer: " + super.getCustomer().getName());
            System.out.println("Promo: " + promo.getCode());
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
            //System.out.println("Promo: " + promo.getCode());
            System.out.println("Total Price: " + totalPrice);
            System.out.println("Status: " + super.getInvoiceStatus());
            System.out.println("Payment Type: " + PAYMENT_TYPE);
        }
    }
}
