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
        Customer dummy = null;
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer customer = CUSTOMER_DATABASE.get(i);
            if (customer.getId() == id) {
                dummy=customer;
            } else {
                dummy=null;
            }
        }
        return dummy;
    }
    public static boolean addCustomer(Customer customer)
    {
        Customer dummy=null;
        boolean custat=false;
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++)
        {
            Customer customer1 = CUSTOMER_DATABASE.get(i);
            if(customer1.getEmail() != customer.getEmail())
            {
                CUSTOMER_DATABASE.add(customer1);
                lastId ++;
                custat=true;
            }
            else
            {
                custat=false;
            }
        }
        return custat;
    }
    public static boolean removeCustomer(int id)
    {
        boolean customerStat = false;
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer customer = CUSTOMER_DATABASE.get(i);
            if (customer.getId() == id) {
                CUSTOMER_DATABASE.remove(customer);
                customerStat=true;
            } else {
                customerStat=false;
            }
        }
        return customerStat;
    }
}
