# https://www.hackerrank.com/challenges/mars-exploration
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char[] ar = S.toCharArray();
        int count = 0;
        for (int i = 0; i < ar.length; i += 3) {
            if (ar[i] != 'S') {
                count++;
            } 
            if (ar[i + 1]  != 'O') {
                count++;
            } 
            if (ar[i + 2] != 'S') {
                count++;
            }
        }
        System.out.println(count);
    }
}
