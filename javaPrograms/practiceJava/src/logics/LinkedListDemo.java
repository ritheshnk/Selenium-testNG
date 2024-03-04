package logics;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		l.add(10);
		l.add(20);
		System.out.println(l);
		l.addFirst(30);
		System.out.println(l);
		l.addLast(40);
		System.out.println(l);
		
		l.set(2, 50); //will remove 20 and will add 50
		System.out.println(l);
		l.remove(); //remove first element 
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(0,30);
		l.add(40);
		System.out.println(l);
		
		ListIterator<Integer> i=l.listIterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
			
	}

}
