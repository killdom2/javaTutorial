package tests;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;
import static org.assertj.core.api.Assertions.assertThat;

public class Test1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        int[] emptyNumbers = {};

        var right = Arrays.equals(right(numbers, 1), new int[] {1, 2, 3});
        System.out.println("right = " + right);

        var wrong1 = Arrays.equals(wrong1(numbers, 1), new int[] {1});
        System.out.println("wrong1 = " + wrong1);

        if (!Arrays.equals(wrong1(numbers, 1), new int[]{1}))
            throw new AssertionError("1 тест - failed");

        assertThat(1==1).isTrue();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(number);
    }

    private static int[] right(int[] numbers, int n) {
        return ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong1(int[] numbers, int n) {
        return n <= numbers.length
                ? ArrayUtils.subarray(numbers, 0, n)
                : new int[] {};
    }

}
