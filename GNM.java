/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author gaurav&nibhrit
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class GNM{

	public static void main(String args[]){

               final Mall m1=new Mall();
               	 
                  final ShoppingCart cart = new ShoppingCart();
                       final Factory fac= new Factory();
		JFrame mallframe = new JFrame("GN MALL");
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p3.setLayout(new BorderLayout());

		JButton enter = new JButton("Enter Customer");
		JButton exit = new JButton("Exit Customer");
		JButton clist = new JButton("Customer List");
		JButton slist = new JButton("Shop List");

		p1.add(enter);
		p1.add(exit);
		p2.add(clist);
		p2.add(slist);

		JLabel l1 = new JLabel("G&N MALL");
		p3.add(l1, BorderLayout.CENTER);

		mallframe.add(p1, BorderLayout.EAST);
		mallframe.add(p3, BorderLayout.CENTER);
		mallframe.add(p2, BorderLayout.SOUTH);

		mallframe.pack();
		mallframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mallframe.setVisible(true);



//====================END OF MALL HOME=============================================================================================================

		final JFrame newcust = new JFrame();
			newcust.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//JPanel p4 = new JPanel();
			//p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
		JPanel p5 = new JPanel();
			p5.setLayout(new BorderLayout());
		JPanel p6 = new JPanel();
			p6.setLayout(new BorderLayout());

		JPanel f = new JPanel();
		JPanel l = new JPanel();
		JPanel a = new JPanel();
		JPanel p = new JPanel();

		JLabel fname = new JLabel("  First Name:  ");
		JLabel lname = new JLabel("  Last Name:   ");
		JLabel address = new JLabel("  Address:   ");
		JLabel phone = new JLabel("  Phone No.:   ");

		final JTextField fn = new JTextField(15);
		final JTextField ln = new JTextField(15);
		final JTextField add = new JTextField(25);
		final JTextField ph = new JTextField(10);

		JLabel newcst = new JLabel("New Customer");
		JButton addcust = new JButton("Add/Enter");

		p5.add(newcst, BorderLayout.CENTER);
		p6.add(addcust, BorderLayout.CENTER);
		f.add(fname);
		f.add(fn);
		l.add(lname);
		l.add(ln);
		a.add(address);
		a.add(add);
		p.add(phone);
		p.add(ph);

		JPanel body = new JPanel();
			body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
		body.add(f);
		body.add(l);
		body.add(a);
		body.add(p);

		newcust.add(p5, BorderLayout.NORTH);
		newcust.add(body, BorderLayout.CENTER);
		newcust.add(p6, BorderLayout.SOUTH);

		newcust.pack();

		enter.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e1){
			newcust.setVisible(true);}});
			
		addcust.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e2){
			Customer a = new Customer();
			a.firstName(fn.getText());
			a.lastName(ln.getText());
			a.address(add.getText());
			a.phone(ph.getText());
                        m1.enter(a);
			newcust.setVisible(false); }});

//=============END OF ADD NEW CUSTOMER=============================================================================================================

		final JFrame remcust = new JFrame();
			remcust.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		JPanel p7 = new JPanel();
			p7.setLayout(new BorderLayout());
		JPanel p8 = new JPanel();
			p8.setLayout(new BorderLayout());

		JPanel f2 = new JPanel();
		JPanel l2 = new JPanel();

		JLabel fname2 = new JLabel("  First Name:  ");
		JLabel lname2 = new JLabel("  Last Name:   ");

		final JTextField fn2 = new JTextField(15);
		final JTextField ln2 = new JTextField(15);

		JLabel remcst = new JLabel("Remove Customer");
		JButton removecust = new JButton("Remove/Exit");

		p7.add(remcst, BorderLayout.CENTER);
		p8.add(removecust, BorderLayout.CENTER);
		f2.add(fname2);
		f2.add(fn2);
		l2.add(lname2);
		l2.add(ln2);

		JPanel body2 = new JPanel();
			body2.setLayout(new BoxLayout(body2, BoxLayout.Y_AXIS));
		body2.add(f2);
		body2.add(l2);

		remcust.add(p7, BorderLayout.NORTH);
		remcust.add(body2, BorderLayout.CENTER);
		remcust.add(p8, BorderLayout.SOUTH);

		remcust.pack();

              final JLabel cust_list = new JLabel();

		exit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e3){
			remcust.setVisible(true);}});
		removecust.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e4){
			Customer a = new Customer();
			//a.firstName(fn.getText());
			//a.lastName(ln.getText());
                        cust_list.setText(" ");
                       m1.exit(a.aaa(fn2.getText(),ln2.getText()));
                       
                       
                       			/*Vector list1 = m1.displayCustomers();
			//ListIterator ev1 = list1.listIterator();
                        Enumeration ev1 = list1.elements();
			while (ev1.hasMoreElements()){
                            //i=ev1.next();

			//cust_list.setText(" ");
			
			//cust_list.setText("\nCustomers in the mall are:\n");


                            Customer c1= (Customer)ev1.nextElement();
                             //System.out.println(c1.firstn());
                            cust_list.setText("\n  "+cust_list.getText()+" \n "+c1.firstn()+" "+"\n"+c1.lastn()+" "+"\n"+c1.addressn()+" "+"\n"+c1.phonen()+" \n "+" \n ");
                        //cust_list.setText(cust_list.getText()+" \n "+ev1.nextElement()+" \n "+" \n ");
			}
*/
                       
                       
                       
                    remcust.setVisible(false); }});

//==============END OF REMOVE CUSTOMER=============================================================================================================

		//final JFrame custlist = new JFrame();
		final JFrame shoplist = new JFrame();
		//custlist.setSize(400,400);
		//shoplist.setSize(400,400);

                //custlist.setDefaultCloseOperation(cust_list.setText("\n"));
                //custlist.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		//JPanel custlist2 = new JPanel();
		JPanel shoplist2 = new JPanel();
		JPanel p9 = new JPanel();
		JPanel p10 = new JPanel();
		JPanel p11 = new JPanel();
		JPanel panel1 = new JPanel();

		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

		//final JLabel cust_list = new JLabel();
		final JLabel shop_list = new JLabel("The shops in the mall are:\n\n\n\n");

		//custlist2.add(cust_list);
		shoplist2.add(shop_list);

		JLabel bkstr = new JLabel("  Book Store:    ");
		JLabel shstr = new JLabel("  Shoe Store:    ");
		JLabel gmstr = new JLabel("  Game Store:    ");

		JButton but1 = new JButton("Enter");
		JButton but2 = new JButton("Enter");
		JButton but3 = new JButton("Enter");

		p9.add(bkstr);
		p9.add(but1);
		p10.add(shstr);
		p10.add(but2);
		p11.add(gmstr);
		p11.add(but3);

		//custlist.add(custlist2);
		shoplist.add(shoplist2, BorderLayout.NORTH);
		panel1.add(p9);
		panel1.add(p10);
		panel1.add(p11);
		shoplist.add(panel1, BorderLayout.CENTER);
		shoplist.pack();

		clist.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e5){
			
			final JFrame custlist = new JFrame();
			//custlist.setDefaultCloseOperation(cust_list.setText("\n"));
			custlist.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			JPanel custlist2 = new JPanel();
			JPanel custlist22 = new JPanel();
			final JLabel cust_list = new JLabel();
			final JButton clok = new JButton("OK");
			custlist2.add(cust_list);
			custlist22.add(clok);
			custlist.add(custlist2, BorderLayout.NORTH);
			custlist.add(custlist22, BorderLayout.SOUTH);
			
			clok.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent cl_ok){
				custlist.dispose();
			}});
			
			cust_list.setText(" ");
			
			cust_list.setText("\nCustomers in the mall are:\n");
			//Mall mall1 = new Mall();
			Vector list1 = m1.displayCustomers();
			//ListIterator ev1 = list1.listIterator();
                        Enumeration ev1 = list1.elements();
			while (ev1.hasMoreElements()){
                            //i=ev1.next();

			//cust_list.setText(" ");
			
			//cust_list.setText("\nCustomers in the mall are:\n");


                            Customer c1= (Customer)ev1.nextElement();
                             //System.out.println(c1.firstn());
                            cust_list.setText("\n  "+cust_list.getText()+" \n "+c1.firstn()+" "+"\n"+c1.lastn()+" "+"\n"+c1.addressn()+" "+"\n"+c1.phonen()+" \n "+" \n ");
                        //cust_list.setText(cust_list.getText()+" \n "+ev1.nextElement()+" \n "+" \n ");
			}
			
			custlist.pack();
			custlist.setVisible(true);
			}
			});
			cust_list.setText(" ");

		slist.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e6){
			shoplist.setVisible(true);}});

//======END OF CUSTOMER AND SHOP LISTS=============================================================================================================
		
/*
                        final JFrame newcust1 = new JFrame();
			newcust1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//JPanel p4 = new JPanel();
			//p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
		JPanel p51 = new JPanel();
			p51.setLayout(new BorderLayout());
		JPanel p61 = new JPanel();
			p61.setLayout(new BorderLayout());

		JPanel f22 = new JPanel();
		JPanel l22 = new JPanel();
		JPanel a22 = new JPanel();
		JPanel p22 = new JPanel();

		JLabel fname1 = new JLabel("  First Name:  ");
		JLabel lname1 = new JLabel("  Last Name:   ");
		JLabel address1 = new JLabel("  Address:   ");
		JLabel phone1 = new JLabel("  Phone No.:   ");

		final JTextField fn1 = new JTextField(15);
		final JTextField ln1 = new JTextField(15);
		final JTextField add1 = new JTextField(25);
		final JTextField ph1 = new JTextField(10);

		JLabel newcst1 = new JLabel("New Customer");
		JButton addcust1 = new JButton("Add/Enter");

		p51.add(newcst, BorderLayout.CENTER);
		p61.add(addcust, BorderLayout.CENTER);
                f22.add(fname);
		f22.add(fn);
		l22.add(lname);
		l22.add(ln);
		a22.add(address);
		a22.add(add);
		p22.add(phone);
		p22.add(ph);

		JPanel body1 = new JPanel();
			body1.setLayout(new BoxLayout(body1, BoxLayout.Y_AXIS));
		body.add(f22);
		body.add(l22);
		body.add(a22);
		body.add(p22);

		newcust1.add(p51, BorderLayout.NORTH);
		newcust1.add(body1, BorderLayout.CENTER);
		newcust1.add(p61, BorderLayout.SOUTH);

		newcust1.pack();

		but1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e12){
			newcust1.setVisible(true);}});

	/*	addcust1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e22){
			Customer a = new Customer();
			a.firstName(fn.getText());
			a.lastName(ln.getText());
			a.address(add.getText());
			a.phone(ph.getText());
                        m1.enter(a);
			newcust1.setVisible(false); }});
*/
//===================================================================================================================

final JFrame bsnewcust = new JFrame();
			//bsnewcust.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//JPanel bsp4 = new JPanel();
			//bsp4.setLayout(new BoxLayout(bsp4, BoxLayout.Y_AXIS));
		JPanel bsp5 = new JPanel();
			bsp5.setLayout(new BorderLayout());
		JPanel bsp6 = new JPanel();
			bsp6.setLayout(new BorderLayout());

		JPanel bsf = new JPanel();
		JPanel bsl = new JPanel();
		
		JLabel bsfname = new JLabel("  First Name:  ");
		JLabel bslname = new JLabel("  Last Name:   ");
		
		final JTextField bsfn = new JTextField(15);
		final JTextField bsln = new JTextField(15);
		
		JLabel bsnewcst = new JLabel("New Customer in Book Store");
		JButton bsaddcust = new JButton("Add/Enter");

		bsp5.add(bsnewcst, BorderLayout.CENTER);
		bsp6.add(bsaddcust, BorderLayout.CENTER);
		bsf.add(bsfname);
		bsf.add(bsfn);
		bsl.add(bslname);
		bsl.add(bsln);
		
		JPanel bsbody = new JPanel();
			bsbody.setLayout(new BoxLayout(bsbody, BoxLayout.Y_AXIS));
		bsbody.add(bsf);
		bsbody.add(bsl);
		
		bsnewcust.add(bsp5, BorderLayout.NORTH);
		bsnewcust.add(bsbody, BorderLayout.CENTER);
		bsnewcust.add(bsp6, BorderLayout.SOUTH);

		bsnewcust.pack();

	//	enter.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e1){
	//		newcust.setVisible(true);}});
			
		
			
//====================================================================================================================


		final JFrame bookstore = new JFrame();

		JPanel bstitle = new JPanel();
		JPanel bsmain = new JPanel();
		JPanel bsbklst = new JPanel();
		JPanel bsprice = new JPanel();
		
		JPanel bschkout = new JPanel();
		JButton bschk = new JButton("Check Out");
		JButton bsclst = new JButton("Customer in Book Store");
		bschkout.add(bschk);
		bschkout.add(bsclst);

		JPanel bsbuttons = new JPanel();
		JPanel bsbutton1 = new JPanel(); JPanel bsbutton2 = new JPanel(); JPanel bsbutton3 = new JPanel(); JPanel bsbutton4 = new JPanel();
		JPanel bsbutton5 = new JPanel(); JPanel bsbutton6 = new JPanel(); JPanel bsbutton7 = new JPanel(); JPanel bsbutton8 = new JPanel();

		bsbklst.setLayout(new BoxLayout(bsbklst, BoxLayout.Y_AXIS));
		bsprice.setLayout(new BoxLayout(bsprice, BoxLayout.Y_AXIS));
		bsbuttons.setLayout(new BoxLayout(bsbuttons, BoxLayout.Y_AXIS));

		final JLabel bk1=new JLabel("  1. Harry Potter Collection         "); final JLabel bk2=new JLabel("  3. Lord of the Rings - Set of Four ");
		JLabel bk3=new JLabel("  2. Paulo Coelho - The Alchemist    "); JLabel bk4=new JLabel("  4. Scholastic GooseBumps           ");
		JLabel bk5=new JLabel("  5. Dan Brown - The Da Vinci Code   "); JLabel bk6=new JLabel("  6. Dan Brown - Deception Point     ");
		JLabel bk7=new JLabel("  7. Dan Brown - Digital Fortress    "); JLabel bk8=new JLabel("  8. Dan Brown - The Lost Symbol     ");

		final JLabel bkpr1=new JLabel("  Rs. 1500  "); final JLabel bkpr2=new JLabel("  Rs. 1200  ");
		JLabel bkpr3=new JLabel("  Rs. 0150   "); JLabel bkpr4=new JLabel("  Rs. 0100   ");
		JLabel bkpr5=new JLabel("  Rs. 0600   "); JLabel bkpr6=new JLabel("  Rs. 0400   ");
		JLabel bkpr7=new JLabel("  Rs. 0450   "); JLabel bkpr8=new JLabel("  Rs. 0800   ");

		JButton bsbuta1 = new JButton("Add"); JButton bsbuta2 = new JButton("Add"); JButton bsbuta3 = new JButton("Add");
		JButton bsbuta4 = new JButton("Add"); JButton bsbuta5 = new JButton("Add"); JButton bsbuta6 = new JButton("Add");
		JButton bsbuta7 = new JButton("Add"); JButton bsbuta8 = new JButton("Add");
		JButton bsbutr1 = new JButton("Remove"); JButton bsbutr2 = new JButton("Remove"); JButton bsbutr3 = new JButton("Remove");
		JButton bsbutr4 = new JButton("Remove"); JButton bsbutr5 = new JButton("Remove"); JButton bsbutr6 = new JButton("Remove");
		JButton bsbutr7 = new JButton("Remove"); JButton bsbutr8 = new JButton("Remove");

		bsbklst.add(bk1); bsbklst.add(bk2); bsbklst.add(bk3); bsbklst.add(bk4);
		bsbklst.add(bk5); bsbklst.add(bk6); bsbklst.add(bk7); bsbklst.add(bk8);

		bsprice.add(bkpr1); bsprice.add(bkpr2); bsprice.add(bkpr3); bsprice.add(bkpr4);
		bsprice.add(bkpr5); bsprice.add(bkpr6); bsprice.add(bkpr7); bsprice.add(bkpr8);

		bsbutton1.add(bsbuta1); bsbutton1.add(bsbutr1); bsbutton5.add(bsbuta5); bsbutton5.add(bsbutr5);
		bsbutton2.add(bsbuta2); bsbutton2.add(bsbutr2); bsbutton6.add(bsbuta6); bsbutton6.add(bsbutr6);
		bsbutton3.add(bsbuta3); bsbutton3.add(bsbutr3); bsbutton7.add(bsbuta7); bsbutton7.add(bsbutr7);
		bsbutton4.add(bsbuta4); bsbutton4.add(bsbutr4); bsbutton8.add(bsbuta8); bsbutton8.add(bsbutr8);

		bsbuttons.add(bsbutton1); bsbuttons.add(bsbutton2); bsbuttons.add(bsbutton3); bsbuttons.add(bsbutton4);
		bsbuttons.add(bsbutton5); bsbuttons.add(bsbutton6); bsbuttons.add(bsbutton7); bsbuttons.add(bsbutton8);

		bsmain.add(bsbklst);	bsmain.add(bsprice);	bsmain.add(bsbuttons);

		bookstore.add(bstitle, BorderLayout.NORTH);		bookstore.add(bsmain, BorderLayout.CENTER);	bookstore.add(bschkout, BorderLayout.SOUTH);

		bookstore.pack();
		
//======================================================================

			bsclst.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent bscl_lst){

			final JFrame bscustlist = new JFrame();
			//custlist.setDefaultCloseOperation(cust_list.setText("\n"));
			//bscustlist.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			JPanel bscustlist2 = new JPanel();
			JPanel bscustlist22 = new JPanel();
			final JLabel bscust_list = new JLabel();
			final JButton bsclok = new JButton("OK");
			bscustlist2.add(bscust_list);
			bscustlist22.add(bsclok);
			bscustlist.add(bscustlist2, BorderLayout.NORTH);
			bscustlist.add(bscustlist22, BorderLayout.SOUTH);
			
			bsclok.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent bscl_ok){
				bscustlist.setVisible(false);
			}});
			
			bscust_list.setText(" ");
			
			//bscust_list.setText("\nCustomer in the shop is: \n");
			//Mall mall1 = new Mall();
			//Vector bslist1 = m1.displayCustomers();
			//ListIterator ev1 = list1.listIterator();
			Customer aa = new Customer();
			
			Customer cname = new Customer();
                        //cname = cname.aaa(bsfn.getText(), bsln.getText());
			cname = aa.aaa("a","a");
			if (cname == null)
				bscust_list.setText("Fraud Customer. SECURITY!!");
			else bscust_list.setText("\nThe details of the customer are:: \n"+bscust_list.getText()+" \n "+cname.firstn()+" "+"\n"+cname.lastn()+" "+"\n"+cname.addressn()+" "+"\n"+cname.phonen()+" \n "+" \n ");

			
            /*            Enumeration bsev1 = bslist1.elements();
			while (bsev1.hasMoreElements()){
                            //i=ev1.next();

                            Customer bsc1= (Customer)bsev1.nextElement();
                             //System.out.println(c1.firstn());
                            bscust_list.setText("\n"+bscust_list.getText()+" \n "+bsc1.firstn()+" "+"\n"+bsc1.lastn()+" "+"\n"+bsc1.addressn()+" "+"\n"+bsc1.phonen()+" \n "+" \n ");
                        //cust_list.setText(cust_list.getText()+" \n "+ev1.nextElement()+" \n "+" \n ");
			}*/
			
			bscustlist.pack();
			bscustlist.setVisible(true);
		}});
			

//======================================================================		
		

		but1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e7){
			
			
			
                    /*    Customer a1 = new Customer();
			a1.firstName(fn1.getText());
			a1.lastName(ln1.getText());
			a1.address(add1.getText());
			a1.phone(ph1.getText());
                        
			newcust1.setVisible(false);
                    */
                  final Store ass;
                  final ShoppingCart cart = new ShoppingCart();
                       final Factory fac= new Factory();
			ass=fac.getstore("bookstore");
                        /* Customer a = new Customer();
			a.firstName(fn.getText());
			a.lastName(ln.getText());
			a.address("");
			a.phone("");
                        ass.enter(a);
*/
			shoplist.setVisible(false);
			bsnewcust.setVisible(true);
			
			}});
			
			bsaddcust.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent bse2){
			Customer a = new Customer();
			a.firstName(bsfn.getText());
			a.lastName(bsln.getText());
			a.address("");
			a.phone("");
			
			bsnewcust.setVisible(false);
			bookstore.setVisible(true); }});
			

                        bsbuta1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent eventa1){

			//ass=fac.getstore("bookstore");	ADD BOOK 1

                        Item item = new Item((bk1.getText()).substring(5,(bk1.getText()).length()), 11, Double.parseDouble((bkpr1.getText()).substring(6,10)));
                        fac.getstore("bookstore").addtocart(cart,item);
                        }});

                        bsbuta2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent eventa2){

			//ass=fac.getstore("bookstore");	ADD BOOK 2

                        Item item = new Item((bk2.getText()).substring(5,(bk2.getText()).length()), 12, Double.parseDouble((bkpr2.getText()).substring(6,10)));
                        fac.getstore("bookstore").addtocart(cart,item);
                        }});
                        
                         bsbutr1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent eventr1){

			//ass=fac.getstore("bookstore");	REM BOOK 1

                        Item item = new Item((bk1.getText()).substring(5,(bk1.getText()).length()), 11, Double.parseDouble((bkpr1.getText()).substring(6,10)));
                        fac.getstore("bookstore").removefromcart(cart,item);
                        }});
                        
                         bsbutr2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent eventr2){

			//ass=fac.getstore("bookstore");	REM BOOK 2

                        Item item = new Item((bk2.getText()).substring(5,(bk2.getText()).length()), 11, Double.parseDouble((bkpr2.getText()).substring(6,10)));
                        fac.getstore("bookstore").removefromcart(cart,item);
                        }});

                        
                        bschk.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent bsco){
							double k;
							k=cart.Balance();
							//System.out.println("balance is "+k);
							final JFrame bsbal = new JFrame();
							JPanel bsbalp = new JPanel();
							JLabel bsball = new JLabel();
							JButton bspay = new JButton("Pay/OK");
							JButton bsback = new JButton("Back");
							bsbalp.setLayout(new BoxLayout(bsbalp, BoxLayout.Y_AXIS));
							bsball.setText("Balance is: "+k);
							bsbalp.add(bsball, BorderLayout.CENTER);
							JPanel bsbalpp = new JPanel();
							bsbalpp.add(bspay);
							bsbalpp.add(bsback);
							bsbalp.add(bsbalpp, BorderLayout.SOUTH);
							bsbal.add(bsbalp);
							bsbal.pack();
							bsbal.setVisible(true);
							bspay.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent bs_pay){
								bookstore.dispose();
								bsbal.dispose();
								cart.clear();
							}});
							bspay.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent bs_pay){
								bsbal.setVisible(false);
							}});
                        }});

//====================END OF BOOKSTORE============================================================================================================

		final JFrame shoestore = new JFrame();

		JPanel shtitle = new JPanel();
		JPanel shmain = new JPanel();
		JPanel shlst = new JPanel();
		JPanel shprice = new JPanel();

		JPanel shbuttons = new JPanel();
		JPanel shbutton1 = new JPanel(); JPanel shbutton2 = new JPanel(); JPanel shbutton3 = new JPanel(); JPanel shbutton4 = new JPanel();
		JPanel shbutton5 = new JPanel(); JPanel shbutton6 = new JPanel(); JPanel shbutton7 = new JPanel(); JPanel shbutton8 = new JPanel();

		shlst.setLayout(new BoxLayout(shlst, BoxLayout.Y_AXIS));
		shprice.setLayout(new BoxLayout(shprice, BoxLayout.Y_AXIS));
		shbuttons.setLayout(new BoxLayout(shbuttons, BoxLayout.Y_AXIS));

		JLabel sh1=new JLabel("  1. Reebok                          "); JLabel sh2=new JLabel("  3. Nike                            ");
		JLabel sh3=new JLabel("  2. Adidas                          "); JLabel sh4=new JLabel("  4. Puma                            ");
		JLabel sh5=new JLabel("  5. Lotto                           "); JLabel sh6=new JLabel("  6. Bata                            ");
		JLabel sh7=new JLabel("  7. Liberty                         "); JLabel sh8=new JLabel("  8. Relaxo                          ");

		JLabel shpr1=new JLabel("  Rs. 2500   "); JLabel shpr2=new JLabel("  Rs. 2200   ");
		JLabel shpr3=new JLabel("  Rs. 1650   "); JLabel shpr4=new JLabel("  Rs. 1000   ");
		JLabel shpr5=new JLabel("  Rs. 1600   "); JLabel shpr6=new JLabel("  Rs. 0700   ");
		JLabel shpr7=new JLabel("  Rs. 0550   "); JLabel shpr8=new JLabel("  Rs. 0400   ");

		JButton shbuta1 = new JButton("Add"); JButton shbuta2 = new JButton("Add"); JButton shbuta3 = new JButton("Add");
		JButton shbuta4 = new JButton("Add"); JButton shbuta5 = new JButton("Add"); JButton shbuta6 = new JButton("Add");
		JButton shbuta7 = new JButton("Add"); JButton shbuta8 = new JButton("Add");
		JButton shbutr1 = new JButton("Remove"); JButton shbutr2 = new JButton("Remove"); JButton shbutr3 = new JButton("Remove");
		JButton shbutr4 = new JButton("Remove"); JButton shbutr5 = new JButton("Remove"); JButton shbutr6 = new JButton("Remove");
		JButton shbutr7 = new JButton("Remove"); JButton shbutr8 = new JButton("Remove");

		shlst.add(sh1); shlst.add(sh2); shlst.add(sh3); shlst.add(sh4);
		shlst.add(sh5); shlst.add(sh6); shlst.add(sh7); shlst.add(sh8);

		shprice.add(shpr1); shprice.add(shpr2); shprice.add(shpr3); shprice.add(shpr4);
		shprice.add(shpr5); shprice.add(shpr6); shprice.add(shpr7); shprice.add(shpr8);

		shbutton1.add(shbuta1); shbutton1.add(shbutr1); shbutton5.add(shbuta5); shbutton5.add(shbutr5);
		shbutton2.add(shbuta2); shbutton2.add(shbutr2); shbutton6.add(shbuta6); shbutton6.add(shbutr6);
		shbutton3.add(shbuta3); shbutton3.add(shbutr3); shbutton7.add(shbuta7); shbutton7.add(shbutr7);
		shbutton4.add(shbuta4); shbutton4.add(shbutr4); shbutton8.add(shbuta8); shbutton8.add(shbutr8);

		shbuttons.add(shbutton1); shbuttons.add(shbutton2); shbuttons.add(shbutton3); shbuttons.add(shbutton4);
		shbuttons.add(shbutton5); shbuttons.add(shbutton6); shbuttons.add(shbutton7); shbuttons.add(shbutton8);

		shmain.add(shlst);	shmain.add(shprice);	shmain.add(shbuttons);

		shoestore.add(shtitle, BorderLayout.NORTH);		shoestore.add(shmain, BorderLayout.CENTER);

		shoestore.pack();

		but2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e8){
			Factory fac= new Factory();
			fac.getstore("shoestore");
			shoplist.setVisible(false);
			shoestore.setVisible(true);}});

//===================END OF SHOE STORE=============================================================================================================

		final JFrame gamestore = new JFrame();

		JPanel gmtitle = new JPanel();
		JPanel gmmain = new JPanel();
		JPanel gmlst = new JPanel();
		JPanel gmprice = new JPanel();

		JPanel gmbuttons = new JPanel();
		JPanel gmbutton1 = new JPanel(); JPanel gmbutton2 = new JPanel(); JPanel gmbutton3 = new JPanel(); JPanel gmbutton4 = new JPanel();
		JPanel gmbutton5 = new JPanel(); JPanel gmbutton6 = new JPanel(); JPanel gmbutton7 = new JPanel(); JPanel gmbutton8 = new JPanel();

		gmlst.setLayout(new BoxLayout(gmlst, BoxLayout.Y_AXIS));
		gmprice.setLayout(new BoxLayout(gmprice, BoxLayout.Y_AXIS));
		gmbuttons.setLayout(new BoxLayout(gmbuttons, BoxLayout.Y_AXIS));

		JLabel gm1=new JLabel("  1. Need For Speed - Carbon         "); JLabel gm2=new JLabel("  3. Warcraft III - Frozen Throne    ");
		JLabel gm3=new JLabel("  2. Age of Empires II               "); JLabel gm4=new JLabel("  4. Counter Strike Source           ");
		JLabel gm5=new JLabel("  5. Halo Reach                      "); JLabel gm6=new JLabel("  6. Unreal Tournament 2004          ");
		JLabel gm7=new JLabel("  7. FIFA 2011 - PC                  "); JLabel gm8=new JLabel("  8. Spider-Man Shattered Dimensions ");

		JLabel gmpr1=new JLabel("  Rs. 0750   "); JLabel gmpr2=new JLabel("  Rs. 0400   ");
		JLabel gmpr3=new JLabel("  Rs. 1200   "); JLabel gmpr4=new JLabel("  Rs. 1000   ");
		JLabel gmpr5=new JLabel("  Rs. 0800   "); JLabel gmpr6=new JLabel("  Rs. 0600   ");
		JLabel gmpr7=new JLabel("  Rs. 1500   "); JLabel gmpr8=new JLabel("  Rs. 1400   ");

		JButton gmbuta1 = new JButton("Add"); JButton gmbuta2 = new JButton("Add"); JButton gmbuta3 = new JButton("Add");
		JButton gmbuta4 = new JButton("Add"); JButton gmbuta5 = new JButton("Add"); JButton gmbuta6 = new JButton("Add");
		JButton gmbuta7 = new JButton("Add"); JButton gmbuta8 = new JButton("Add");
		JButton gmbutr1 = new JButton("Remove"); JButton gmbutr2 = new JButton("Remove"); JButton gmbutr3 = new JButton("Remove");
		JButton gmbutr4 = new JButton("Remove"); JButton gmbutr5 = new JButton("Remove"); JButton gmbutr6 = new JButton("Remove");
		JButton gmbutr7 = new JButton("Remove"); JButton gmbutr8 = new JButton("Remove");

		gmlst.add(gm1); gmlst.add(gm2); gmlst.add(gm3); gmlst.add(gm4);
		gmlst.add(gm5); gmlst.add(gm6); gmlst.add(gm7); gmlst.add(gm8);

		gmprice.add(gmpr1); gmprice.add(gmpr2); gmprice.add(gmpr3); gmprice.add(gmpr4);
		gmprice.add(gmpr5); gmprice.add(gmpr6); gmprice.add(gmpr7); gmprice.add(gmpr8);

		gmbutton1.add(gmbuta1); gmbutton1.add(gmbutr1); gmbutton5.add(gmbuta5); gmbutton5.add(gmbutr5);
		gmbutton2.add(gmbuta2); gmbutton2.add(gmbutr2); gmbutton6.add(gmbuta6); gmbutton6.add(gmbutr6);
		gmbutton3.add(gmbuta3); gmbutton3.add(gmbutr3); gmbutton7.add(gmbuta7); gmbutton7.add(gmbutr7);
		gmbutton4.add(gmbuta4); gmbutton4.add(gmbutr4); gmbutton8.add(gmbuta8); gmbutton8.add(gmbutr8);

		gmbuttons.add(gmbutton1); gmbuttons.add(gmbutton2); gmbuttons.add(gmbutton3); gmbuttons.add(gmbutton4);
		gmbuttons.add(gmbutton5); gmbuttons.add(gmbutton6); gmbuttons.add(gmbutton7); gmbuttons.add(gmbutton8);

		gmmain.add(gmlst);	gmmain.add(gmprice);	gmmain.add(gmbuttons);

		gamestore.add(gmtitle, BorderLayout.NORTH);		gamestore.add(gmmain, BorderLayout.CENTER);

		gamestore.pack();

		but3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e9){
			Factory fac= new Factory();
			fac.getstore("gamestore");
			shoplist.setVisible(false);
			gamestore.setVisible(true);}});

//===================END OF GAME STORE============================================================================================================


	}
}
