package DSA;

import java.util.Scanner;

public class Arrayoperations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        //traversals
        System.out.println("The array is ");

         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //deletions
        System.out.println("Enter the postion where you want to delete the element ");
        int pos=sc.nextInt();

        if (pos >= 0 && pos < n) {
            // Shift elements to the left starting from the specified position
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }

         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        
    }
}