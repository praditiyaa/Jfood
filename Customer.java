import java.util.Calendar;
import java.util.*;
import java.text.*;
import java.util.regex.*;
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
    private Calendar joinDate;
    /**
     * Constructor for objects of class Customer
     * @param id is for initializing the customer id input.
     * @param name is for initializing the customer name input.
     * @param email is for initializing the customer email input.
     * @param password is for initalizing the customer password input.
     * @param joinDate is for initializing the date when the customer join input.
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.joinDate=joinDate;
    }
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        joinDate=new GregorianCalendar(year, month, dayOfMonth);
    }
    public Customer(int id, String name, String email, String password)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
    }

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
    public Calendar getJoinDate()
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
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        this.email = (m.matches())?email: null;
    }
    public void setPassword(String password)
    {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern passwordPattern = Pattern.compile(passwordRegex);
        Matcher passwordMatcher = passwordPattern.matcher(password);
        this.password = (passwordMatcher.matches())?password: null;
    }
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate=joinDate;
    }
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        joinDate=new GregorianCalendar(year, month, dayOfMonth);
    }
    public String toString()
    {
       if(joinDate != null)
       {
           return "Id =  "+id+"\nName = "+name+"\nEmail = "+email+"\nPassword = "+password+"\nDate = "+
           joinDate.get(Calendar.DAY_OF_MONTH)+"/"+
           joinDate.get(Calendar.MONTH)+"/"+
           joinDate.get(Calendar.YEAR);
       }
       else
       {    
           return "ID = "+id+"\nName = "+name+"\nEmail = "+email+"\nPassword = "+password;
       }
    }
}