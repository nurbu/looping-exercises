package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {
        // Prints count down from 10 to 1 and then prints launch

        for (int i = 10; i > -1; i--) {
            if (i == 0) {
                System.out.println("Launch!");
                continue;
            }
            System.out.println("Launch in " + i);

        }
    }
}
