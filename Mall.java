/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author gaurav
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.

public class Mall {
	private static Mall uniqueInstance = null;
	public static synchronized Mall instance(){
		if(uniqueInstance == null)
			uniqueInstance = new Mall();
		return uniqueInstance;
	}
	public Store bookStore;
	public Store shoeStore;
	public Store gameStore;
        Vector lst=new Vector();
	private String Mall(){
	
		//shoeStore=ShoeStore.instance();
		//gameStore=GameStore.instance();
               // Vector lst=new Vector();
		return "G&N Mall";
	}
        void enter(Customer c)
    {
            lst.add(c);
        }
            void exit(Customer c)
    {
            lst.remove(c);
        }
            Vector displayCustomers()

    {
                return lst;


            }
            ShoppingCart getshopingcart()
    {
                ShoppingCart a=new ShoppingCart();
                return a;
            }
	public ArrayList getStoreList()
	{
		ArrayList list=new ArrayList();
		list.add("book store");
		list.add("game store");
		list.add("shoe store");
		return list;
	}

       
}
