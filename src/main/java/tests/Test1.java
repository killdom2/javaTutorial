package tests;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Your number is: " + number);
    }
}
