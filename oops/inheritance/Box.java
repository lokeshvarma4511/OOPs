package oops.inheritance;
public  class Box
{
    //    public String greetings;
    int l;
    int pk=4;
//    int weight=5;
//    int weight;
    int b;
    int h;
    private int p1=5;
    Box()
    {
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }
    Box(int l, int b, int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    Box(Box b1)
    {
        this.l=b1.l;
        this.b=b1.b;
        this.h= b1.h;
    }
//    Box()
    public void information()
    {
        System.out.println("Running Box");
    }
//    public void greetings() {
//        System.out.println("welcome to java");
//    }
    static public void greetings()
    {
        System.out.println("Greetings from Box Class");
    }
}