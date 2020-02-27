
/**
 * Write a description of class JFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JFood
{
    public static void main(String[] args)
    {
        Location location1=new Location("Balikpapan", "Banda Aceh", "Hometown");
        Seller seller1=new Seller(01, "Raditiya", "praditiya92@gmail.com", "081380808435", location1); 
        Food food=new Food(01, "Ayam", seller1, 10000, "Makanan");
        Customer customer1=new Customer(01, "Raya", "rayaaa1212@gmail.com", "mamamiaa", "12-12-2012");
        Invoice invoice1=new Invoice(01, 01, "12-12-2012", customer1, 10000);
    }
}
