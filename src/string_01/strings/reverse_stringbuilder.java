public class reverse_stringbuilder {
    public static void main(String[] args) {
        String str = "udayan";
        StringBuilder sb = new StringBuilder(str);

        // sb.reverse();

       sb.deleteCharAt(1);  // delete any index in the string

       sb.insert(2, "h");  // to add any letter in any index of the string

        System.out.println(sb);


        // int i = 0, j = sb.length()-1;
        // while(i<=j){
        //     char temp1 = sb.charAt(i);
        //     char temp2 = sb.charAt(j);
        //     sb.setCharAt(i, temp1);
        //     sb.setCharAt(j, temp1);
        //     i++;
        //     j--;
        // }
        // System.out.println(sb);

        String s = "hitesh";
        StringBuilder sbu = new StringBuilder(s);
        sbu.reverse();
        s = sbu.toString();
        System.out.println(s);

    }
}
