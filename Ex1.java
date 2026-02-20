package Acess_modifiers;

public class Ex1 {
     int a;
     int b;
     void display() {
    	 System.out.println(a);
    	 System.out.println(b);
     }
     public static void main(String[]args)
     {
    	 Ex1 ob=new Ex1();
    	 ob.a=10;
    	 ob.b=20;
    	 ob.display();
     }
}
