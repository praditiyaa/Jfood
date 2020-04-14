package MuhammadAditiyaPratama.jfood;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
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
    private SimpleDateFormat tgl = new SimpleDateFormat("dd MMMM yyyy");
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
       setEmail(email);
       setPassword(password);
       this.joinDate=joinDate;
    }
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
       this.id = id;
       this.name = name;
       setEmail(email);
       setPassword(password);
       setJoinDate(year,month,dayOfMonth);
    }
    public Customer(int id, String name, String email, String password)
    {
       this.id=id;
       this.name=name;
       setEmail(email);
       setPassword(password);
       this.joinDate=Calendar.getInstance();
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
        return joinDate;
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
        String regex="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        if(matcher.matches())
        {
            this.email=email;
        }
        else 
        {
            this.email="";   
        }
    }
    public void setPassword(String password)
    {
        String passwordRegex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern passwordPattern=Pattern.compile(passwordRegex);
        Matcher passwordMatcher=passwordPattern.matcher(password);
        if(passwordMatcher.matches())
        {
            this.password=password;
        }
        else 
        {
            this.password="";
        }
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
        String date = "";
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd MMMM yyyy");
        if(getJoinDate() != null)
        {
            date = simpleDate.format(joinDate.getTime());
        }
        return
            "\nID: " + getId() +
            "\nName: " + getName() +
            "\nEmail: " + getEmail() +
            "\nPassword: " + getPassword() +
            "\nJoin Date: " + date +"\n" ;

        }

}