package com.mycompany.task1;

import java.util.HashSet;
import java.util.Scanner;




public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the first repeated element
        HashSet<Integer> seenElements = new HashSet<>();
        int firstRepeated = -1;
        for (int num : array) {
            if (seenElements.contains(num)) {
                firstRepeated = num;
                break;
            } else {
                seenElements.add(num);
            }
        }

        // Output the result
        if (firstRepeated != -1) {
            System.out.println("First repeated element: " + firstRepeated);
        } else {
            System.out.println("No repeated elements found.");
        }

        scanner.close();
    }
}
