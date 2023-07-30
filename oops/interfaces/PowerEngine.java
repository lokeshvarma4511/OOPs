package oops.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start(){
        System.out.println("starts like a Power engine");
    }
    @Override
    public void stop(){
        System.out.println("stop like a Power engine");
    }

}