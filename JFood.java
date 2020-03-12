
/**
 * Class to make the object such as making the location and the food object with the data inside.
 * @author Muhammad Aditiya Pratama
 * @version 0.0.1 27/02/2020
 */
public class JFood
{
    public static void main(String[] args)
    {
        Location bornPlace=new Location("Banda Aceh", "Aceh", "Hometown");
        Seller seller1=new Seller(01,"Muhammad Aditiya Pratama", "praditiya92@gmail.com", "08130808435", bornPlace);
        Food food1=new Food(01, "Martabak", seller1, 15000, FoodCategory.beverages);
        Food food2=new Food(02, "Gorengan", seller1, 10000, FoodCategory.beverages);
        Customer customer1=new Customer(01, "JONY JONY", "khallisamrn@gmail.com", "mamamiaa", "28-02-2020");
        Promo promo1=new Promo(01, "LinkAja101", 5000, 10000, true);
        CashlessInvoice invoice1=new CashlessInvoice(01, food1, "3/3/2020", customer1, InvoiceStatus.Finished);
        CashlessInvoice invoice2=new CashlessInvoice(01, food2, "3/3/2020", customer1, InvoiceStatus.Finished);
        CashlessInvoice invoice3=new CashlessInvoice(01, food1, "3/3/2020", customer1, InvoiceStatus.Finished);
        
        
        invoice1.printData();
        invoice2.printData();
        invoice3.printData();
        
    }
}
