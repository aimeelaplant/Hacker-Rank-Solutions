import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int testCases = Integer.parseInt(in.nextLine());
        
        for(int i = 0; i < testCases; i++) {
            
            String[] stringOfNumbers = in.nextLine().split(" ");
            
            int students = Integer.parseInt(stringOfNumbers[0]);
            int cancelationThreshold = Integer.parseInt(stringOfNumbers[1]);
           
            String[] arrivalTimes = in.nextLine().split(" ");
           
            int onTimeStudents = 0;
            
            for(int j=0; j < students; j++) {
                
                int arrivalTime = Integer.parseInt(arrivalTimes[j]);
                if(arrivalTime <= 0) {
                    onTimeStudents++;
                }
                
            }
                        
            if(onTimeStudents < cancelationThreshold) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
        
    }
}
