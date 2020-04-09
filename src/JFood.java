 import java.util.ArrayList;
 import java.util.Calendar;
 import java.util.GregorianCalendar;
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

        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1,"Muhammad Aditiya Pratama", "praditiya92@gmail.com", "08130808435", bornPlace));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1,"Muhammad Aditiya Pratama", "praditiya92@gmail.com", "08130808435", bornPlace));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1,"Khallisa", "khallisa@gmail.com", "08138080436", bornPlace));

        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Martabak", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 15000, FoodCategory.beverages));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Kebab", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.beverages));
        }
        catch (SellerNotFoundException error)
        {
            System.out.println(error.getMessage());
        }

        try
        {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Aditiya1", "praditiya92@gmail.com", "mAmamiaa13", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Aditiya2", "praditiya92@gmail.com", "mAmamiaa13", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Aditiya3", "pascal71@gmail.com", "Mamamiaa13", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Aditiya4", "praditiya91@gmail.com", "mAmamiaa13", Calendar.getInstance()));
        }
        catch (EmailAlreadyExistsException error)
        {
            System.out.println(error.getMessage());
        }

        try
        {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "MakanKuy01", 7000, 10000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "MakanKuy01", 7000, 10000, true));
        }
        catch (PromoCodeAlreadyExistsException error)
        {
            System.out.println(error.getMessage());
        }
        try
        {
            DatabaseCustomer.removeCustomer(3);
        }
        catch (CustomerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            DatabasePromo.removePromo(2);
        }
        catch (PromoNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseFood.removeFood(3);
        } catch (FoodNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("~~~~~Database Promo~~~~~");

        for(Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo.toString());
        }
    }
}
