package src.oops;

public class marks {
    public static class studentdata{
        String name;
        int rno;
        int[] marks;

        studentdata(int s){
            marks = new int[s];
        }

        studentdata(int[] s){
            marks = s;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        studentdata s1 = new studentdata(arr);
        s1.marks[1] = 43;
        System.out.println(s1.marks[1]);
        studentdata s2 = new studentdata(3);
        studentdata s3 = new studentdata(8); // intialise array with nw size

        s2.marks[0] = 89;
        s2.marks[1] = 67;
        s2.marks[2] = 97;
        
    }
}
