package oops.inheritance.final1;
public class Traingle extends Shapes
{
    String triname = "traingle";
    void area()
    {
        System.out.println("This is triangle area");
    }
    void triShape(){
        System.out.println("Traingle shape");
    }
    public static void main(String[] args) {
        Traingle t1 = new Traingle();
        t1.area();
        t1.shape();

        /* not possible
        because nmae,triShape are the prop. of Traingle,
        but obj created have the prop. of only reference class(obj. type)
         */
//        Shapes t3 = new Traingle();
//        System.out.println(t3.triname);
//        t3.triShape();

        //possible because name is the property of Traingle class
        Traingle t2 = new Traingle();
        System.out.println(t1.triname);
    }
}