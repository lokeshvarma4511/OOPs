package oops.interfaces;

public class Main
{
    public static void main(String[] args)
    {
//        Car c1= new Car();
//        c1.stop();
//        c1.start();
//        c1.breaks();


        Engine e = new ElectricEngine();
        NiceCar c2 = new NiceCar();
        c2.start();
        c2.stop();
        c2.musicStart();
        c2.musicStop();
        c2.upGradeEngine(e);
        c2.start();
        c2.stop();
    }
}