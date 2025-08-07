class test{
 int number=100;//globle variable 
 String name="saru"; //globle variable
 
public void showGloble(){
System.out.println("accseing the globle variable");
System.out.println(number);
System.out.println(name);
}
public void showlocal(){
int number=209;//local variable
String name="sudha";//local varialble

System.out.println(number);
System.out.println(name);
}
public static void main (String [] args){
test t1=new test();
t1.showGloble();
t1.showlocal();
}
}