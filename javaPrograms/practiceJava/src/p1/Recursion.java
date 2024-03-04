package p1;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =10;
		
		int result = sum(num);
		System.out.println(result);

	}

	private static int sum(int num) {
		// TODO Auto-generated method stub
		
		if(num>0) {
			return (num+sum(num-1));
		}else {
		return 0;
		}

	}
}
