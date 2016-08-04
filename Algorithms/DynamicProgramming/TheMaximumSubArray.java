/* https://www.hackerrank.com/challenges/maxsubarray */
import java.io.*;
import java.util.*;

public class Solution {

    public static int getGreatestNegative(int numIntegers, String[] integers)
    {
        int greatestNegative = Integer.parseInt(integers[0]);
        for (int k = 0; k < numIntegers; k++) {
            int integer = Integer.parseInt(integers[k]);

            if (integer > greatestNegative) {
                greatestNegative = integer;
            }
        }
        return greatestNegative; 
    }
    public static int getContiguousMax(int numIntegers, String[] integers, boolean allNegative) {

        int maxInLoop = 0;
        int contiguousMax = 0;

        if (numIntegers == 1) {
            return Integer.parseInt(integers[0]);
        }
 
        if (allNegative) {
            return getGreatestNegative(numIntegers, integers);
        }

        for (int j = 0; j < numIntegers; j++) {
            int currentNum = Integer.parseInt(integers[j]);
            maxInLoop = maxInLoop + currentNum;
            if (maxInLoop < 0) {
                // reset count
                maxInLoop = 0;
            }
            if (maxInLoop > contiguousMax) {
                contiguousMax = maxInLoop;
            }
        }
        
        return contiguousMax;
    }
    
    public static int getNonContiguousMax(int numIntegers, String[] integers, boolean allNegative) {
        
        int maxSoFar = 0;

        if (allNegative) {
            return getGreatestNegative(numIntegers, integers);
        }

        for (int i = 0; i < numIntegers; i++) {
            int integer = Integer.parseInt(integers[i]);
            if (integer > 0) {
                maxSoFar = maxSoFar + integer;
            }
        }

        return maxSoFar;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numTestCases = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < numTestCases; i++) {
            int numIntegers = Integer.parseInt(sc.nextLine());
            String[] integers = sc.nextLine().split(" ");
            boolean allNegative = false;
            int negativeCount = 0;
            
            for (int j = 0; j < numIntegers; j++) {
                int integer = Integer.parseInt(integers[j]);
                if (integer < 0) {
                    negativeCount++;
                }
            }
            
            if  (negativeCount == numIntegers) {
                allNegative = true;
            }
            
            int contiguousMax = getContiguousMax(numIntegers, integers, allNegative);
            int nonContiguousMax = getNonContiguousMax(numIntegers, integers, allNegative);

            System.out.println(contiguousMax + " " + nonContiguousMax);
            
        }
    }
}
