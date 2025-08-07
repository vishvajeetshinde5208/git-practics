class customer{
}
class student{
}
class test{
 public static void main (String [] args) throws Exception{

Object o = Class.forName(args[0]).getDeclaredConstructor().newInstance();
System.out.println("object created for:" + o.getClass().getName());
}
}