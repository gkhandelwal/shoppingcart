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
public abstract class Store extends Observable
 {
	public String name;
	public String storeId; 
	//int items;
	int  customer;
        Vector list;
        Vector list1;
        Vector list5;
        Store var;
        abstract String getname();
        //ShoppingCart abc;
	abstract void enter(Customer c);
	abstract void exit(Customer c);
	Enumeration cust_list;
	Enumeration items12;
	abstract void addtocart(ShoppingCart cart, Item item);
	abstract void removefromcart(ShoppingCart cart, Item item);
}