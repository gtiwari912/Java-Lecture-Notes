import java.util.Scanner;

// Interactive Program to take a number input from user and give the sum of all digits as output to user.
// Eg. Input: 532    
//     Output: 10
// Explaination: 5+3+2 = 10;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int answer = sumOfDigits(num);
        System.out.println("Sum of Digits for "+num+" is "+answer);
    }

    static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }
    
}
