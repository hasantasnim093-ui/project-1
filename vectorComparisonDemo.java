package Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class vectorComparisonDemo {
	
	
	Vector<product> product_vector;
	ArrayList<product> product_arrList;
	
	vectorComparisonDemo(){
		product_vector = new Vector<product>();
		product_arrList = new ArrayList<product>();
	}
	
  int getArrSize() {
	 return product_arrList.size();
  }
  
  int getVectorSize() {
		 return product_vector.size();
	  }
	
	
	
	void addProduct_Vector(product product) {
		

		
		product_vector.add(product);
		}
	
	
	
  private boolean removeProduct_Vector(String productId) {
	  boolean found = false;
	  
	  
	  for(int i =0;i<product_vector.size();i++) {
			product element = product_vector.get(i); // access the individual value through .get on each 
			//index
			
			if(element.productId.equals(productId)) {
				product_vector.remove(element);
				found = true;
			}
		}
	  
	  
	
	  
	  
	  if(found == true) {
		  return true;
	  }else {
		  return false;
	  }

  }
  product getProduct_Vector(int index) {
	  return product_vector.get(index);
  }
  product getProduct_ArrayList(int index) {
	  return product_arrList.get(index);
  }
  
  product getProduct_Vector(String productId) {
		for(int i =0;i<product_vector.size();i++) {
			product element = product_vector.get(i); // access the individual value through .get on each 
			//index
			
			if(element.productId.equals(productId)) {
				return element;
			}
		}
	  
  
		
  
  return null;
	  

  }
  
  void addProduct_ArrayList(product product) {
		


		
		product_arrList.add(product);
		}
	
	
	
private boolean removeProduct_ArrayList(String productId) {
	  boolean found = false;
	  
	  
	  for(int i =0;i<product_arrList.size();i++) {
			product element = product_vector.get(i); // access the individual value through .get on each 
			//index
			
			if(element.productId.equals(productId)) {
				product_arrList.remove(element);
				found = true;
			}
		}
	  
	  
	
	  
	  
	  if(found == true) {
		  return true;
	  }else {
		  return false;
	  }

}

product getProduct_ArrayList(String productId) {
		for(int i =0;i<product_arrList.size();i++) {
			product element = product_arrList.get(i); // access the individual value through .get on each 
			//index
			
			if(element.productId.equals(productId)) {
				return element;
			}
		}
	  

		

return null;
	  

}
	
	
	
	
	
	
	

}
