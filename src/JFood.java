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
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Martabak", DatabaseSeller.getSellerById(1), 15000, FoodCategory.beverages));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Kebab", DatabaseSeller.getSellerById(1), 10000, FoodCategory.beverages));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Vanilla Latte", DatabaseSeller.getSellerById(1), 15000, FoodCategory.coffe));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Aditiya", "praditiya92@gmail.com", "mAmamiaa13", new GregorianCalendar(2020, 02, 19)));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Aditiya", "praditiya92@gmail.com", "mAmamiaa13", new GregorianCalendar(2020, 02, 19)));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Pascal", "pascal71@gmail.com", "Mamamiaa13", new GregorianCalendar(2020, 02, 19)));
        DatabasePromo.addPromo(new Promo(01, "LinkAja101", 5000, 10000, true));
        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), InvoiceStatus.Ongoing, DatabasePromo.getPromoById(1)));


        System.out.println("Customer:");
        System.out.println(DatabaseCustomer.getCustomerDatabase()+"\n");
        System.out.println("Beverages:");
        System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.beverages)+"\n");
        System.out.println("Coffee:");
        System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.coffe)+"\n");
        DatabaseInvoice.getInvoiceByCustomer(1)






    }
}
