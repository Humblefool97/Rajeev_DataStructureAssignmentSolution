package com.greatlearning.assignment3.skyscraper;

import java.util.Scanner;
import java.util.Stack;

public class SkyScraper {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of floors in the building :=");
        int n = scanner.nextInt();
        int[] sizeArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the size of the array for : Day" + (i + 1));
            sizeArray[i] = scanner.nextInt();
        }
        buildSkyScraper(sizeArray, n);
    }

    private static void buildSkyScraper(int[] sizes, int n) {
        Stack<Integer> sizeStack = new Stack<>();
        int dayWithHighestSize = n;
        System.out.println("=========The order of construction is as follows===============");
        for (int i = 0; i < n; i++) {
            int sizeOfTheDay = sizes[i];
            if (sizeOfTheDay < dayWithHighestSize) {
                sizeStack.push(sizeOfTheDay);
                System.out.println("Day: " + (i + 1) + " ");
            } else {
                System.out.println("Day: " + (i + 1));
                System.out.print(sizeOfTheDay + " ");
                dayWithHighestSize--;
                while (!sizeStack.isEmpty() && sizeStack.peek() >= dayWithHighestSize) {
                    System.out.print(sizeStack.pop() + " ");
                    dayWithHighestSize--;
                }
            }
            System.out.println();
        }
    }
}
