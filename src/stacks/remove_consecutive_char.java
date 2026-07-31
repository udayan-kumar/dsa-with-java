package src.stacks;

import java.util.*;


public class remove_consecutive_char {
    public static void main(String[] args) {
        character("aaaabbbccdd");
    }
    static void character(String s){
        Stack <Character> s1 = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(s1.size()== 0 || s1.peek()!=ch){
                s1.push(ch);
            }
        }
        System.out.println(s1);
    }
}