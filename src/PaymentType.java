
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PaymentType
{
    cashless("Cashless"), cash("Cash");
    
    private String payment;
    
    PaymentType(String payment)
    {
        this.payment=payment;
    }
    
    public String toString()
    {
        return this.payment;
    }
    
}
