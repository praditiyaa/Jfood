
/**
 * Write a description of class Seller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seller
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Seller
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
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
    public String getEmail()
    {
        return this.email;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public Location getLocation()
    {
        return this.location;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void setLocation(Location location)
    {
        this.location=location;
    }
    public void printData()
    {
        System.out.println(name);
    }
}
