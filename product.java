class product{
int pid=123;
int price=50;
String pname="vishva";

public void displayProduct()
{
System.out.println("....displayProduc Details....");
int pid=123;
int price=50;
String pname="vishva";
}
public void displayCustomerDetails(){
product p=new product();
System.out.println(p.pid+""+p.price+" "+p.pname);
}
public static void main(String[] args)
{
System.out.println("product test");
 product p1=new  product();
System.out.println(p1.pid);
System.out.println(p1.price);
System.out.println(p1.pname);
p1.displayProduct();
p1.displayCustomerDetails();
}
}