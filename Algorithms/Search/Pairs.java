/* https://www.hackerrank.com/challenges/pairs */
import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String[] numberString = sc.nextLine().split(" ");
        int numbers = Integer.parseInt(numberString[0]);
        int difference = Integer.parseInt(numberString[1]);
        
        String[] stringArray = sc.nextLine().split(" ");
        
        // initiate HashMap
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();

        // Go through array of strings
        for(int i = 0; i < numbers; i++)
        {
            // get current val
            int currentVal = Integer.parseInt(stringArray[i]);
            // check if key doesnt exist
            if(!hashMap.containsKey(currentVal)) {
                // then add currentVal and difference + currentVal to hashmap
                hashMap.put(currentVal, difference + currentVal);
            }
        }

        // start counter
        int differenceCount = 0;
        
        // go through array again
        for(int i=0; i < numbers; i++)
        {
            // get current val
            int currentVal = Integer.parseInt(stringArray[i]);
            // check if value exists in hashmap and get value of hashmap (difference + currentVal) (if difference + currentVal exists in the array, then you found the pair)
            if(hashMap.get(currentVal)!=null && hashMap.get(hashMap.get(currentVal))!=null)
            {
                differenceCount++;

            }
        }

        System.out.println(differenceCount);

    }
}
