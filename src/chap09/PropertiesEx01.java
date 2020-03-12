package chap09;

import java.util.*;

public class PropertiesEx01 {
	
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//
		prop.setProperty("timeout","30");
		prop.setProperty("language","kr");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");
		
		//
		//Enumeration e = prop.propertyNames();
		Iterator et = (Iterator)prop.propertyNames();
		//while(e.hasMoreElements()) {
		while(et.hasNext()) {
			//String element = (String)e.nextElement();
			String element = (String)et.next();
			
			System.out.println(element + " = " + prop.getProperty(element));
		}
		System.out.println();
		prop.setProperty("size", "20");
		System.out.println("size = " + prop.getProperty("size"));
		System.out.println("capacity = " + prop.getProperty("capacity","20"));
		System.out.println("loadfactor = " + prop.getProperty("loadfactor","0.75"));
		System.out.println();
		
		System.out.println(prop);
		System.out.println();
		
		prop.list(System.out);
	}

}
