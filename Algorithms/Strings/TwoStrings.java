// https://www.hackerrank.com/challenges/two-strings
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);

        int numTestCases = Integer.parseInt(sc.nextLine());
        
        testCase:
            for(int i=0; i < numTestCases; i++) {

                String[] firstWord = sc.nextLine().split("");
                String[] secondWord = sc.nextLine().split("");

                HashSet<String> hsFirstWord = new HashSet<String>();

                for(int j=0; j < firstWord.length; j++) {
                    // add word to hashset with no duplicates
                    hsFirstWord.add(firstWord[j]);
                }

                HashSet<String> hsSecondWord = new HashSet<String>();            

                for(int k=0; k < secondWord.length; k++) {
                    // add second word to hashset. again, no duplicates!
                    hsSecondWord.add(secondWord[k]);
                }

                // iterate over smallest hashset
                if(hsFirstWord.size() <= hsSecondWord.size()) {                    
                    for(String item : hsFirstWord) {
                        // check if the item is in the second hashSet     
                        if(hsSecondWord.contains(item)) {
                            System.out.println("YES");
                            // go to next testCase
                            continue testCase;
                        }
                       }  
                } else {
                    for(String item : hsSecondWord) {
                       if(hsFirstWord.contains(item)) {
                           System.out.println("YES");
                           continue testCase;
                       }
                    }                
                }

                System.out.println("NO");

            }
    }
}
