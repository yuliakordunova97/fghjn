package com.company;

public class FirstProg {

    public static void main(String[] args) {
        boolean a1 = true;
        boolean a2 = false;
        boolean a3 = a1 || a2;
        System.out.println(a3); // t
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 && b2;
        System.out.println(b3); // f
        boolean c = true;
        boolean d = false;
        boolean e = true;
        boolean result = c && (d || e);
        System.out.println(result); //t

        boolean g = true;
        boolean h = !g;
        System.out.println(h); // f
    }
}
