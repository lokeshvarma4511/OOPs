package oops.interfaces.interface2;

public interface A {
    public void greet();
//    s           t          a           t           i                 c
    static void greetings(){
        System.out.println("Greetings from greetings method located in A interface");
    }


    default void fun(){
        System.out.println("greetings from A");
    }
}
