import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE=new ArrayList<Customer>(0);
    private static int lastId = 0;

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Customer getCustomerById(int id)
    {
        for (Customer customer : CUSTOMER_DATABASE)
        {
            if (customer.getId() == id)
            {
                return customer;
            }
        }
        return null;
    }
    public static boolean addCustomer(Customer customer)
    {
        for (Customer customer1 : CUSTOMER_DATABASE)
        {
            if(customer1.getEmail().equals(customer.getEmail()))
            {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }
    public static boolean removeCustomer(int id)
    {
        boolean customerStat = false;
        for (Customer customer : CUSTOMER_DATABASE)
        {
            if (customer.getId() == id)
            {
                CUSTOMER_DATABASE.remove(customer);
                customerStat=true;
            }
            else
            {
                customerStat=false;
            }
        }
        return customerStat;
    }
}
