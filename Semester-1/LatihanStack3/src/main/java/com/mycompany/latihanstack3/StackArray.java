/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihanstack3;

/**
 *
 * @author mac
 */
class StackArray {
    
    private  static final int capacity = 3;
    int arr[] = new int[capacity];
    int top = 1;
    
    public void push(int pushedElement) {
        if(top < capacity - 1) {
            top++;
//            int pushElement = 0;
            arr[top] = pushedElement;
            System.out.println("Element : "+pushedElement + " is pushed to Stack !");
            printElements();
        }
        else {
            System.out.println("Stack overflow : ");
        }
    }
    
    public void pop() {
        if(top >= 0) {
            top--;
            System.out.println("Pop operation done !");
        }
        else {
            System.out.println("Stack underflow !");
        }
    }
    
    public void printElements() {
        if(top >- 0) {
            System.out.println("Elements in stack : ");
            for(int i=0; i<= top;i++) {
                System.out.println(arr[i]);
            }
        }
    }
    
    public static void main(String[ ] args) {
        StackArray stackDemo = new StackArray();
        stackDemo.pop();
        stackDemo.push(23);
        stackDemo.push(2);
        stackDemo.push(73);
        stackDemo.push(21);
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
        
    }

//    private void printElement() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
