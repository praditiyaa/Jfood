
/**
 * Class to put invoice data such as id, id food, date, total price and the custumer data.
 * @author Muhammad Aditiya Pratama
 * @version 0.0.1 27/02/2020
 */
public abstract class Invoice
{
    /**
     * using private modifier so only this class can access this.
     * there's 5 instance each with its own mean like id for the invoice id, idfood for the food id,
     * date for the invoice date,totalPrice is for the total price and Customer is for the customer data.
     * for the customer instance it's connected to the customer class to gain it's data.
     */
    private int id;
    private Food food;
    private String date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    /**
     * Constructor for objects of class Invoice.
     * @param id is for initializing the invoice id input.
     * @param idFood is for initializing the food id input.
     * @param date is for initializing the invoice date input.
     * @param customer is for initalizing the customer input.
     * @param totalPrice is for initializing the total price input.
     */
    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        this.id=id;
        this.food=food;
        this.date=date;
        this.customer=customer;
        this.invoiceStatus=invoiceStatus;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return this.id;
    }
    public Food getFood()
    {
        return this.food;
    }
    public String getDate()
    {
        return this.date;
    }
    public int getTotalPrice()
    {
        return this.totalPrice;
    }
    public Customer getCustomer()
    {
        return this.customer;
    }
    public abstract PaymentType getPaymentType();
    public InvoiceStatus getInvoiceStatus()
    {
        return this.invoiceStatus;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setFood(Food food)
    {
        this.food=food;
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    public abstract void setTotalPrice();
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.invoiceStatus=invoiceStatus;
    }
    public abstract void printData();

}
