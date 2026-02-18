package Product;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		vectorComparisonDemo a = new vectorComparisonDemo();
		long start;
		long end;
		
		long start2 , start3;
		long end2, end3;
		
		start = System.nanoTime();
		
		for(int i =1;i<=10000;i++) {
			a.addProduct_Vector(new product());
		}
		
		end = System.nanoTime();
		
	System.out.println("vector adding time: " + (end-start));
		
	
	start2 = System.nanoTime();
	
	for(int i =1;i<=10000;i++) {
		a.addProduct_ArrayList(new product());;
	}
	
	end2 = System.nanoTime();
	
	System.out.println("Array list adding time: " + (end2-start2));
	
	
	Random rand = new Random();
	start3 = System.nanoTime();
	for(int i=0;i<=1000;i++) {
		a.getProduct_Vector(rand.nextInt(a.getVectorSize()));
	}
	
	end3 = System.nanoTime();
	long accessMemoryVector = (end3 - start3);
	
	System.out.println("time to get access memory for Vector: "+accessMemoryVector );
	
	
	

	Random rand2 = new Random();
	start3 = System.nanoTime();
	for(int i=0;i<=1000;i++) {
		a.getProduct_ArrayList(rand2.nextInt(a.getArrSize()));
	}
	
	end3 = System.nanoTime();
	long accessMemoryArray = (end3- start3);
	
	System.out.println("time to get access memory for ArrayList : "+accessMemoryArray );
	
	
	
	// difference noticed - ArrayList is much faster 
	
	// Vector when dealing with legacy old code or when it is synchranized meaning when used for multiple threading
	// it works better , however it will be slower
	// arrayList is used generally in all cases  , in cases of threads vector is better 
	
	//ArrayList also faster 
	
	
	
		

	}

}
