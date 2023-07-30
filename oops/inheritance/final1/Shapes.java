package oops.inheritance.final1;
public class Shapes {

    int apple= 56;
    void area()
    {
        System.out.println("This is area");
    }



    void shape(){
        System.out.println("I am the shape");
    }

    // early binding : prevents other to override method
//    final void area()
//    {
//        System.out.println("This is shape");
//    }
}
