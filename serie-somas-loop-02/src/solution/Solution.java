package solution;

import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Easy aonde? \nkkkkklkllkkll 1 hora só para interpretar.");

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int result = 0;
        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n  ; j++) {
                result += (a + 1 * b + 2 * b);
                System.out.printf("%d ", result );
            }
        }
        in.close();
    }
}








