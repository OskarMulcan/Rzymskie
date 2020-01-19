package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Roman roman = new Roman();
        Scanner scanner = new Scanner(System.in);
        String rNumber = scanner.next();
        rNumber = rNumber.toUpperCase();
        while (roman.sprawdzanko(rNumber) == false) {
            System.out.println("Wrong notation");
            rNumber = scanner.next();
        }
        int dNumber = 0;
        int n = rNumber.length();
        for (int i = 0; i < n; i++) {
            if (i > 0 && roman.rChar(rNumber.charAt(i)) >= roman.rChar(rNumber.charAt(i-1))) {
                dNumber += roman.rChar(rNumber.charAt(i)) - 2 *  roman.rChar(rNumber.charAt(i-1));
            } else {
                dNumber += roman.rChar(rNumber.charAt(i));
            }
        }

        System.out.println(rNumber + "\n" + dNumber);
    }
}
