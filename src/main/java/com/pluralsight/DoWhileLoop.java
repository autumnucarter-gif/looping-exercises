package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        public class WhileLoop {
    public static void main(String[] args) {
        int loveLoop = 1;
        while (loveLoop < 6) {
            System.out.println("I love Java");
            loveLoop++;
        }
        System.out.println();

         */

        int doLoveLoop = 1;

        do {
            System.out.println("I love Java");
            doLoveLoop++;
        }while (doLoveLoop < 6);

        System.out.println();
    }
}
