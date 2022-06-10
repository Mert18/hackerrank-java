import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String y = "";
                if(x< 100 && x >= 10){
                    y = "0" + String.valueOf(x);
                }else if(x < 10){
                    y = "00" + String.valueOf(x);
                }else {
                    y = String.valueOf(x);
                }
                String z = "";
                for(int q=0; q < 15 - s1.length(); q++){
                    z += " ";
                }
                
                //Complete this line
                System.out.println(s1 + z + y);
            }
            System.out.println("================================");

    }
}



