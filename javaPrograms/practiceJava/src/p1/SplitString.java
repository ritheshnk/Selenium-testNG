package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="abc efi jkl";
		String[] sp= name.split(" ");
		System.out.print(sp[0]);
		System.out.print(sp[1]);
		System.out.print(sp[2]);
		
		String name1="abc efi jkl";
		String[] sp1= name.split("efi");
		System.out.print(sp1[0]);
		System.out.print(sp1[1]);
		//System.out.print(sp1[2]);
		
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.print("\n"+a.contains(3));
		
		//i can convert normal array to arraylist
		
		int[] arr= {10,20,30,40};
		
		List<int[]> arrList= Arrays.asList(arr);
		
		System.out.print("\n"+arrList.contains(20));
	/*	
		int[] arr = {10, 20, 30, 40};
        List<Integer> arrList = Arrays.stream(arr).boxed().toList();

        System.out.print("\n" + arrList.contains(20));
        
        */
	}

}
