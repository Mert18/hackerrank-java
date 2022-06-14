// https://www.hackerrank.com/challenges/java-loops/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int firstEl = a + b;
            System.out.print(firstEl);
            System.out.print(" ");
            for(int y=1; y<n; y++){
                int sum = 0;
                sum += a;
                for(int l=0; l<=y; l++) {
                    sum += Math.pow(2, l) * b;
                }
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}

