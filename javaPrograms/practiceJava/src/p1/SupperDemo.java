package p1;

interface Switch{
	public abstract void on();
	void off();
}
class Parent1{
	String name;
	
	Parent1(String name)
	{
		this.name=name;
	}
	
	void display()
	{
		System.out.print("name: "+name);
	}
	
}

class Button implements Switch{
	public void on() {
		System.out.print("on");
	}

	
	public void off() {
		// TODO Auto-generated method stub
		System.out.print("off");
	}
}
class Child1 extends Parent1{
	
	Child1(String name){
		super(name);
	}
	
	/* 
	 can also use super method to call methodh using super
	  
	  void display(){
	  		super.display();
	  	}
	  	
	*/
	
	
}
public class SupperDemo {
	public static void main(String[] args)
	{
		Child1 c1=new Child1("rithu");
		c1.display();
		
		char x='a';
		int j=(int)x;
		System.out.print(j);
		System.out.println();
		String s="122";
		int n=Integer.parseInt(s);
		System.out.println(n);
		
		String s1="33";
		double n1=Double.parseDouble(s1);
	}
}
