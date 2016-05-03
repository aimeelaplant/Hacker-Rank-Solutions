import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        String time = in.nextLine();
        
        int hh, mm, ss;
        
        hh = Integer.parseInt(time.substring(0,2));
        mm = Integer.parseInt(time.substring(3,5));
        ss = Integer.parseInt(time.substring(6,8));
        
        if(time.contains("P") && hh != 12) {
            hh += 12;
        } else if(time.contains("A") && hh == 12) {
            hh -= 12;
        }
        
        System.out.println(String.format("%02d:%02d:%02d", hh, mm, ss));
        
    }
}
