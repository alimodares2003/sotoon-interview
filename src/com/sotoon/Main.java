package com.sotoon;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String test = "Hello, World";
        List<Integer> openP = new ArrayList<>();
        openP.add(1);
        openP.add(1);
        List<Integer> closeP = new ArrayList<>();
        closeP.add(2);
        closeP.add(2);
        String[] chars = new String[test.length()];

        openP.forEach(p -> {
            String c = chars[p];
            if (c != null) {
                chars[p] = "(" + c;
            } else {
                String c2 = String.valueOf(test.charAt(p));
                chars[p] = "(" + c2;
            }
        });

        closeP.forEach(p -> {
            String c = chars[p];
            if (c != null) {
                chars[p] = ")" + c;
            } else {
                String c2 = String.valueOf(test.charAt(p));
                chars[p] = ")" + c2;
            }
        });

        for (int i = 0; i < chars.length; i++) {
            String c = chars[i];
            if (c == null) {
                chars[i] = String.valueOf(test.charAt(i));
            }
        }

        StringBuilder res = new StringBuilder();
        for (String c : chars) {
            res.append(c);
        }
        System.out.println(res);

    }
}
