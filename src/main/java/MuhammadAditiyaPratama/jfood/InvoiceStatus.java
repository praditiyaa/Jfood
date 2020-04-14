package MuhammadAditiyaPratama.jfood;
public enum InvoiceStatus
{
    Ongoing("Ongoing"), Finished("Finished"), Cancelled("Cancelled");
    
    private String invoice;
    
    InvoiceStatus(String status)
    {
        this.invoice=status;
    }
    public String toString()
    {
        return this.invoice;
    }
}
