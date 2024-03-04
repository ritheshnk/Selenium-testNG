package p1;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
		StringBuilder sb2=new StringBuilder("hello world");
		sb.append("world");
		
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());
	}

}
