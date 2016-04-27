import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int length = Integer.parseInt(in.nextLine());
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;

        String[] lineOfNumbers = in.nextLine().split(" ");
     
        for(int i = 0; i < lineOfNumbers.length; i++) {
      
            int lineNumber = Integer.parseInt(lineOfNumbers[i]);
            
            if(lineNumber > 0) {

                positives += 1;

            } else if(lineNumber < 0) {

                negatives += 1;

            } else {

                zeroes += 1;

            }
            
        }

        double positiveAnswer = (double) positives / (double) length;
        double negativeAnswer = (double) negatives / (double) length;
        double zeroAnswer = (double) zeroes / (double) length;
        
        System.out.print(String.format("%.6g%n", positiveAnswer));
        System.out.print(String.format("%.6g%n", negativeAnswer));
        System.out.print(String.format("%.6g%n", zeroAnswer));
        
    }
}
