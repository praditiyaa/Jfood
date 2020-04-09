 import java.util.ArrayList;
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

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Martabak", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 15000, FoodCategory.beverages));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Kebab", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.beverages));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Vanilla Latte", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 15000, FoodCategory.coffe));

        ArrayList<Food> food1 = new ArrayList<Food>();
        food1.add(DatabaseFood.getFoodById(1));
        food1.add(DatabaseFood.getFoodById(2));

        ArrayList<Food> food2 = new ArrayList<Food>();
        food1.add(DatabaseFood.getFoodById(3));

        System.out.print("\n");
        System.out.println("List Food Category Beverages: ");
        for (Food food : DatabaseFood.getFoodByCategory(FoodCategory.beverages))
        {
            System.out.println(food);
        }

        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Aditiya", "praditiya92@gmail.com", "mAmamiaa13", new GregorianCalendar(2020, 02, 19)));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Aditiya", "praditiya92@gmail.com", "mAmamiaa13", new GregorianCalendar(2020, 02, 19)));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Pascal", "pascal71@gmail.com", "Mamamiaa13", new GregorianCalendar(2020, 02, 19)));

        System.out.println("List Customer: ");
        for (Customer customer : DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(customer.getName());
        }

        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "MakanKuy01", 5000, 10000, true));
        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "MakanKuy02", 7000, 10000, true));

        System.out.print("\n");
        System.out.println("List Promo: ");
        for (Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo.getCode());
        }

        DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, food1, DatabaseCustomer.getCustomerById(1), 2000));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, food2, DatabaseCustomer.getCustomerById(1), DatabasePromo.getPromoById(1)));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

        DatabaseInvoice.changeInvoiceStatus(DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).getId(), InvoiceStatus.Finished);
        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, food2, DatabaseCustomer.getCustomerById(2), DatabasePromo.getPromoByCode("MakanKuy01")));
        DatabasePromo.activatePromo(1);

        System.out.println("\nList invoice:");
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            invoice.setTotalPrice();
            System.out.println(invoice);
            System.out.println();
        }
    }
}
