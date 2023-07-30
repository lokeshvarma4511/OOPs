package oops.abstractt;
public class Main {
    public static void main(String[] args) {
        Child c1= new Child();
        c1.carrer("POLICE");
        c1.partner("HUsk");
        //can't create abstract class until we implement it while creating obj
        Parent p1 = new Parent("dfg") {
            @Override
            void carrer(String name) {

            }
            @Override
            void partner(String pname) {
            }
        };
        p1.carrer("sidnf");
        Parent.nmaes();
        c1.hi();
}
}