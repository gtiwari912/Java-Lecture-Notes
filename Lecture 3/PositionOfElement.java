import java.util.HashMap;

// Given an array of integer, containing distinct values, write a program to find index of any element in array
// If element is not present print index as -1;
import java.util.*;
public class PositionOfElement {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,34,2,1,0,47,587,89,22,23,24,25};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], i);
        }


        Scanner sc = new Scanner(System.in);
        System.out.print("For which element you want to find the index: ");
        int query = sc.nextInt();
        int ans = -1;
        if(map.containsKey(query)){
            ans = map.get(query);
        }
        System.out.println("The element "+query+" is present at index "+ans);
    }
}

// Its highly recommended that you have a look at different methods available in HashMap class
// Ur Task is to understand the working of below methods in hashmap class.
//   map.clear()
//   map.getOrDefault(int key, int defaultValue);
//   map.put(int key, int value);
//   map.isEmpty();
//   map.keySet();
//   map.values();
// Source -     https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
