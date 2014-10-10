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
import java.lang.Throwable;

public class ShoppingCart{
	private ArrayList cartItems;
	public ShoppingCart(){
		cartItems = new ArrayList();
	}
	public void addItem(Item i){
		cartItems.add(i);
	}
	public void removeItem(Item i) 
               // throws ItemNotFoundException
        {
		if (!cartItems.remove(i)){
			//throw new ItemNotFoundException();
		}
	}
	public int itemCount(){
		return cartItems.size();
	}
	public void empty(){
		cartItems = new ArrayList();
	}
	public boolean isEmpty() {
		return (cartItems.size() == 0);
	}
	public void clear()
	{	/*int a;
		a=cartItems.size();
		for(int i=0;i<a;i++)*/
            Iterator a=cartItems.listIterator();
            while(a.hasNext())
            {a.next();
                a.remove();
            }
	}
	public double Balance(){
		Iterator it = cartItems.iterator();
		double bal = 0.00;
		while (it.hasNext()){
			Item i = (Item)it.next();
			bal = bal + i.getPrice();
		}
		return bal;
	}
    
}
