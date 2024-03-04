package DSA;

import java.util.Scanner;

public class selections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		
//		int[] arr=new int[n];
//		System.out.println("enter the aray elements ");
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		
//		//traversal 
//		
//		System.out.println("The array elements are ");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]+" ");
//			
//		}
//		
//		//selection sort
//		System.out.println("");
//		for(int i=0;i<n-1;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				int temp;
//				if(arr[i]>arr[j])
//				{
//					temp=arr[j];
//					arr[j]=arr[i];
//					arr[i]=temp;
//				}
//			}
//		}
//		
//		System.out.println("The array elements are ");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]+" ");
//			
//		}
//		
		
		int[] a=new int[n];
		System.out.println("enter the aray elements ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		
		//bubble sort
		
		for (int i = 0; i < n - 1; i++) {
		    for (int j = 0; j < n - 1 - i; j++) {
		        int temp;
		        if (a[j] > a[j + 1]) {
		            temp = a[j + 1];
		            a[j + 1] = a[j];
		            a[j] = temp;
		        }
		    }
	}
		
			
		
		
		//bubble sort using while loop
/*		
		int count=1;
		while(count<n)
		{
			for(int i=0;i<n-count;i++)
			{
				int temp;
				temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
			count++;
		}
		
*/		


		
		
		System.out.println("The array elements are ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		//finding element linear search
		System.out.println("enter an element to search");
		int ele=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==ele)
			{
				found=true;
				System.out.println("the element found in "+ i+ "position");
				break;
			}else {
				found=false;
				continue;
			}
			
		}
		
		if (!found) {
		    System.out.println("The element is not present in the array.");
		}

		

	}

}
