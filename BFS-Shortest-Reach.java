// You can reach the problem via this link: https://www.hackerrank.com/challenges/linkedin-practice-graph-theory-bfs

import java.io.*;
import java.util.*;

public class Solution {
    public static Queue<Integer> q;
    
    public static void Solve(int adj[][],int start,int n){
        int visited[] = new int[n+1];
        visited[start]=1;
        for(int i = 1;i<=n;i++){
            if(adj[start][i]!=0 && i!=start)
                q.offer(i);
        }
        
        int cost = 12;
        ArrayList<Integer>poppedlist = new ArrayList<Integer>();
        while(!q.isEmpty()){
            int child = q.poll();
            visited[child]=1;
            for(int i = 1;i<=n;i++){
                
                if(adj[child][i] != 0 && adj[start][i]==0 && visited[i]==0){
                    poppedlist.add(i);
                    adj[start][i] = cost;
                }
            }
            if(q.isEmpty()){
                cost+=6;
                for(int t=0;t<poppedlist.size();t++){
                    q.offer(poppedlist.get(t));
                }
                poppedlist.clear();
                
            }  
        }
        
        for(int i = 1;i<=n;i++){
            if(i!=start){
                if(adj[start][i]==0)
                    System.out.print("-1 ");
                else
                    System.out.print(adj[start][i]+" ");
            }

        }
        
    }
    public static void main(String[] args) {
        q = new LinkedList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        while(Q-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int adjmatrix[][] = new int[n+1][n+1];
           
            for(int mm = 0;mm<m;mm++){
                int i=sc.nextInt();
                int j = sc.nextInt();
                adjmatrix[i][j] = 6;
                adjmatrix[j][i] = 6;
            }
            int start = sc.nextInt();
            Solve(adjmatrix,start,n);
            System.out.println();
        }
    }
}
