package Product;

import java.util.Random;

public class InventorySystemMain {

	public static void main(String[] args) {
		
		ProductInventory a = new 	ProductInventory();
		OrderManager o = new OrderManager();
		
		
		product p1 = new product("P1001", "Laptop", "Electronics", "Dell", 899.99, 10);
		product p2 = new product("P1002", "Mouse", "Electronics", "Logitech", 25.50, 50);
		product p3 = new product("P1003", "Desk Chair", "Furniture", "Ikea", 120.00, 20);
		
		a.addProduct(p1);	a.addProduct(p2); 	a.addProduct(p3);
		System.out.println("removed: "+a.removeProduct("P1001"));
		System.out.println("found: "+	a.findProduct("P1002"));
		
		
		// create order - making the object 
		
		
		
		orderItem o1 = new orderItem("P1001", "Laptop", 1, 899.99, 899.99);
		orderItem o2 = new orderItem("P1002", "Mouse", 2, 25.50, 51.00);
		orderItem o3 = new orderItem("P1004", "Notebook", 5, 3.99, 19.95);
		
		
		Order order = new Order("P1001"); Order order2 = new Order("P1002");
		order.addItem(o1);order.addItem(o2);order.addItem(o3);
		
		o.addOrder(order); o.addOrder(order2);
	    o.cancelOrder("P1001");o.findOrder("P1002");
	    // create order - making the object 
	    
		vectorComparisonDemo a1 = new vectorComparisonDemo();
		long start;
		long end;
		
		long start2 , start3;
		long end2, end3;
		
		start = System.nanoTime();
		
		for(int i =1;i<=10000;i++) {
			a1.addProduct_Vector(new product());
		}
		
		end = System.nanoTime();
		
	System.out.println("vector adding time: " + (end-start));
		
	
	start2 = System.nanoTime();
	
	for(int i =1;i<=10000;i++) {
		a1.addProduct_ArrayList(new product());;
	}
	
	end2 = System.nanoTime();
	
	System.out.println("Array list adding time: " + (end2-start2));
	
	
	Random rand = new Random();
	start3 = System.nanoTime();
	for(int i=0;i<=1000;i++) {
		a1.getProduct_Vector(rand.nextInt(a1.getVectorSize()));
	}
	
	end3 = System.nanoTime();
	long accessMemoryVector = (end3 - start3);
	
	System.out.println("time to get access memory for Vector: "+accessMemoryVector );
	
	
	

	Random rand2 = new Random();
	start3 = System.nanoTime();
	for(int i=0;i<=1000;i++) {
		a1.getProduct_ArrayList(rand2.nextInt(a1.getArrSize()));
	}
	
	end3 = System.nanoTime();
	long accessMemoryArray = (end3- start3);
	
	System.out.println("time to get access memory for ArrayList : "+accessMemoryArray );
	
	
	
		
		
		
		

	}

}
