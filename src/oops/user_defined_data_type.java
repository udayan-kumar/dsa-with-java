package src.oops;

import java.util.*;

public class user_defined_data_type {
    public static class Student{  // khudka ake data type banaliya hai...
        String name;
        int roll;
        double cgpa;
    }
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);  // input
        Student s = new Student();  // declaration..
        s.name = "udayan singh";
        s.roll = 123;
        s.cgpa = 9.5;

         Student s1 = new Student();  // declaration..
        s1.name = "tannu singh";
        s1.roll = ud.nextInt();
        s1.cgpa = 9.8;

         Student s2 = new Student();  // declaration..
        s2.name = "mannu singh";
        s2.roll = 979;
        s2.cgpa = 9.7;

        System.out.println(s.name);

        s2.cgpa = 6.5;  // update value
        System.out.println(s2.cgpa);

        System.out.println(s1.roll);
    }
}
