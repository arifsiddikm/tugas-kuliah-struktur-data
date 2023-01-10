package com.mycompany.latihanstack1;
import java.util.Stack;
/**
 *
 * @author Arif Siddik Muharam
 */
public class LatihanStack1 {
    public static void main(String[] args) { 
        Stack s = new Stack();
        s.push("Java");
        s.push("source");
        s.push("and");
        System.out.println("Next : "+ s.peek());
//        s.push("Support");
        s.push("Next : Support");
        System.out.println(s.pop());
        s.push(".");
        int count = s.search("Java");
        while (count != -1 && count > 1) {
            s.pop(); 
            count--; 
        }
        System.out.println(s.pop());
        System.out.println(s.empty());
        
    }
}
