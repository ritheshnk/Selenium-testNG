package p1;


class Parent{
	protected int num=10;
	
	Parent(){
		System.out.println("this is default constructor of parent");
	}
	
	Parent(String name){
		System.out.println("my name is "+name);
	}
	
	void display() {
		System.out.println("this is a parent display method");
	}
}

class Child extends Parent{
	int num=20;
	
	Child(){
		super();
		System.out.println("this is  child class default construtor");
		
	}
	
	@Override
	void display() {
		System.out.println("this is a child display method number "+num);
		System.out.println("this is a Parent display method number "+super.num);
	}
	
	
}

public class superKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c= new Child();
		c.display();
		
		//Parent p=new Parent();
		//p.display();
		
		int[] arr= {10,20,30,40};
		System.out.print(arr.length); //length is static variable
		
		

	}

}
