/*

Task 1: Array Search – Find the First Repeated Element
Write a Java program to find the first repeated element in an array of integers. The program should:
Take the size of the array and its elements as input.
Find and print the first element that repeats in the array (i.e., occurs more than once).
If no element repeats, print "No repeated elements found."
Example Input:
Enter the size of the array: 6
Enter the elements of the array: 4 5 6 7 4 8 7 4 8 4 9

*/
/*

Nichita Selchin , Student No : sba24331

Repository link : https://github.com/Nichita777/task1

*/




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
