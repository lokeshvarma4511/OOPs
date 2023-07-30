package oops.inheritance;
// BoxInheritance have 4 parameters weight, including parameters of class Box so its inherited from Box
public class BoxInheritance extends  Box{
//        Box b4= new Box();
    int weight;

    BoxInheritance()
    {}

    BoxInheritance(BoxInheritance other)
    {
        super(other);
        this.weight=other.weight;
    }

     BoxInheritance(int l, int b, int h, int weight){
         // calling constructor of Box class for first 3 parameters
//         super(l,b,h);
//         this.;
         // assigining remaining 1 parameters of this class
//         this.weight=super.weight;
//         this.weight=weight;
     }

//     @Override
    static public void greetings() {
        System.out.println("Greetings from BoxInheritance class");
    }
}