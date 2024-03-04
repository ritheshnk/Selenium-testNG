package p1;

public class StringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("rithesh");
		sb.append(" ");
		sb.append("how");
		sb.append(" ");
		sb.append("are");
		sb.append(" ");
		sb.append("you?");
		
		System.out.println(sb);
		
		sb.replace(6, 13, "Vishnu");
		System.out.println(sb);
		sb.delete(0, 6);
		System.out.println(sb);
		
		sb.insert(0, "hello ");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
		System.out.println(sb.capacity());
		
		

	}

}
