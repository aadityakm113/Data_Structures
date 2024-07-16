package Stacks;

import java.util.Stack;

public class Functions {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        s.push('A');
        s.push('B');
        s.push('C');
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());

    }    
}