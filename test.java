/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.*;
/**
 *
 * @author gaurav
 */
public class test {
    public static void main(String args[])
    {
       Customer a = new Customer();
			a.firstName("gaurav");
			a.lastName("kh");
			a.address("a");
			a.phone("ph");
                        Mall m1=new Mall();
                        m1.enter(a);
        System.out.println("\nCustomers in the mall are:\n");
			//Mall mall1 = new Mall();
			Vector list1 = m1.displayCustomers();
			//ListIterator ev1 = list1.listIterator();
                        Enumeration ev1 = list1.elements();
			while (ev1.hasMoreElements()){
                            //i=ev1.next();

                            Customer c1= (Customer)ev1.nextElement();
                             System.out.println(c1.firstn());
                            //cust_list.setText(cust_list.getText()+" \n "+c1.firstn()+" \n "+" \n ");
                        //cust_list.setText(cust_list.getText()+" \n "+ev1.nextElement()+" \n "+" \n ");
                              //System.out.println(ev1.nextElement());
			}

    }

}
