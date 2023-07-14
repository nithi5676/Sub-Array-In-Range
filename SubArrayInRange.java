package subArraysInRange;

import java.util.Scanner;

public class SubArrayInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array Elements");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter start range: ");
        int startValue = scanner.nextInt();
        System.out.print("Enter the end range: ");
        int endValue = scanner.nextInt();
        scanner.close();
        arrayInRange(array, startValue, endValue);
    }

    public static void arrayInRange(int array[], int startValue, int endvalue) {
        for (int j = startValue; j <= endvalue; j++) {
            System.out.print(array[j] + " ");
        }

    }
}
