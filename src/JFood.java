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

        try {DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Martabak", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 15000, FoodCategory.beverages));}
        catch (SellerNotFoundException error)
        {System.out.println(error.getMessage());}
        try {DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Kebab", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.beverages)); }
        catch (SellerNotFoundException error)
        {System.out.println(error.getMessage());}

        try {DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Aditiya1", "praditiya92@gmail.com", "mAmamiaa13", Calendar.getInstance()));}
        catch (EmailAlreadyExistsException error)
        {System.out.println(error.getMessage());}
        try {DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Aditiya2", "praditiya92@gmail.com", "mAmamiaa13", Calendar.getInstance()));}
        catch (EmailAlreadyExistsException error)
        {System.out.println(error.getMessage());}
        try {DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Aditiya3", "pascal71@gmail.com", "Mamamiaa13", Calendar.getInstance()));}
        catch (EmailAlreadyExistsException error)
        {System.out.println(error.getMessage());}
        try {DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Aditiya4", "praditiya91@gmail.com", "mAmamiaa13", Calendar.getInstance())); }
        catch (EmailAlreadyExistsException error)
        {System.out.println(error.getMessage());}

        try {DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "MakanKuy01", 7000, 10000, false));}
        catch (PromoCodeAlreadyExistsException error)
        {System.out.println(error.getMessage());}
        try {DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "MakanKuy01", 7000, 10000, true)); }
        catch (PromoCodeAlreadyExistsException error)
        {System.out.println(error.getMessage());}

        try {DatabaseCustomer.removeCustomer(3); }
        catch (CustomerNotFoundException e)
        {System.out.println(e.getMessage());}

        try {DatabasePromo.removePromo(2);}
        catch (PromoNotFoundException e)
        {System.out.println(e.getMessage());}

        try {DatabaseFood.removeFood(3); }
        catch (FoodNotFoundException e)
        {System.out.println(e.getMessage());}


        System.out.println("~~~~~Database Promo~~~~~");

        for(Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo.toString());
        }


        ArrayList<Food> food1 = new ArrayList<Food>();
        ArrayList<Food> food2 = new ArrayList<Food>();
        ArrayList<Food> food3 = new ArrayList<Food>();

        try {DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, food1, DatabaseCustomer.getCustomerById(1), 2000));}
        catch (OngoingInvoiceAlreadyExistsException | CustomerNotFoundException e)
        {System.out.println(e.getMessage());}

        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size() - 1).setTotalPrice();

        try
        {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, food2, DatabaseCustomer.getCustomerById(1), 2000));
            DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size() - 1).setTotalPrice();
        }
        catch(CustomerNotFoundException | OngoingInvoiceAlreadyExistsException e)
        {System.out.println(e.getMessage());}

        try
        {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, food3, DatabaseCustomer.getCustomerById(1)));
            DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size() - 1).setTotalPrice();
        }
        catch(CustomerNotFoundException | OngoingInvoiceAlreadyExistsException e)
        {System.out.println(e.getMessage());}


        for(Invoice invoice: DatabaseInvoice.getInvoiceDatabase()){
            Thread calculate = new Thread(new PriceCalculator(invoice));
            calculate.start();
        }






    }
}
