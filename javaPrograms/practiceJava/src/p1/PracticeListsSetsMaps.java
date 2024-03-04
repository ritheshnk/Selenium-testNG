package p1;

import java.util.*;

public class PracticeListsSetsMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("vishnu");
		name.add("rithu");
		name.add("narayan");
		
		Iterator i=name.iterator();
		
		System.out.println("using while");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("using for");
		for(String j:name) {
			System.out.println(j);
		}
		
		
		HashSet<Integer> num= new HashSet<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(2); //will be skiped duplicate
		num.add(4);
		
		Iterator a=num.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		HashSet<String> name2=new HashSet<String>();
		
		name2.add("shree");
		name2.add("Hari");
		name2.add("vishnu");
		
		Iterator i1= name2.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
		HashMap<String,String> countries=new HashMap<String,String>();
		
		countries.put("India", "Delhi");
		countries.put("England","london");
		countries.put("USA", "Washington");
		countries.put("UAE","Abhu-Dhabi");
		
		System.out.println(countries);
		
	}
	
	//to get in right order
	
//	  LinkedHashMap<String, String> countries = new LinkedHashMap<>();
//
//      countries.put("India", "Delhi");
//      countries.put("England", "London");
//      countries.put("USA", "Washington");
//      countries.put("UAE", "Abu Dhabi");
//
//      System.out.println(countries);
}
