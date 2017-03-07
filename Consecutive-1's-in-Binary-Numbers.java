import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(n!=0){         
            n &= (n<<1);
            cnt++;
        }
        System.out.println(cnt);
    }
}
