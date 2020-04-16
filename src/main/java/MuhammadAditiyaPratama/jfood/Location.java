package MuhammadAditiyaPratama.jfood;
/**
 * Class to put the location data such as province, description, and city data.
 * @author Muhammad Aditiya Pratama
 * @version 0.0.1 27/02/2020
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;
    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
     this.city=city;
     this.province=province;
     this.description=description;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public String getProvince()
    {
        return this.province;
    }
    public String getCity()
    {
        return this.city;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setProvince(String province)
    {
        this.province=province;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    //public void printData()
    {
        System.out.println(province);
    }
    public String toString()
    {
        return "Province = "+province+"\nCity = "+city+"\nDescription = "+description;
    }
}
