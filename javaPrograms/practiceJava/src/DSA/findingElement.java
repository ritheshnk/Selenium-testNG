package DSA;

import java.util.Scanner;

public class findingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("enter the array elements ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		buubleSort(a,n);
		System.out.println("enter an element to seacrh");
		int ele=sc.nextInt();
		binarySearch(a,n,ele);

	}

	private static int binarySearch(int[] a, int n, int ele) {
	    int s = 0;
	    int e = n - 1; // Fix: Adjust the end index

	    while (s <= e) {
	        int mid = (s + e) / 2;

	        if (a[mid] == ele) {
	            return mid;
	        } else if (a[mid] > ele) {
	            e = mid - 1;
	        } else {
	            s = mid + 1;
	        }
	    }
	    return -1;
	}


	private static void buubleSort(int[] a, int n) {
		// TODO Auto-generated method stub
		int count=1;
		
		while(count<n)
		{
			for(int i=0;i<n-count;i++)
			{
				int temp;
				if(a[i]>a[i+1])
				{
					temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}
				
			}
			count++;
		}
		
	}

}
