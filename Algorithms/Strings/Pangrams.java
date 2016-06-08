// https://www.hackerrank.com/challenges/pangrams
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        String sentence = new String(sc.nextLine().replace(" ", "").toLowerCase());
        
        // initialize hashset (no duplicates)
        HashSet<Character> hashSet = new HashSet<Character>();
        
        
        for(char character : sentence.toCharArray()) {
            // check if character is in alphabet
            if(Character.isLetter(character)) {
                // add unique character to hashset
                hashSet.add(character);
            }
        }
        
        // if hashset size is 26 then it is a pangram!
        System.out.println((hashSet.size() == 26 ? "pangram" : "not pangram"));
        
    }
}
