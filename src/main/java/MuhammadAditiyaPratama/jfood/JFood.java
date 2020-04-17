package MuhammadAditiyaPratama.jfood;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JFood {

    public static void main(String[] args)
    {
        Location location1 = new Location("Bireuen", "Aceh", "Place Born");
        Location location2 = new Location("Balikpapan", "Kalimantan Timur", "HomeTown");
        Location location3 = new Location("BSD", "Tanggerang Selatan", "Home");

        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Aditiya", "praditiya92@gmail.com", "081280808435", location1));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Khallisa", "khallisa92@gmail.com", "081280808437", location2));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Pratama", "pitiya92@gmail.com", "081280808438", location3));

        try {DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Ice Cafe Latte", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 15000, FoodCategory.coffe));}
        catch (SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try {DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Ice Vanilla Latte", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.coffe));}
        catch (SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try {DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Ice Chocolate Latte", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 18000, FoodCategory.coffe));}
        catch (SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try {DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "French Fries", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 25000, FoodCategory.beverages));}
        catch (SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }



        SpringApplication.run(JFood.class, args);
    }

}