// Problem Link: https://www.codechef.com/submit/TSORT

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<size; i++){
		    arr[i] = sc.nextInt();
		}
		
        // Make a note the the below inbuilt method to sort the array.
        // Also try to discover few more methods in Arrays class in java :-
        // Link: https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
		Arrays.sort(arr);
		for(int num: arr){
		    System.out.println(num);
		}
	}
}
