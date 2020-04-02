import java.util.ArrayList;

/**
 * Write a description of class DatabasePromo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabasePromo
{
    private static ArrayList<Promo> PROMO_DATABASE=new ArrayList<Promo>(0);
    private static int lastId = 0;

    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Promo getPromoById(int id)
    {
        Promo dummy = null;
        for (int i = 0; i < PROMO_DATABASE.size(); i++) {
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getId() == id) {
                dummy=promo;
            } else {
                dummy=null;
            }
        }
        return dummy;
    }
    public static Promo getPromoByCode(String code)
    {
        Promo dummy = null;
        for (int i = 0; i < PROMO_DATABASE.size(); i++) {
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getCode() == code) {
                dummy=promo;
            } else {
                dummy=null;
            }
        }
        return dummy;
    }
    public static boolean addPromo(Promo promo)
    {
        Promo dummy=null;
        boolean custat=false;
        for (int i = 0; i < PROMO_DATABASE.size(); i++)
        {
            Promo promo1 = PROMO_DATABASE.get(i);
            if(promo1.getCode() != promo.getCode())
            {
                PROMO_DATABASE.add(promo1);
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
    public static boolean activatePromo(int id)
    {
        for (int i = 0; i < PROMO_DATABASE.size(); i++)
        {
            if(id==PROMO_DATABASE.get(i).getId())
            {
                PROMO_DATABASE.get(i).setActive(true);
                return true;
            }
        }
        return false;
    }
    public static boolean deactivatePromo(int id)
    {
        for (int i = 0; i < PROMO_DATABASE.size(); i++)
        {
            if(id==PROMO_DATABASE.get(i).getId())
            {
                PROMO_DATABASE.get(i).setActive(false);
                return true;
            }
        }
        return false;
    }
    public static boolean removePromo(int id)
    {
        boolean promoStat = false;
        for (int i = 0; i < PROMO_DATABASE.size(); i++) {
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                promoStat=true;
            } else {
                promoStat=false;
            }
        }
        return promoStat;
    }
}

