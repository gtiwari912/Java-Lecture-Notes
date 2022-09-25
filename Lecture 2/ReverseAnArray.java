import java.util.Arrays;
import java.util.Scanner;

// Program to take array input from user and then reverse the array using reverse method, which we will make.
// * Learning logic to reverse array   * Learning how to make methods in java.
public class ReverseAnArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        // Make a note how I printed array below:- 
        /*  
        Instead of doing it by for loop I imported Arrays class and used
        toString() method of arrays class to print our array
        */
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++; 
            right--;
        }
    }
}