/* https://www.hackerrank.com/challenges/the-love-letter-mystery/submissions/code/25585444 */
import java.io.*;
import java.util.*;

public class Solution {
    
    public static int countToMakePalindrome(String s)
    {
        int count = 0;
        if (s.length() >= 2) {
         
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    count += Math.abs(s.charAt(i) - s.charAt(s.length() - 1 - i));
                }
            }
        }                    
       return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < testCases; i++) {
            String testCase = sc.nextLine();
            System.out.println(countToMakePalindrome(testCase));
        }
        
        
    }
}
