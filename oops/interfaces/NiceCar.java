package oops.interfaces;

public class NiceCar
{
    private Engine engine;
    private Media player = new CDPlayer();
    public NiceCar(){
        this.engine= new Car();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void musicStart(){
        player.start();
    }
    public void musicStop(){
        player.stop();
    }
    public void upGradeEngine(Engine engine)
    {
        System.out.println("Engine Upgraded");
        this.engine=engine;
    }
}
