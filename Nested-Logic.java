import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actday = sc.nextInt();
        int actmonth = sc.nextInt();
        int actyear = sc.nextInt();
        int exday = sc.nextInt();
        int exmonth = sc.nextInt();
        int exyear = sc.nextInt();

        
        if(actyear==exyear){
            int hackos=0;
            if(actmonth == exmonth){
                if(actday > exday){
                    System.out.println((actday-exday)*15);
                }
                else
                    System.out.println("0");
            }
            else if(actmonth >exmonth){
                System.out.println((actmonth-exmonth)*500);
            }
            else
                System.out.println("0");
            
        }
        else if(actyear>exyear){
            System.out.println("10000");
        }
        else
            System.out.println("0");
        
        
        
        
    }
}
