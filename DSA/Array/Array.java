package DSA.Array;

import java.util.*;


public class Array {

    public void insert(int arr[]){
        int size = arr.length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter all the elements:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public void insertAtPos(int arr[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position where you want to insert: ");
        int pos = sc.nextInt();

        System.out.print("Enter the Element: ");
        int ele = sc.nextInt();

        arr[pos] = ele;
    }

    public void delete(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to delete: ");

        int del = sc.nextInt();

        int new_arr[] = new int[arr.length-1];
        int j = 0;
        boolean found = false;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == del){
                System.out.println("Element " +  del + " deleted.");
                found = true;
            } 
            else {
                new_arr[j] = arr[i];
                j++;
            }
        }

        if(!found){
            System.out.println("Element " +  del + " not found.");
        }

        System.out.print("New Elements are: ");
        for(int i= 0; i < new_arr.length ; i++){
            System.out.print(new_arr[i] + " ");
        }
        System.out.println();

    }

    public void view(int arr[]){
        System.out.print("Elements are: ");
        for(int i= 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        
        Array a = new Array();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        
        while(true){
            System.out.println("Input your choice from the following menu:");
            System.out.println("1.Insert 2.InsertAtPos 3.Delete 4.View 5.Exit");
            int option = sc.nextInt();

            switch(option){
                case 1:
                    a.insert(arr);
                    break;
                case 2:
                    a.insertAtPos(arr);
                    break;
                case 3:
                    a.delete(arr);
                    break;
                case 4:
                    a.view(arr);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }

        // a.insert(arr);

        // a.insertAtPos(arr);
        
        // a.view(arr);

        // a.delete(arr);
    }
}
