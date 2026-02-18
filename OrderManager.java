package Product;

import java.util.Iterator;
import java.util.Vector;

public class OrderManager {

	
	Vector<Order> orders;
	OrderManager(){
		orders = new Vector<>(); 
	}
	
	
	void addOrder(Order item) {
	
		
		orders.add(item);
	}
	
	Order findOrder(String orderId) {
		
		 Iterator<Order> it = orders.iterator();
		  
		  while(it.hasNext()) { //O(n) solution
				  
				  Order element = it.next();
				  
				  if(element.orderId.equals(orderId)){
					  
					  return element;
					
					
					  
					  
				  } 
				  		
			  }
		  
		  return null;
			 
		
		
		
		
		
	}
	
	
	Vector<Order> getOrdersByStatus(String status){
		Vector<Order> newVector = new Vector<>();
		
		
		for(Order o :orders ) {
			
			if(o.orderStatus.equalsIgnoreCase(status)) {
				newVector.add(o);
			}
			
			
			
			
		}
		
		
		return newVector;
		
	}
	
	
	
	Vector<Order> getOrdersByCustomer(String customerName){
		Vector<Order> newVector = new Vector<>();
		
		for(Order o :orders) {
			if(o.customerName.equalsIgnoreCase(customerName)) {
				newVector.add(o);
			}
		}
		
		return newVector;
		
		
	}
	
	double getTotalRevenue() {
		double total =0;
		for(Order o :orders) {
	
			if(o.orderStatus.equalsIgnoreCase("delivered")) {
				total += o.calculateTotal();
			}
			
		}
		
		return total;
		
		
		
	}
	
	void cancelOrder(String orderId) {
		
		  
		  for(int i =0;i<orders.size();i++) {
				Order element = orders.get(i); 
				
				if(element.getOrderId().equals(orderId)) {
					orders.remove(i);
				}

		}
		
		
		
		
	}
	
	void printAllOrders() {
		
		for(Order o :orders) {
			o.printOrder();
			
			
			
			
		}
		
		
		
		
	}
	Vector<Order> getPendingOrders(){
		Vector<Order> newVector = new Vector<>();
	
		
		for(Order o :orders) {
			if(o.orderStatus.equalsIgnoreCase("pending")) {
				newVector.add(o);
			}
			
			
		}
		
		return newVector;
		
		
		
		
		
		
		
	}
	
	int getOrderCount() { // get the orders vector size bc it grows when a object or order is created 
	return orders.size();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
