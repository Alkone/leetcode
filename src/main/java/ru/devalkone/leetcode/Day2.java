package ru.devalkone.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Day2 {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        var rm = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);

            if ((rm.containsKey(cS) && !rm.get(cS).equals(cT)) || (!rm.containsKey(cS) && rm.containsValue(cT))) {
                return false;
            } else {
                rm.put(cS, cT);
            }
        }
        return true;
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
