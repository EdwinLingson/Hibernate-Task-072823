package com.edwin.hiberanate.HibernateTask;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MenuFunctions menu = new MenuFunctions();
    	int selection =0;
        do {
        	System.out.println("1.Create\n2.Read\n3.Update\n4.Delete\n5.Exit");
        	selection = ReadUtils.readInt("Enter your selection");
        	switch(selection) {
        	case 1: menu.createProduct();break;
        	case 2: menu.readProduct();break;
        	case 3: menu.updateProduct();break;
        	case 4: menu.deleteProduct();break;
        	case 5:break;
        	default:System.out.println("Invalid Selction");
        	}
        }while(selection!=5);
        System.out.println("BYE BYE");
    }
}
