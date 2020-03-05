
/**
 * Enumeration class FoodCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum FoodCategory
{
    beverages("Beverages"), coffe("Coffe"), western("Western"), snacks("Snacks"), rice("Rice"), noodles("Noodles"), bakery("Bakery"), japanese("Japanese");
    
    private String category;
    
    FoodCategory(String name)
    {
       this.category=name;
    }
    
    public String toString()
    {
        return this.category;
    }
}
