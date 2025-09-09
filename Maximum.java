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

