package collections.enumExample;

public class enumExample {
    enum Week implements enumint

    {
        Monday, tue, wed,thur,fri,sat,sun;
//        enums cannot extend anything(class)
//        but can implements interfaces
//        Week is public, static, final, so we can't create child constants

        Week(){
            System.out.println("Day "+this);
        }

        @Override
        public void display() {
            System.out.println("From interface enumint");
        }
    }

    public static void main(String[] args) {
        Week week= Week.Monday;
        week.display();

        System.out.println(Week.valueOf("thur"));


        //Internally:
                               // public static final Week Monday= new Week();
//        System.out.println(week);
//        System.out.println("\n");
//
//        for (Week w:
//             week.values()) {
//            System.out.println(w);
//        }
//        System.out.println(week.ordinal());
    }
}