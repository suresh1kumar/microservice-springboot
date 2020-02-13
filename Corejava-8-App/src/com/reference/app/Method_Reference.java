package com.reference.app;

 interface Hello {
	void sayHello();
}
public class Method_Reference {
	
	public static void getHello() {
		System.out.println("print the method refrence bloc...");
	}
	public static void main(String[] args) {
		
		Hello hello=Method_Reference::getHello;
		hello.sayHello();
		
		Thread th=new Thread(Method_Reference::getHello);
		th.start();
		
		
		 
	}

}
