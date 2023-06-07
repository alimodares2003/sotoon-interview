package com.sotoon;

//public class MainPrint {

//    public static void main(String[] args) {
////        new Testing().runable();
//        Model model = new Model();
//        System.out.println(model.count);
//        model.change(50);
//        System.out.println(model.count);
//    }

public class MainPrint {
    public static void main(String[] args) {
        String s = "IIVV";
        int res = 0;
        for (int i = 0; i <= s.length(); i++) {
            int n = charToNUmber(String.valueOf(s.charAt(i)));
//            if (i + 1 == s.length()) {
//                int before = charToNUmber(String.valueOf(s.charAt(i - 1)));
//                if (before >= n)
//                    res += n;
//                break;
//            }
            int next = charToNUmber(String.valueOf(s.charAt(i + 1)));
            if (n < next) {
                res += next - n;
            } else {
                res += n;
            }
        }
        int a = 30;
        int b = 45;
        System.out.println("Before swapping, a = " + a + " and b = " + b);
        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping, a = " + a + " and b is " + b);
    }

    public static void swapFunction(int a, int b) {
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
        // Swap n1 with n2
//            int c = a;
        a = b;
        b = a;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);

    }


    private static int charToNUmber(String s) {
        switch (s) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;
        }
    }
}
//}
