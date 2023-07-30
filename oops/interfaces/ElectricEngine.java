package oops.interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start(){
        System.out.println("starts like a Electric engine");
    }
    @Override
    public void stop(){
        System.out.println("stops like a Electric engine");
    }
}
