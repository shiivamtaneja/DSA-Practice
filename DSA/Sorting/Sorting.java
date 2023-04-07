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
        for(int i = 0; i < n-1 ; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
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