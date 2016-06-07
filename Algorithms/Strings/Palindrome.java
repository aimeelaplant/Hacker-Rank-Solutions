// https://www.hackerrank.com/challenges/palindrome-index
import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isPalindrome(String string) {
        
        int length = string.length();
        
        for(int i = 0; i < length / 2; i++) {
            if(string.charAt(i) != string.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return true;
        
    }

    public static int getPalindromePosition(String string) {
        
        int length = string.length();
      
        // iterate over half of string
        for(int i = 0; i < length / 2; i++) {
            // get i'th string and length - i - 1 of the string (other end of the string)
            // if characters on either end don't equal each other then we know it's not a palindrome
            int lastChar = length - i - 1;
            if(string.charAt(i) != string.charAt(lastChar)) {

                // delete the character at i'th position                                
                StringBuilder sb = new StringBuilder(string);
                sb.deleteCharAt(lastChar);
                // would use recursion but HackerRank didn't like it, so check again if the removed character makes a palindrome
                // we know it's the other index that makes a palindrome if this doesn't
                if(isPalindrome(sb.toString())) {

                    return lastChar;

                } else {
                    
                    return i;
                    
                }               
            }
                
        }
                    
        // ok it's a palindrome
        return -1;
        
    }
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int numTestCases = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < numTestCases; i++) {
            
            String string = new String(sc.nextLine());

            System.out.println(getPalindromePosition(string));
        }   
    }
}
