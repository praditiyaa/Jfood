package MuhammadAditiyaPratama.jfood;
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
    public String toString()
    {
        return
        "\nId : "+id+
        "\nName : "+name+
        "\nSeller : "+seller.getName()+
        "\nCity : "+seller.getLocation().getCity()+
        "\nPrice : "+price+
        "\nCategory : "+category +"\n";
    }
}
