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
    {
        Seller dummy = null;
        for (int i = 0; i < SELLER_DATABASE.size(); i++) {
            Seller seller = SELLER_DATABASE.get(i);
            if (seller.getId() == id) {
                dummy=seller;
            } else {
                dummy=seller;
            }
        }
        return dummy;
    }

    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId++;
        return true;
    }

    public static boolean removeSeller(int id)
    {
        boolean sellerStat = false;
        for (int i = 0; i < SELLER_DATABASE.size(); i++) {
            Seller seller = SELLER_DATABASE.get(i);
            if (seller.getId() == id) {
                SELLER_DATABASE.remove(seller);
                sellerStat=true;
            } else {
                sellerStat=false;
            }
        }
        return sellerStat;
    }
}
