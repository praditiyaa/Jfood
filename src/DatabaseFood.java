import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

/**
 * Class for the food database so the user can call a function such as add food, remove food, get food, and get list of food.
 * @author Muhammad Aditiya Pratama
 * @version 0.0.1 27/02/2020
 */
public class DatabaseFood
{
    private static ArrayList<Food> FOOD_DATABASE=new ArrayList<Food>();
    private static int lastId = 0;

    public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Food getFoodById(int id)
    {
        for (Food foods : FOOD_DATABASE)
        {
            if (foods.getId() == id)
            {
                return foods;
            }
        }
        return null;
    }
    public static ArrayList<Food> getFoodBySeller(int sellerId)
    {
        ArrayList<Food> listSeller= new ArrayList<>();
        for (Food foods : FOOD_DATABASE)
        {
            if (foods.getSeller().getId() == sellerId)
             {
                listSeller.add(foods);
             }
        }
        return listSeller;
    }
    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> listCat= new ArrayList<>(0);
        for (Food foods : FOOD_DATABASE)
        {
            if (foods.getCategory() == category)
            {
                listCat.add(foods);
            }
        }
        return listCat;
    }
    public static boolean addFood(Food food)
    {
        FOOD_DATABASE.add(food);
        lastId++;
        return true;
    }
    public static boolean removeFood(int id)
    {
        boolean foodStat = false;
        for (int i = 0; i < FOOD_DATABASE.size(); i++) {
            Food foods = FOOD_DATABASE.get(i);
            if (foods.getId() == id) {
                FOOD_DATABASE.remove(foods);
                foodStat=true;
            } else {
                foodStat=false;
            }
        }
        return foodStat;
    }

}
