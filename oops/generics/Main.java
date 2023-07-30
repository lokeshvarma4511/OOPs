package oops.generics;

public class Main
{
    public static void main(String[] args) {
        Student s1 = new Student(1, 67);
        Student s2 = new Student(2, 76);
        if (s1.compareTo(s2)<0)
        {
            System.out.println("s2 has more marks");
        }
    }
}