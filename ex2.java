package Acess_modifiers;

public class ex2 {

    int a;
    int b;

    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        ex2 ob = new ex2();
        ob.a = 20;
        ob.b = 60;
        ob.display();
    }
}