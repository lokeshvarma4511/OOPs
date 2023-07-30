package oops.accesscontroldiff;

import oops.accesscontrol.Fruits;
public class Mango {
    void price(){
        Fruits ob1= new Fruits();
        //case 1.5(public) diff package not a sub-class
        System.out.println(ob1.pubcost);
        //case 2.5(protected) diff package not a sub-class
//        System.out.println(ob1.protcost);//not possible


        //case 3.5(nothing) diff package not a sub-class
//        System.out.println(ob1.nothingcost);//not possible

    }
}