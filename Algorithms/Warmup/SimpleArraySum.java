import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        in.nextLine();
        int sum = 0;

        while(in.hasNextInt()) {
          sum += in.nextInt();          
        }

        System.out.println(sum);
 
    }
}
