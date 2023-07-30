package oops.accesscontroldiff;

import oops.accesscontrol.Fruits;

public class Mango2 extends Fruits {
    void price(){
        Fruits ob1= new Fruits();
        //case 1.4(public) diff package sub-class
        System.out.println(ob1.pubcost);
        //case 2.4(protected) diff package sub-class
//        System.out.println(ob1.protcost); //not possible


        //case 3.4(nothing) diff package sub-class
//        System.out.println(ob1.nothingcost); //not possible

        //case 4.4(private) diff package sub-class
//        System.out.println(ob1.pricost); //not possible
    }
}
