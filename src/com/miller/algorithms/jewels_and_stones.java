package com.miller.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author miller
 * @Description https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class jewels_and_stones {
    public int numJewelsInStones(String J, String S) {
        String str = S;
        for (int i = 0; i < J.length(); i++) {
            str = str.replaceAll(String.valueOf(J.charAt(i)), "");
        }
        return S.length() - str.length();
    }

    public int numJewelsInStones2(String J, String S) {
        Set<Character> jewelSet = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            jewelSet.add(J.charAt(i));
        }
        int num = 0;
        for (int i = 0; i < S.length(); i++) {
            if (jewelSet.contains(S.charAt(i))) {
                num++;
            }
        }
        return num;
    }

    public int numJewelsInStones3(String J, String S) {
        int num = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (J.charAt(j) == S.charAt(i)) {
                    num++;
                }
            }
        }
        return num;
    }
}
