/**
 * Class to put data of the such as id, name, email, password, and join date of the customer.
 * @author Muhammad Aditiya Pratama
 * @version 0.0.1 27/02/2020
 */
public class Customer
{
    /**
     * using private modifier so only this class can access this.
     * there's 5 instance each with its own mean like id for the customer id, name for the customer name,
     * email for the customer email, password is for the customer password and joinDate is for the date
     * when the customer join.
     */
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;
    /**
     * Constructor for objects of class Customer
     * @param id is for initializing the customer id input.
     * @param name is for initializing the customer name input.
     * @param email is for initializing the customer email input.
     * @param password is for initalizing the customer password input.
     * @param joinDate is for initializing the date when the customer join input.
     */
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.joinDate=joinDate;
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
    public String getPassword()
    {
        return this.password;
    }
    public String getJoinDate()
    {
        return this.joinDate;
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
    public void setPassword(String password)
    {
        this.password=password;
    }
    public void setJoinDate(String joinDate)
    {
        this.joinDate=joinDate;
    }
    public void printData()
    {
        System.out.println(name);
    }
}