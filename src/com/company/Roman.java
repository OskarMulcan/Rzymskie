package com.company;

public class Roman {
    public boolean sprawdzanko(String string) {
        int n = string.length();
        boolean x = true;
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) != 'I' && string.charAt(i) != 'V' && string.charAt(i) != 'X' && string.charAt(i) != 'L' && string.charAt(i) != 'C' && string.charAt(i) != 'D' && string.charAt(i) != 'M') {
                x = false;
            } else {
                x = true;
            }
        }
        return x;
    }

    public int rChar (char ch){
        if (ch == 'I') {
            return 1;
        } else if (ch == 'V') {
            return 5;
        } else if (ch == 'X') {
            return 10;
        } else if (ch == 'L') {
            return 50;
        } else if (ch == 'C') {
            return 100;
        } else if (ch == 'D') {
            return 500;
        } else {
            return 1000;
        }
    }
}
