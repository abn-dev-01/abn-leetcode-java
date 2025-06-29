package pro.abnjava.leetcode.t03;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        var s = new Solution();

        System.out.println(s.romanToArabic("III"));
        System.out.println(s.romanToArabic("V"));
        System.out.println(s.romanToArabic("X"));

        System.out.println(s.romanToArabic("IV"));
        System.out.println(s.romanToArabic("IX"));

        System.out.println(s.romanToArabic("LXXVII"));
        System.out.println(s.romanToArabic("LXXVIII"));
        System.out.println(s.romanToArabic("DCCXXII"));

    }

    private int romanToArabic(String roman) {
        var map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        var result = 0;
        char chars[] = roman.toCharArray();
        int i, j;

        for (i = 0, j = 1; j < roman.length(); i++, j++) {
            String c1 = String.valueOf(chars[i]);
            String c2 = String.valueOf(chars[j]);
            if (map.get(c1) >= map.get(c2)) {
                result += map.get(c1);
            } else {
                result -= map.get(c1);
            }
        }
        result += map.get(String.valueOf(chars[i]));
        return result;
    }

}
