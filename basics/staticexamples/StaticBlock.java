package basics.staticexamples;

public class StaticBlock {

    static int roll;
    static String name;

    // only runs once regardless of if any objects created or not
    static
    {
        System.out.println("static block");
        name="name from static block";
    }
    public static void main(String[] args) {
        System.out.println(name);
        StaticBlock s1=new StaticBlock();
        System.out.println(s1.name);
        s1.name = "apple";
        StaticBlock s2= new StaticBlock();
        System.out.println(s2.name);


    }
}
