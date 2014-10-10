/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author gaurav
 */
import java.util.*;
public class ShoeStore extends Store
{       
 	 public ShoeStore()
	{
		
                Vector list = new Vector();
                Vector list1 = new Vector();
                Vector list5 = new Vector();
                //abc=new ShoppingCart();
	}
	void enter(Customer c)
	{
            
            list.addElement(c);
	}
	void exit(Customer c)
	{

		list.removeElement(c);
	}
	void addtocart(ShoppingCart cart,Item i)
	{
            cart.addItem(i);
	}
	void removefromcart(ShoppingCart cart,Item i)
	{
            cart.removeItem(i);
	}
	Enumeration customers()
	{
		cust_list=list.elements();
		System.out.println("\ncustomers are\n");
		while(cust_list.hasMoreElements())
		{
			System.out.println(cust_list.nextElement());
		}
                                        return(cust_list);

	}
        void additems(Item i)
	{
		list5.addElement(i);
		notifyObservers(i.getName());
	}
	void items()
	{
		items12=list1.elements();
		System.out.println("\nitemss are\n");
		while(items12.hasMoreElements())
		{
			System.out.println(items12.nextElement());
		}

	}
        /*Store instance()
        {
            var=new var();
            return var;
        }*/
        String getname()
    {
            return("Hello i am a shoestore");
        }
}
