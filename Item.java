/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author gaurav
 */

public class Item{
	private String name;
	private int itemID;
	private double price;
	//private int storeID;
	public Item(String iname, int iid,  double iprice){
		name = iname;
		itemID = iid;
		price = iprice;
		//storeID = sid;
	}
	public double getPrice(){
		return price;
	}
	public String getName(){
		return name;
	}
	public boolean equals(Object o){
		if (o instanceof Item){
			Item p = (Item) o;
			return p.getName().equals(name);
		}
		return false;
	}
}




