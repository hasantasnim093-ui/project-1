package Product;

public class orderItem {

	
	String productId;
	String productName;
	
	int quantity;
	double unitPrice;
	double subTotal;
	
	orderItem(String productId, String productName,int quantity,double unitPrice,double subTotal){
		this.productId= productId; this.productName = productName; 
		this.quantity = quantity;
		this.unitPrice = unitPrice; this.subTotal= subTotal;
	}
	
	public  String getProductId() {
		 return this.productId;
	 }
	public   String getProductName() {
		 return this.productName;
	 }
	public int getQuantity() {
		 return this.quantity;
	 }
	public  double getUnitPrice() {
		 return this.unitPrice;
	 }
	public double getSubTotal() {
		 return this.subTotal;
	 }
	
	 
	 
	 void setProductId(String productId) {
		 this.productId = productId;
	 }
	  void setName(String productName) {
		 this.productName = productName;
	 }
	  void setCatagory(int quantity) {
		 this.quantity =quantity;
	 }
	  void setSuplier(double unitPrice) {
		 this.unitPrice =  unitPrice;
	 }
	  void setQuantityInStock(double subTotal) {
		 this.subTotal = subTotal ;
	 }
	
	  
	  public String toString() {
			return "ID: " + this.productId + " ,Name: "+ this.productName +" ,quantity: "+ this.quantity + " ,unitPrice: "+ this.unitPrice
				+" ,subTotal: "+ this.subTotal; 	
							
			 
		 }
	  
	  double calculateSubtotal() {
		  return this.unitPrice * this.quantity;
	  }

	
	
	
	
}
