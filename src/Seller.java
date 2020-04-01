
/**
 * Class to put data of the seller such as id, name, email, phone number, and location of the seller data.
 * @author Muhammad Aditiya Pratama
 * @version 0.0.1 27/02/2020
 */
public class Seller
{
    /**
     * using private modifier so only this class can access this.
     * there's 5 instance each with its own mean like id for the seller id, name for the seller name,
     * email for the seller email, and location for the seller location.
     * for the location instance it's connected to the location class to gain it's data.
     */
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Seller.
     * @param id is for initializing the id input.
     * @param name is for initializing the name input.
     * @param email is for initializing the email input.
     * @param phoneNumber is for initalizing the phone number input.
     * @param location is for initializing the location input.
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
