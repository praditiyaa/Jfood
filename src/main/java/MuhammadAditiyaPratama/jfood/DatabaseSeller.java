package MuhammadAditiyaPratama.jfood;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseSeller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseSeller
{
    private static ArrayList<Seller> SELLER_DATABASE=new ArrayList<Seller>(0);
    private static int lastId = 0;


    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Seller getSellerById(int id)
    throws SellerNotFoundException
    {
        for (Seller seller : SELLER_DATABASE)
        {
            if (seller.getId() == id)
            {
                return seller;
            }
        }
        throw new SellerNotFoundException(id);
    }

    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId++;
        return true;
    }

    public static boolean removeSeller(int id)
    throws SellerNotFoundException
    {
        for (int i = 0; i < SELLER_DATABASE.size(); i++) {
            Seller seller = SELLER_DATABASE.get(i);
            if (seller.getId() == id) {
                SELLER_DATABASE.remove(seller);
                return true;
            }
        }
        throw new SellerNotFoundException(id);
    }
}
