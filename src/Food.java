
/**
 * Class to put food data such as id, name, seller, price, and category of the food.
 * @author Muhammad Aditiya Pratama
 * @version 0.0.1 27/02/2020
 */
public class Food
{
    private int id;
    private String name;
    private Seller seller;
    private int price;
    private FoodCategory category;
    /**
     * Constructor for objects of class Food
     * there's 5 instance each with its own function like id for the food id, name for the food name,
     * seller for the food seller, price is for the food price and category is for the food category data.
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        this.id=id;
        this.name=name;
        this.seller=seller;
        this.price=price;
        this.category=category;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public Seller getSeller()
    {
        return this.seller;
    }
    public int getPrice()
    {
        return this.price;
    }
    public FoodCategory getCategory()
    {
        return this.category;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSeller(Seller seller)
    {
        this.seller=seller;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public void setCategory(FoodCategory category)
    {
        this.category=category;
    }
    //public void printData()
    //{
        //System.out.println("====================FOOD====================");
        //System.out.println("ID: "+ id);
        //System.out.println("Seller: " + seller.getName());
        //System.out.println("City: " + seller.getLocation().getCity());
        //System.out.println("Price: " + price);
        //System.out.println("Category: " + category);
    //}
    public String toString()
    {
        return "Id = "+id+"\n Name = "+name+"\n Seller = "+seller.getName()+""+seller.getLocation().getCity()+"\nPrice = "+price+"\nCategory = "+category;
    }
}
