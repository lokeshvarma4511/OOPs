package oops.inheritance;

public class MainBox {
    public static void main(String[] args) {


//        Box b1 = new Box();
//        System.out.println(b1.l+ " "+ b1.w+" "+b1.h);
//        System.out.println();

        Box b2 = new Box(2, 5, 5);
        System.out.println(b2.l+ " "+ b2.b+" "+b2.h);
//
//        //passing object while initializing object

        Box b3= new Box(b2);
        System.out.println(b2.l+ " "+ b2.b+" "+b2.h);

        BoxInheritance b4 = new BoxInheritance(3,25,5,90);
        System.out.println(b4.l+ " "+ b4.b+" "+b4.h+" "+b4.weight);

        // trying to access private variables of Box
//        System.out.println( b4.p1);

        // Dynamic method Dispatch
        Box b5=new BoxInheritance(7,8,6,9);

//        b5.greetings();
        //can't access
//        System.out.println(b5.weight);

        // can't perform
        // here obj is of type parent class
        // because parent class can't call constructor of child class
//        BoxInheritance b7 = new Box(3,5,3);
        Box b8= new BoxInheritance(23,2345,2,7);
//        System.out.println(b7.weight);

//        Box.greetings();

        // calling static methods from Box class

        BoxInheritance b11 = new BoxInheritance();
        b11.greetings();

        Box b12 = new BoxInheritance();
        b12.greetings();

        Box b10 = new Box();
        b10.greetings();
    }
}