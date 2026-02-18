package Product;

import java.util.Iterator;
import java.util.Vector;

public class Order {

	String orderId;
	String customerName; 
	String orderDate; 
	Vector<orderItem> items;
	String orderStatus;
	
	
	
	Order(String orderId){
		items = new Vector<>();
		this.orderId = orderId;
	     
	}
	
	
	
	void addItem(orderItem item) {
		for(orderItem p : items) {
			if(p.productId.equals(item.productId)) {
				System.out.println("already added ");
				return;
			}
		}
		
		items.add(item);
	}
	
	boolean removeItem(String productId) {
		boolean found = false;
		  
		  
		  Iterator<orderItem> it = items.iterator();
		  
		  while(it.hasNext()) { //O(n) solution
			  
			  orderItem element = it.next();
			  
			  if(element.productId.equals( productId)){
				  
				  it.remove();
				  found = true;
				
				  
				  
			  } 
			  		
		  }
		  
		  
		  if(found == true) {
			  return true;
		  }else {
			  return false;
		  }

	}
	
	orderItem findItem(String productId) {
		
		 Iterator<orderItem> it = items.iterator();
		  
		  while(it.hasNext()) { //O(n) solution
				  
				  orderItem element = it.next();
				  
				  if(element.productId.equals( productId)){
					  
					  return element;
					
					
					  
					  
				  } 
				  		
			  }
		  
		  return null;
			 
		
		
		
	}
	
	double calculateTotal() {
		
		double total = 0;
		
		for(orderItem a : items) {
			
			total+=a.getSubTotal();
			
			
			
		}
		
		return total;
		
		
		
		
		
		
		
		
	}
	
	int getTotalItems() {
		int total = 0;
		
		for(orderItem a : items) {
			
			total+=a.getQuantity();
			
			
			
		}
		
		return total;
		
		
	}
	
	void updateStatus(String newStatus) {
		switch(newStatus) {
		case "Pending":case "pending":
		case "Processing": 	case "processing":
		case "Shipped":case "shipped":
		case "Delivered":	case "delivered":
		case "Cancelled": case "cancelled":
		
			this.orderStatus = newStatus;
		    break;
			default:
				System.out.println("Invalid status...");
			
			
		}
		
		
		
		}
	
	void printOrder() {
		System.out.println(this.orderId + " | " +this.customerName + " | "+this.orderDate + " | "+this.orderStatus);
	}
	
	Vector<orderItem> getItems(){
		Vector<orderItem> newVector = new Vector<>(items);
		return newVector;
	}
	public String getOrderId() {
	    return this.orderId;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
