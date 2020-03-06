
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
        Food food1=new Food(01, "Lasagna", seller1, 15000, FoodCategory.beverages);
        Customer customer1=new Customer(01, "Khallisa", "khallisamrn@gmail.com", "mamamiaa", "28-02-2020");
        Invoice invoice1=new Invoice(01, 01, "28-02-2020", customer1, 15000, InvoiceStatus.Finished);
        
        
        invoice1.printData();
        
    }
}
