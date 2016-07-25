/* https://www.hackerrank.com/challenges/arrays-ds */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int numIntegers = Integer.parseInt(sc.nextLine());
        
        String[] lineOfNumbers = sc.nextLine().split(" ");
        
        for (int i=0; i < lineOfNumbers.length; i++) {
            System.out.print(Integer.parseInt(lineOfNumbers[lineOfNumbers.length - 1 - i]) + (lineOfNumbers.length - 1 - i != 0 ? " " : ""));
        }
    }
}
