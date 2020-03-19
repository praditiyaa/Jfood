import java.util.Calendar;
import java.util.*;
import java.text.*;
import java.util.regex.*;
/**
 * Class to make the object such as making the location and the food object with the data inside.
 * @author Muhammad Aditiya Pratama
 * @version 0.0.1 27/02/2020
 */
public class JFood
{
    public static void main(String[] args)
    {
        Location bornPlace=new Location("Banda Aceh", "Aceh", "Hometown");
        Seller seller1=new Seller(01,"Muhammad Aditiya Pratama", "praditiya92@gmail.com", "08130808435", bornPlace);
        Food food1=new Food(01, "Martabak", seller1, 15000, FoodCategory.beverages);
        Food food2=new Food(02, "Gorengan", seller1, 9000, FoodCategory.beverages);
        Customer customer1=new Customer(01, "Aditiya", "praditiya92gmail.com", "mamamiaa13", 19, 03, 2020);
        Customer customer2=new Customer(02, "Pratama", "khallisamrn@gmail.com", "Mamamiaa13", 2020, 03, 19);
        Customer customer3=new Customer(03, "Muhammad", "muhammad.aditiya71@gmail.com", "Mamamiaa13");
        Promo promo1=new Promo(01, "LinkAja101", 5000, 10000, true);
        //CashlessInvoice invoice1=new CashlessInvoice(1, food1, "3/3/2020", customer1, InvoiceStatus.Finished);
        //CashlessInvoice invoice2=new CashlessInvoice(2, food2, "3/3/2020", customer1, InvoiceStatus.Finished, promo1);
        //CashlessInvoice invoice3=new CashlessInvoice(3, food1, "3/3/2020", customer1, InvoiceStatus.Finished, promo1);
        //CashInvoice invoice4= new CashInvoice(4, food1, "3/3/2020", customer1, InvoiceStatus.Finished);
        //CashInvoice invoice5= new CashInvoice(5, food1, "3/3/2020", customer1, InvoiceStatus.Finished, 10000);
        //invoice1.setTotalPrice();
        //invoice2.setTotalPrice();
        //invoice3.setTotalPrice();
        //invoice4.setTotalPrice();
        //invoice5.setTotalPrice();
        //invoice1.printData();
        //invoice2.printData();
        //invoice3.printData();
        //invoice4.printData();
        //invoice5.printData();
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
    }
}
