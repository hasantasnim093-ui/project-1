package Product;

public class product {

	
String	productId;
String name;
String catagory;
double price;	
int quantityInStock	;
	
	
String supplier;

product(String	productId,String name,String catagory, String supplier, double price , int quantityInStock ){
	this.productId = productId; this.name = name; this.catagory = catagory; this.supplier = supplier;
	this .price =price; this.quantityInStock= quantityInStock;
}

product(){
}

public  String getProductId() {
	 return this.productId;
 }
public   String getName() {
	 return this.name;
 }
public String getCatagory() {
	 return this.catagory;
 }
public  String getSuplier() {
	 return this.supplier;
 }
public int getQuantityInStock() {
	 return this.quantityInStock;
 }
public  double getPrice() {
	 return this.price;
 }
 
 
 void setProductId(String productId) {
	 this.productId = productId;
 }
  void setName(String name) {
	 this.name = name;
 }
  void setCatagory(String catagory) {
	 this.catagory =catagory;
 }
  void setSuplier(String supplier) {
	 this.supplier =  supplier;
 }
  void setQuantityInStock(int quantityInStock) {
	 this.quantityInStock = quantityInStock ;
 }
  void setPrice(int price) {
	this.price = price;
 }
 
 public String toString() {
	return "ID: " + this.productId + " ,Name: "+ this.name +" ,Catagory: "+ this.catagory + " ,Supplier: "+ this.supplier
		+" ,Price: "+ this.price + " , quantity In Stock:  " + this.quantityInStock; 	
					
	 
 }
 
 
 public boolean equals(Object obj){
	if(this == obj) {
	return true;
	}
	
	if(obj == null) {
		return false;
	}
	
	if(obj instanceof product) {
		product newProduct = (product)obj; // turn the obj into pr0duct class if its part of class
		
		 return newProduct.productId.equals(this.productId); // one sentene chekcs wif or 

		
	}
	
	return false;

 }

 @Override
 public int hashCode() {
	return this.productId.hashCode();   // coNverts String --> int  EX: "90" --> 90
	 
 }
 
 
	
	
	
	
	
	
	
	
	
}
