package oops.example;
public class Pack1 {
    String name;
    int classn;
    Character section;
    static String school="KARE";
     static int count;
    public Pack1(String name, int classn,Character section){
        this.name=name;
        this.classn= classn;
        this.section=section;
        Pack1.school=school;
        Pack1.count+=1;
    }
}