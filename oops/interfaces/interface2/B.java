package oops.interfaces.interface2;

public interface B {
    private void greet() {
        System.out.println("something");
    }

    default void fun(){
        System.out.println("Greetings from B(fun)");
    }
}
