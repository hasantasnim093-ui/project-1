# project-1
Product class - this class takes in necesary info in order to be process, you enter the fields it portrays such productId(string) , name , catagory 
ProductInventory class - this class acts as the access center, through this class you can manage many products you create in class 
VectorComparison clas - this class you use arraylist and vector to see which one is more effactive , we check there performence
VectorUtils - this class you creatw a generic field, which means you create many different forms through one type <t> 
genericContainer - this class we use the actual <t> generic and access the Vector<t> , it acts as a "wrapper" around vector meaning we use it to access many variable <t>
Order class- this class contains the necesary order feilds in order to be initialized , it acts a base element which will later be built on through other order named class listed below
orderItem - much like the product , this class contains fields you initialized you give it info inside its perimeter in main , this describes every order.
OrderManager class - like it says in the name it manages, it managesn every order which you acess through its wrapper vector its suppose to contain every orderItem which you enter through its object you create


In order to run the program you must first create product object and orderItem object in main , you can then store them respctevly ProductInventory and orderManager class 
you can then process and manage them through the methods of these inventory and manager class


Assumptions i made, i thought many methods were suppose to be solved the way i thought for example 
"negative stocks were not allowed" however this was a logical mistake i fixed after carefull searching on chatgbt , which i used for mentoring on guiding me the right way on each method rather then copy there code 

challanges - during my jounrney of creating this inventory system i had encounterd challanges throughout every step 
some challanges i could remember were oviously de bugging which was a smooth process as i have practiced OOP programming before so some bugs were easy to tell 
coming up with logics for some methods as i didnt quite understand what some meant so i consulted chatgbt rather then copy and pastew its code without understanding which made it easier to understand

WHAt i learned about vectors and generics, <t> means it could be any type particularly vectors which accepts object types into its generics in main , so it accepts Integer rather then int 
i learned <t extend comparable> it will take tyoes that already havwe comparable class , so class int which will be used to compare this -> other.object which allows for to be comparedTo() meaning it subtracts if its negative its less then meaning this - other its negtaive this is less , vice verca 

i learned how to loop over vectors using for loops 
for(int i=0;i<VectorName.size();i++){
// create indivdual element;
t element = VectorName.get(i);
} .get() requires index 

Iterator a = VectorName.iterate();

while(a.hasNext){
// create indivdual element;
t element = a.next();

// you can iterate over 
Enumeration - old legacty to iterate tyhrough legacy list like vectors


