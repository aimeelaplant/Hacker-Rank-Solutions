import java.io.*;
import java.util.*;

public class Solution {
   
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int numberToSearch = Integer.parseInt(sc.nextLine());
        
        int arraySize = Integer.parseInt(sc.nextLine());
       
        String[] stringOfNumbers = sc.nextLine().split(" ");
        
        for(int i=0; i < arraySize; i++) {
            int index = i;
            int number = Integer.parseInt(stringOfNumbers[index]);
            if(numberToSearch == number) {
                System.out.println(index);
            }
        }
      
    }
}
