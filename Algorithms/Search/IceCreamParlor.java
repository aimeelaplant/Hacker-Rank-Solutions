/* https://www.hackerrank.com/challenges/icecream-parlor */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int numTestCases = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < numTestCases; i++) {
            int dollars = Integer.parseInt(sc.nextLine());
            int numFlavors = Integer.parseInt(sc.nextLine());
            
            String[] flavors = sc.nextLine().split(" ");
            
            for(int k = 0; k < numFlavors; k++) {
                int currentVal = Integer.parseInt(flavors[k]);
                
                for(int j = k + 1; j < numFlavors; j++) {
                    int nextVal = Integer.parseInt(flavors[j]);
                    if(currentVal + nextVal == dollars) {
                        int finalK = k + 1;
                        int finalJ = j + 1;
                        if(k <= j) {
                            System.out.println(finalK + " " + finalJ);
                        } else {
                            System.out.println(finalJ + " " + finalK);
                        }
                        
                    }
                }
            }
            
        }
        
    }
}
