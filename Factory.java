/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author gaurav
 */
public class Factory
{
	public Store getstore(String name)
	{
		if (name.equals("bookstore"))
			return new BookStore();
		else
			if(name.equals("gamestore"))
				return new GameStore();
			else
				if(name.equals("shoestore"))
					return new ShoeStore();
				else
					return null;
	}
}
