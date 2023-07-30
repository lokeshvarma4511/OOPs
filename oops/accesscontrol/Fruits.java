package oops.accesscontrol;

public class Fruits {
    public int pubcost =34;
    protected int protcost= 124;
    int nothingcost =23;
    private int pricost =345;
    void action(){
        //case 2.1(protected) same class
        System.out.println(protcost);
        //case 3.1(nothing) same class
        System.out.println(nothingcost);

        //case 3.1(nothing) same class
        System.out.println(nothingcost);

        //case 4.1(private) same class
        System.out.println(pricost);
    }
}

class Banana extends Fruits{
    void price()
    {
        //case 1.3(public) same package subclass
        System.out.println(pubcost);
        //case 2.3(protected) same package subclass
        System.out.println(protcost);
        //case 3.3(nothing) same package subclass
        System.out.println(nothingcost);

        //case 4.3(private) same package subclass
//        System.out.println(pricost); // not possible
    }

}