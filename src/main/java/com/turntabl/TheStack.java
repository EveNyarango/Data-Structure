package com.turntabl;
import java.util.Stack;

public class TheStack {

/**
stack represents Last in First out (LIFO)
Extends vectors
Pop removes 1st element of the stack
Peek shows 1st element of the stack
Push adds elements in the stack
 */
public static void main(String[] args) {
    Stack<Integer> stack1 = new Stack<>();
    stack1.push(3);
    stack1.push(2);
    stack1.push(1);
    System.out.println(stack1.size());
    System.out.println(stack1.peek());
    System.out.println(stack1.isEmpty());

}

}
