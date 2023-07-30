package oops.interfaces;
public class Car implements Engine, Media, Break {
    @Override
    public void breaks() {
        System.out.println("break pressed");
    }

    @Override
    public void start() {
        System.out.println("normal engine started");
    }

    @Override
    public void stop() {
        System.out.println("normal engine stopped");
    }

//    @Override
//    public void start()
//    {
//        System.out.println("Media started");
//    }
//    @Override
//    public void stop() {
//        System.out.println("Media stopped");
}