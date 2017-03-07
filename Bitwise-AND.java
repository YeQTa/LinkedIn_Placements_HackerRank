import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            int array[] = new int[n];
            for(int i=0;i<n;i++){
                array[i]=i+1;
            }
            int max=-1;
            for(int i = 0;i<n-1;i++){
                for(int j = i+1;j<n;j++){
                    int andvalue = array[i] & array[j];
                    
                    if(andvalue < k && andvalue>max)
                        max = andvalue;
                }
            }
            System.out.println(max);
            
        }
    }
}
