// https://www.hackerrank.com/challenges/funny-string
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        
        int numTestCases = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < numTestCases; i++) {
        
            String funnyString = new String(sc.nextLine());
            
            boolean flag = true;
            
            for(int j = 1; j < funnyString.length(); j++) {
            
                // can get the reverse doing funnyString.length() - j !
                if(Math.abs(funnyString.charAt(j) - funnyString.charAt(j - 1)) != Math.abs(funnyString.charAt(funnyString.length() - j) - funnyString.charAt(funnyString.length() - j - 1))) {
                
                    // set flag
                    flag = false;
                    
                    // break out of statement and go to next statement. no need to iterate over loop again.
                    break;
                    
                }
            }
            
            System.out.println((flag == true ? "Funny" : "Not Funny"));
            
        }
        
    }
}
