package com;

import java.util.Stack;

public class BalancedParanthesis {
public static void main(String[] args) {
	
    String s = "(()(())";
    System.out.println(check(s));;
}

private static int check(String s) {
	Stack<Character> stack = new Stack<Character>();
    int count = 0;
    char c;
    
    for(int i=0;i<s.length();i++) {
    	
			c = s.charAt(i);
			if (c == '(')
				stack.push(c);
			if (c == ')') {

				if (stack.empty()) {
					count = -1;
					return count;
				} else if (stack.peek() == '(') {
					count++;
					stack.pop();
				} else {
					return count;
				}
    	}
    	
    }
    return count;
	
}
}
