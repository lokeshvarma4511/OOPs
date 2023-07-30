package oops.abstractt;

abstract public class Parent {

    private String names;
    private String PName;

    protected Parent(String names) {
        this.names = names;
    }

//    Parent(String name, String PName) {
//        this.name=name;
//        this.PName=PName;
//    }

public static void nmaes()
{
    System.out.println("NO Names");
}

    abstract void carrer(String name);

    abstract void partner(String pname);

    void hi(){
        System.out.println("hi");
    }
}