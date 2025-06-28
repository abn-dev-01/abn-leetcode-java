package pro.abnjava.leetcode.t02;

public class Solution {
    public static void main(String[] args) {
        var s = new Solution();

        System.out.println(" result1 : " + s.isPalindrome(123));
        System.out.println(" result1 : " + s.isPalindrome(121));
        System.out.println(" result1 : " + s.isPalindrome(12321));
        System.out.println(" result1 : " + s.isPalindrome(123214));

    }

    private boolean isPalindrome(int i) {
        var s = i + "";

        var left = 0;
        var right = s.length() - 1;

        while (left != right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

}
