import java.io.*;
import java.util.*;

public class Solution {
   
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int length = Integer.parseInt(sc.nextLine());
        
        // sum of 0th index of first line array, 1st index of second line array, 2nd index of last line array
        int primaryDiagonal = 0;
        
        // sum of last index of first line array, 1st index of second array, first index of last line array
        int secondaryDiagonal = 0;
        
        for(int i = 0; i < length; i++) {

            // splits line by spaces into string array
            
            // 0th pass: lineOfNumbers = 11 2 4
            // 1th pass: lineOfNumbers = 4 5 6
            // 2th pass: lineOfNumbers = 10 8 -12
            String[] lineOfNumbers = sc.nextLine().split(" ");
            
            // adds the ith number of the string array
            // example: lineOfNumbers[0] = 11
            // example: lineOfNumbers[1] = 5 
            // example: lineOfNumbers[2] = -12
            primaryDiagonal += Integer.parseInt(lineOfNumbers[i]);
            
            // adds the (3 - 1 - ith) of the string array 
            // example: lineOfNumbers[2] = 4  (index is 3 - 1 - 0 = 2)
            // example: lineOfNumbers[1] = 5
            // example: lineOfNumbers[0] = 10
            secondaryDiagonal += Integer.parseInt(lineOfNumbers[lineOfNumbers.length-1-i]);              
        }
        
        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));

    }
}
