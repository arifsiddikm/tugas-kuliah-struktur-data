/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihanstack2;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author mac
 */
public class LatihanStack2 {

    public static void main(String[] args) {

            
        Stack<String> sk=new Stack<String>();
        sk.push("a");
        sk.push("c");
        sk.push("e");
        sk.push("d");
        Iterator it=sk.iterator();
        System.out.println("Size before pop() : "+sk.size());
        while(it.hasNext()) {
            String iValue = (String)it.next();
            System.out.println("Iterator value : "+iValue);
        }
        
        String value = (String)sk.pop();
        System.out.println("value :"+value);
        System.out.println("Size After pop() : "+sk.size());
        
        
        

    }
}
