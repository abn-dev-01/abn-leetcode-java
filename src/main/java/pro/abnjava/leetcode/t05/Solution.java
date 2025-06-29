package pro.abnjava.leetcode.t05;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        var s = new Solution();
        String ss = "()({])";
        System.out.println(" result1 : " + s.isValid(ss));

        ss = "()({[]})";
        System.out.println(" result1 : " + s.isValid(ss));

    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '[') stack.push(']');
            else if (ch == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        return true;
    }

}
