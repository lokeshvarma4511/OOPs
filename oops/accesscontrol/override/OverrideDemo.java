package oops.accesscontrol.override;

public class OverrideDemo {
    int num;
    public OverrideDemo(int num) {
        this.num=num;
    }

    //    case 1

    @Override
    public int hashCode() {
        return super.hashCode(); // gives the unique numerical identification of the object
    }
    //    case 2
//    @Override
//    public int hashCode() {
//        return num;  // instead , it returns the number passed to the object
//    }

    @Override
    public boolean equals(Object obj)
    {
        return  this.num ==((OverrideDemo)obj).num;
    }

    public static void main(String[] args) {
//        case 1
        OverrideDemo o1 = new OverrideDemo(23);
//        System.out.println(o1.hashCode());
//        case 2
//        OverrideDemo o2 = new OverrideDemo(23);
//        System.out.println(o2.hashCode());

        OverrideDemo o3 = new OverrideDemo(23);
        if (o1==(o3))
        {
            System.out.println("obj1 is equals to o3");

        }
        if (o1.equals(o3))
        {
            System.out.println("obj1 is equals to o3");
        }


        // .    g    e    t    C    l    a      s      s
        System.out.println(o1.getClass());
        System.out.println(o1.getClass().getName());


        // I     N      S      T     A    N     C      E    O      F
        instanceo inst1 = new instanceo(345);
        System.out.println(inst1 instanceof OverrideDemo);
        System.out.println(inst1 instanceof Object);
        System.out.println(inst1 instanceof instanceo);

    }
}