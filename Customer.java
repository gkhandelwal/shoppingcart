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
import java.lang.*;
public class Customer extends Person implements Observer
{
	private Mall mall;
        Customer f1;
        //String i;
	public void printlist()
	{
		mall=Mall.instance();
		Iterator iter=(Iterator)mall.getStoreList();
		while(iter.hasNext())
		{
			Store store=(Store)iter.next();
			System.out.println(store.getname());
		}
	}
        Customer aaa(String f,String l)
    {
            Mall m1=new Mall();
            Customer c2 = new Customer();
           // Vector l1=new Vector();
            Vector l1 = m1.displayCustomers();
			//ListIterator ev1 = list1.listIterator();
                        Enumeration ev1 = l1.elements();
			while (ev1.hasMoreElements()){
                            //i=ev1.next();

                            Customer c1= (Customer)ev1.nextElement();

                             //System.out.println(c1.firstn());
                           if(((c1.firstn()).equals(f))&&((c1.lastn()).equals(l)))
                              { 
								  c2=c1;
								  System.out.println(c2.firstn());}

                           
                        //cust_list.setText(cust_list.getText()+" \n "+ev1.nextElement()+" \n "+" \n ");
			}
                        return c2;
                       // return NULL;
        }

	public Customer()
	{
		mall=Mall.instance();

	}
    void firstName(String fname)
    {
     first=fname;
    }
    String firstn()
    {
        return (first);
    }
     String lastn()
    {
        return (last);
    }
      String addressn()
    {
        return (address);
    }
       String phonen()
    {
        return (phone);
    }
    
void lastName(String la){
    last=la;
}
	 void address(String add){
             address=add;
    }

	 void phone(String ph)
    {
             phone=ph;
         }
            Customer getcustomer()
    {
          return f1;
        }

 public void update(Observable obj, Object arg) {
 if (arg instanceof String) {
     String i=(String) arg;
   System.out.println("item is added to store..the added item is::::" + i);
  } else {
   System.out.println("No more item added");
  }
 }
}
