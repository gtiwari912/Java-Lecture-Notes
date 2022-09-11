public class Array {
    public static void main(String[] args) {
        // Array is a collection of data of same type.
        // for Eg:- Collection of int, collection of boolean, etc.

        //declaring array;
        int[] myArr = new int[5];

        //updating the element at index 2;   // note index 2 means 3rd element, because array index starts from 0;
        myArr[2] = 243;


        //getting the size of array.
        int arraySize = myArr.length;

        //printing the array;
        for(int i = 0; i<myArr.length; i++){
            System.out.print(myArr[i]+" ");
        }
    }
}
