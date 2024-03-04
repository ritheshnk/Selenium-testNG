package p1;

public class Employee {
	
	public int empNo;
	public String name;
	
	private int sal;
	
	protected boolean isPresent;
	
	public Employee(int empNo,String name,boolean isPresent) {
		this.empNo=empNo;
		this.name=name;
		this.isPresent=isPresent;
	}
	
	
	
	public void  setSal(int sal) {
		this.sal=sal;
	}
	
	public int  getSal(int sal) {
		return this.sal=sal;
	}
	
	public void display() {
		System.out.println("Employee id "+empNo);
		System.out.println("Employee name "+name);
		System.out.println("Employee sal "+sal);
		System.out.println("Employee avalibality? "+isPresent);
	
	}

}
