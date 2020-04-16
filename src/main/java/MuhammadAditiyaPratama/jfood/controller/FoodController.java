package MuhammadAditiyaPratama.jfood.controller;

import MuhammadAditiyaPratama.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/food")
@RestController
public class FoodController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood(@PathVariable int id)
    {
        return DatabaseFood.getFoodDatabase();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Food getFoodById(@PathVariable int id)
    {
        Food foods = null;
        try
        {
            foods = DatabaseFood.getFoodById(id);
        }
        catch (FoodNotFoundException e) {
            e.getMessage();
            return null;
        }
        return foods;
    }

    @RequestMapping(value = "/seller/{sellerId}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerId)
    throws FoodNotFoundException
    {
        ArrayList<Food> seller = DatabaseFood.getFoodBySeller(sellerId);
        return seller;
    }

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category)
    throws FoodNotFoundException
    {
        ArrayList<Food> category1 = DatabaseFood.getFoodByCategory(category);
        return category1;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Food addFood(@RequestParam(value="name") String name,
                        @RequestParam(value="price") int price,
                        @RequestParam(value="category") FoodCategory category,
                        @RequestParam(value="sellerId") int sellerId)
    {
        Food food = null;
        try
        {
            food = new Food(DatabaseFood.getLastId() + 1, name, DatabaseSeller.getSellerById(sellerId), price, category);
            DatabaseFood.addFood(food);
        }
        catch (SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        return food;
    }





}
