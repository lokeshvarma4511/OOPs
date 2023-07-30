package oops.accesscontrol;

    //package not a subclass
public class Grape  {
    void price()
    {
        Fruits f1 = new Fruits();
//        case 1.2(public) same package not a sub class
        System.out.println(f1.pubcost);
//        case 2.2(protected) same package not a sub class
        System.out.println(f1.protcost);
//        case 3.2(nothing) same package not a sub class
        System.out.println(f1.nothingcost);


//        case 4.2(private) same package not a sub class
//        System.out.println(f1.pricost); // not possible


    }
}