package com.hasmap.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
	
	public static void main(String[] args) {
		
		Map<String,String> phoneBook=new HashMap<>();
		
		phoneBook.put("raju", "9432454534");
		phoneBook.put("priya", "6789550449");
		phoneBook.put("rahul", "8787656765");
		phoneBook.put("vinkal", "9087345676");
		phoneBook.put("prakas", "8789667895");
		phoneBook.put("suraj", "6790898985");
		phoneBook.put("raja", "3468876666");
		phoneBook.put("pooja", "6657435454");
		
		System.out.println( "  : "+phoneBook.get("priya"));
		
		Set<String> key=phoneBook.keySet();
		System.out.println("\n**************<Print Value In Hence Loop>**********");
		for(String i : key) {
			System.out.println(i + "  : "+phoneBook.get(i));
		}
		
		Set<Map.Entry<String,String>> values=phoneBook.entrySet();
		System.out.println("\n**************<Print Value In Generic>**********");
		for(Map.Entry<String, String> e : values) {
			
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}






/*Product product=new Product();

product.setProductId("101");
product.setProductName("Ram");
product.setProductQunt("5");
product.setProductPrice("500");*/
