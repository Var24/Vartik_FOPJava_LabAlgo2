package driverclass_currency_denominations;
import java.util.Scanner;

import mergesort_currency_denominations.MergeSort;

public class DriverClass {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of currency denominations
        System.out.println("Enter the size of currency denominations:");
        int size = scanner.nextInt();

        // Input the currency denominations
        System.out.println("Enter the currency denominations values:");
        int[] denominations = new int[size];
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        // Sort the denominations in ascending order using Merge Sort
        MergeSort.mergeSort(denominations, 0, size - 1);

        // Input the amount to be paid
        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        // Calculate the minimum number of notes
        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (int i = size - 1; i >= 0; i--) {
            int count = amount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + ":" + count);
                amount %= denominations[i];
            }
        }

        scanner.close();
    }
	

}
