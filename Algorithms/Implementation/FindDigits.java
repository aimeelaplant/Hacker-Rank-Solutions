// https://www.hackerrank.com/challenges/find-digits
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < testCases; i++) {
            
            int wholeInt = Integer.parseInt(sc.nextLine());
            int count = 0;
            
            String[] stringArray = Integer.toString(wholeInt).split("");
            for(int j = 0; j < stringArray.length; j++) {

                int num = Integer.parseInt(stringArray[j]);

                if(num != 0) {
                    if(wholeInt % num == 0) {
                        count++;
                    }
                    
                }
                                
            }
            
            System.out.println(count);
        }
    }
}
