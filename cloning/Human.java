package cloning;

public class Human implements  Cloneable{
    int roll;
    String name;
    int[] arr;
    public Human(int roll, String name)
    {
        this.roll=roll;
        this.name=name;
        this.arr=new int[] {4,6,7,55,7,3,6};
    }

//    public Human(Human other) {
//        this.roll=other.roll;
//        this.name= other.name;
//
//    }
    public  Object clone() throws CloneNotSupportedException
    {
//        case 2 (shallow copy)
//        return super.clone();

//        case 3 ( deep copy )

        Human twin = (Human)super.clone();
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i <twin.arr.length ; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
