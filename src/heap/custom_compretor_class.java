package src.heap;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;

    Student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }

    @Override 
    public int compareTo(Student s){
        return this.rno - s.rno;
    }
}

public class custom_compretor_class {
    public static void main(String[] args) {
        Student s1 = new Student("udayan", 126, 9.9);
        Student s2 = new Student("dipshikha", 197, 8.9);
        Student s3 = new Student("ritika", 196, 8.5);
        Student s4 = new Student("sakina", 144, 7.0);
        Student s5 = new Student("shweta", 122, 9.3);
        Student s6 = new Student("annu", 113, 8.2);

        Student[] arr = {s1, s2, s3, s4, s5, s6};

        Arrays.sort(arr);

        for(Student s : arr){
            System.out.println(s.name + " " + s.rno + " " + s.cgpa);
        }
    }
}
