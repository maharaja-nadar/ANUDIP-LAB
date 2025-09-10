/*2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator. Sample Input: num1 = 10 num2 = 30 

Code:
/*
package lab;

import java.util.Scanner;

public class Maximum {
    int num1, num2;

    public Maximum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        num2 = sc.nextInt();
    }

    public void findMax() {
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Maximum = " + max);
    }

    public static void main(String[] args) {
        Maximum obj = new Maximum();
        obj.findMax();
    }
}



/*
Output:Enter num1: 10
Enter num2: 30
num1 = 10
num2 = 30
Maximum = 30   /*
