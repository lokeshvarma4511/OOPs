package oops.abstractt;

public  class Child extends Parent {
    public Child() {
        super("sdag");
    }

    @Override
    void carrer(String name)
    {
        System.out.println("I'm going to become "+name );
    }

    @Override
    void partner(String pname) {
        System.out.println(" Her name is "+ pname);
    }

    @Override
    void hi(){
        super.hi();
    }
}