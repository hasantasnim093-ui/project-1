package Product;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ProductInventory {

	
	Vector<product> products;
	
	
	
	ProductInventory(){
		 products=new Vector<>();
	}
	
	

	
public	void addProduct(product product) {
		

		products.add(product);
		}
	
	
	
  public  boolean removeProduct(String productId) {
	  boolean found = false;
	  
	  
	  Iterator<product> it = products.iterator();
	  
	  while(it.hasNext()) { //O(n) solution
		  
		  product element = it.next();
		  
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
  
  product findProduct(String productId) {
	  Iterator<product> it = products.iterator();
	  
  while(it.hasNext()) { //O(n) solution
		  
		  product element = it.next();
		  
		  if(element.productId.equals( productId)){
			  
			  return element;
			
			
			  
			  
		  } 
		  		
	  }
  
  return null;
	  

  }
  Vector<product> getProductsByCategory(String category) {
	  
	  Vector<product> catagoryProduct = new Vector<>();
	  
	  Iterator<product> it = products.iterator();
	  
	  
  while(it.hasNext()) { //O(n) solution
		  
		  product element = it.next();
		  
		  if(element.catagory.equals( category)){
			  
			  catagoryProduct.add(element);
			
			
			  
			  
		  } 
		  		
	  }
  
  
  
  
  return catagoryProduct;
  
  
  
  
  
  }
  
  Vector<product> getLowStockProducts(int threshold) {
	  
	  Vector<product> QuantityProduct = new Vector<>();

	  
	  for(product a : products) {
		  if(a.quantityInStock < threshold) {
			  QuantityProduct.add(a);
		  
		  
	  }
	  
  }
	  
	  return  QuantityProduct ;
	  
  }
  
  double getTotalInventoryValue() {
	  double multipliedValue = 0;
	  double total=0;
	  
	  for(product a : products) {
		  multipliedValue= a.getPrice() * a.getQuantityInStock();
		  total+=  multipliedValue;
	  }
	  
	  return total;
	  
	  
	  
	  
  }
  void updateStock(String productId, int quantityChange) {
	  
	  int newValue =0;
	  for(product a : products) {
		  if(a.productId.equals(productId)) {
			  if(quantityChange>0) {
				  newValue=	  a.getQuantityInStock()+ quantityChange;
			  }else {
				  newValue=	  a.getQuantityInStock()+ quantityChange; 
			  }
			  a.setQuantityInStock(newValue);
			  return;
			  
		}
		  
		  
		  
		  
		  
		  
  }
	  
	  

	
	
	
	
  }
  void printAllProducts() {
	  for(product a : products) {
		  System.out.println(a.toString());
	  }
  }

  int getTotalProducts() {
	  return products.size();
  }
  
  void printCapacityInfo() {
	  System.out.println("size: "+products.size()+" ,capacity: "+products.capacity());
  }
  
  void optimizeCapacity() { //trimToSize() - means it reduces to the size of current size 
	 this.products.trimToSize();
  }
  void ensureCapacity(int minCapacity) {
        this.products.ensureCapacity(minCapacity); // increases if less then min capacity else stays same
  }
  void printCapacityReport() {
	  double capacityUtilPercentage = (products.size() / products.capacity()) *100;
	  double addedBeforeResize = (products.capacity()-products.size());
	  
	  System.out.println("current size: "+ products.size() + " ,capacity: "+ products.capacity() +
	 " ,capacity util percentage: "+capacityUtilPercentage + " ,How many element added before resize: "
	 + addedBeforeResize);
  }
  
  public void printProductsUsingEnumeration() {
	 
	Enumeration<product> it = products.elements();
	   
	while(it.hasMoreElements()) {
		//what is enumeration 
		// it is a old loop tool used before iteration or for each loop 
		// it was used to loop through old legacy list like vectors 
		
		product element = it.nextElement();
		System.out.println(element);
		
		// use enumeration compared to it when dealing with old code, such as legacy old code that may 
		//require old tools such as enumeration to be iterated through
		
		
	}
	  
	  
	  
  }
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		