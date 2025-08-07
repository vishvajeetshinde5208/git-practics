package myapp;
public class student1{

public String name;
public int age;

student1(){
name="Rahul";
age=22;
}
public void Displayinfo()
{
System.out.println("Student Name:"+name);
System.out.println("Student age:" + age);
}
public static void main(String[]args)
{
student1 s = new student1();
s.Displayinfo();
}
}