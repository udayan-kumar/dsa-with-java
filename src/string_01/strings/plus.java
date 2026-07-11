public class plus {
    public static void main(String[] args) {
        String str = "udayan";
        str += "is a very good boy";
        str += 10;
        str += '\n';   // change the line in same string
        str += "singh";

        System.out.println(str);

        // System.out.println("udayan" + 10 + 20);  // if i add integer in string than integer will converted in string and add like a astring

        System.out.println(10 + 20 + " udayan " );
    }
}
