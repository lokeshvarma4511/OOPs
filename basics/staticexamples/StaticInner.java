package basics.staticexamples;
//case1
//gives error
//public class StaticInner {
//    class Test
//    {
//        String name;
//        Test(String name){
//            this.name= name;
////        }
//    }
//
//    public static void main(String[] args) {
////        Test t1 = new Test("apple");
//        Test t1 = new Test();
//    }
//}

//case2
public class StaticInner {
    static class Test
    {
        static String name;
        Test(String name){
            this.name= name;
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test("apple");
        Test t2 = new Test("ball");
        System.out.println(t1.name+" "+ t2.name);
    }
}