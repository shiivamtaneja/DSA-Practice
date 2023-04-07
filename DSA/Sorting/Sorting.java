package Sorting;

import java.util.Scanner;

public class Sorting {

    // Selects the minimum 
    static void selectionSort(int arr[], int n){
        for(int i = 0; i <= n-2; i ++){
            int min = i;
            for(int j = i; j <= n-1; j++){
                if(arr[j] < arr[min]){
	                min = j;
	            }
            }
            int temp = arr[min];
	        arr[min] = arr[i];
	        arr[i] = temp;
        }
    }

    // Adjacent Swapping
    static void bubbleSort(int arr[], int n){
        for(int i = n-1; i >= 1 ; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");  
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
 
        // selectionSort(arr, n);
        bubbleSort(arr, n);
        System.out.print("Sorted array is : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}