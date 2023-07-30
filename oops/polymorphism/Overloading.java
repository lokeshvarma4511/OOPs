package oops.polymorphism;

public class Overloading
{
    public  void sum(int a, int b) {
        System.out.println(a+b);
    }

    void sum(int a, double b, int c) {
        System.out.println(a+b+c);
    }
    public static void main(String[] args)
    {
        Overloading e1 = new Overloading();
        e1.sum(3, 5);
        e1.sum(5,8,5);
    }
}
