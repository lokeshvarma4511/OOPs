package oops.example;

import oops.example.Pack1;

public class Pack2 {
    public static void main(String[] args) {
        Pack1 s1=new Pack1("hari",7,'A');
        System.out.println(s1.count);
        Pack1 s2 = new Pack1("mahi", 7, 'B');
        System.out.println(s2.count);
        System.out.println(Pack1.school+" "+ Pack1.count);
    }
}