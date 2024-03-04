package DSA;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int [n];
		
		System.out.println("enter the array elements ");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int current=a[i];
			
			while(a[j]>current && j>=0)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=current;
		}
		
		System.out.println(" array elements ");
		for(int i=0;i<4;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
