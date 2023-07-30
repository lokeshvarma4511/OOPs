package basics.staticexamples;
public class S3tatic {
    public static void main(String[] args)
    {
//        can`t access
//        fun();
//        can access
        enjoy();
        //accessing non static method by creating object
        S3tatic s2= new S3tatic();
        s2.fun();
        int n=45;
    }
    // non static method, requires an object to access
    void fun(){
        enjoy();
        System.out.println("fun fun");
        System.out.println(name);
        System.out.println(name1);
    }
    static String name="kare";
    String name1 = "keke";
    // static method, not needed an object
    static void enjoy(){
        //can't access   because name1 is static
//        System.out.println(name1);
        System.out.println(S3tatic.name);
        // can't access cause it is non static method
//        fun();
        System.out.println("enjoying enjoying");
        // way to use non static methods inside a static method
        S3tatic s1=new S3tatic();
        s1.fun();
        // accessing non static variable
        System.out.println(s1.name1);
//        main();
    }
}