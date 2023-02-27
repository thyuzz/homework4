package org.example.task2;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */

public class Main {


    static boolean isValid(String s){
        LinkedList <Character> head = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if ((ch == '(') || (ch == '{') || (ch == '[')){
                head.push(ch);
            }
            else if (((ch == ')' && head.peek() == '(') ||
                            (ch == '}' && head.peek() == '{') ||
                                    (ch == ']'  && head.peek() == '[')) && head.isEmpty() != true){
                head.pop();
            }
            else { return false; }
        }
        return head.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}