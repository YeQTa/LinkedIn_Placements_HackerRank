import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int a[] = new int[n];
        if(r>=n)
            r=r%n;
        for(int i = 0;i<n;i++){
            int index=0;
            if(i-r<0){
                int c1 = Math.abs(i-r);
               index =Math.abs(n-c1);
            }
            else
                index = i-r;

            a[index] = sc.nextInt();             
        }
       for(int i = 0;i<n;i++)
             System.out.print(a[i]+" ");
                           
                
    }
}
