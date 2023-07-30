package basics.staticexamples;


//navin reddy
public class Singelton
{
     public static void main(String[] args) {
          Abc obj1= Abc.getInstance();
          Abc obj2= Abc.getInstance();
          System.out.println(obj1);
          System.out.println(obj2);
     }
}
class  Abc
{
     static Abc obj = new Abc();
     private Abc() {     }
     public static Abc getInstance()
     {return obj;}
}


////method 2
//public class Singelton{
//     private Singelton()
//     {
//
//     }
//     private static Singelton obj1;
//     public static Singelton getInstance()
//     {
//          if (obj1==null)
//          {
//               obj1 = new Singelton();
//          }
//          return obj1;
//     }
//}