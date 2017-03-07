import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();

        String result="";
        for(int i=0;i<n;i++){

            int c=s.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char) (c + k);
                while (c > 90) {
                    c = (char) (c - 26);
                }
            } else if (c >= 97 && c <= 122) {
                c = (char) (c + k);
                while(c > 122) {
                    c = (char) (c - 26);
                }
            }

           result=result+(char)c; 

        }
        System.out.println(result);
    }
}
