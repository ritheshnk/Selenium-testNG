package p1;

public  class Employee2 extends Person2{
	String name;
	
	Employee2(String name){
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 e1=new Employee2("narayan");
		System.out.println(e1.getName());
		
		Person2 p2=new Employee2("rithu");
		System.out.println(p2.getName());
		
		
	}
	
}
