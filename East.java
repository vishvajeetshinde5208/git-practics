class Fun {
public void addition(){
   int a = 10;
   int b = 20;
   int c= (a+b);
System.out.println("add"+c);
}
public void subtraction(){
    int a = 10;
    int b = 20;
    int c= (a-b);
System.out.println("sub"+c);
}
public static void main (String [] args){
 Fun t1= new Fun();
    t1.subtraction();
    t1.addition();
}
}