// https://www.hackerrank.com/challenges/java-end-of-file/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = 0;
        while(scan.hasNext()){
            String data = scan.nextLine();
            line++;
            System.out.println(line + " " + data);
        } 
        scan.close();
    }
}
