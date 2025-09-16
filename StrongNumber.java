/*
 1.Write a program to check whether a number is a Strong number or not.
 Strong number is a special number whose sum of factorial of digits is equal to the
 original number.
 For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
 [Hint: conditional operator,method,use parameterized method to take input]
 Sample Input 1:
 145

Code:
*/
package lab;

import java.util.Scanner;

public class StrongNumber {


    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;     
            sum += factorial(digit);   
            num /= 10;                
        }

        return (sum == original); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = (isStrong(number)) ? number + " is a Strong Number."
                                           : number + " is NOT a Strong Number.";

        System.out.println(result);

        sc.close();
    }
}
/*
Output:
Enter a number: 145
145 is a Strong Number.
*/

