//You can reach the problem via this link : https://www.hackerrank.com/challenges/linkedin-practice-dynamic-programming-lcs

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void LCS (int seq1[],int seq2[],int n,int m){
        int table[][] = new int[seq2.length][seq1.length];
        int result[] = new int[3000];
        for(int i = 1 ; i <= m;i++){
            for(int j = 1; j<=n;j++){
                if(seq1[j] == seq2[i]){
                    table[i][j] = table[i-1][j-1]+1;
                }
                else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }
        }

        int index=0;
        //getting result from table
        loop:while(m>0){
                while(n>0){
                    if(table[m][n] == table[m][n-1]){
                        n--;
                    }
                    else if(table[m][n] == table[m-1][n]){
                        m--;
                    }
                    else{
                        result[index] = seq2[m];
                        --m;
                        --n;
                        ++index;
                    }
                    if(n==0 || m==0)
                        break loop;
                }
            }

        //printing result
        for(int i = index-1; i>=0;i--)
            System.out.print(result[i]+" ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int seq1[] = new int[n+1];
        int seq2[] = new int[m+1];
        for(int i = 1 ; i <= n ; i++){
            seq1[i] = sc.nextInt();
        }
        for(int i = 1 ; i <= m ; i++){
            seq2[i] = sc.nextInt();
        }
        LCS(seq1,seq2,n,m);
        
        
    }
}
