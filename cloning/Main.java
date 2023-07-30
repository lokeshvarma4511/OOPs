package cloning;

import java.util.Arrays;

public class Main {

    // cloning object, but it takes long time
    public static void main(String[] args) throws  CloneNotSupportedException{
        Human h1 = new Human(2, "loki");
//        case 1
//        Human h2 = new Human(h1);
//        System.out.println(h2.name);
//        System.out.println(h1.name);

//        case 2 (Shallow copy)
        Human h3= (Human)h1.clone();
//        System.out.println(h3.roll);
        h3.roll=4;
        h3.name="apple";
        h1.arr[0]=421;
        System.out.println(h1.roll);
        System.out.println(Arrays.toString(h1.arr));
        System.out.println(h1.name+"\n");
        System.out.println(h3.roll);
        System.out.println(h3.name);
        System.out.println(Arrays.toString(h3.arr));
    }
}