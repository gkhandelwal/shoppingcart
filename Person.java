/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author gaurav
 */


public abstract class  Person{
        String first;
         String last;
          String address;
          String phone;
	 abstract void firstName(String sa);
         abstract String firstn();
	 abstract void lastName(String la);
	 abstract void address(String add);
	 abstract void phone(String ph);
}