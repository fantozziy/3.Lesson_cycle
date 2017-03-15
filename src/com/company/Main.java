package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        int i;
        int k = 0;
        for (i = 0; i < 10; ++i) {
            System.out.print(i + 1);
            System.out.println(" *");
            if (i == 5) {
                k = i;
            }
        }
        System.out.println(k);
        */
        int j;
        for (j = 0; j <= 10; ++j) {
            if (j%2 == 0 & j != 0) {
                System.out.print(j);
                System.out.println(" - это число четное");
            } else if (j%2 !=0 & j != 0) {
                System.out.print(j);
                System.out.println(" - это число нечетное");
            }
        }
    }
}
