// You can reach the problem via this link: https://www.hackerrank.com/challenges/linkedin-practice-bigger-is-greater

import java.io.*;
import java.util.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public final class nextperm {
	

	public static boolean nextPermutation(char[] array) {
		// Find non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		if (i <= 0)
			return false;
		
		// Find successor to pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		int temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = (char)temp;
		
		// Reverse suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = (char)temp;
			i++;
			j--;
		}
		return true;
	}
	
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            String s = sc.next();
            char[] array = s.toCharArray();
            if(nextPermutation(array)){
                System.out.println(String.valueOf(array));
            }
            else
                System.out.println("no answer");
            
        }

    }
}
