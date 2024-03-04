package p1;


 abstract class Animal1{
	 public abstract  void sound();
	 public void attack() {
		 System.out.println("attck");
	 }
	 
	
}
 
  class Tiger1 extends Animal1{

	public void sound() {
		System.out.println("roar");
	}
	 
 }
  
  class lion1 extends Animal1{
	  public void sound() {
		  System.out.println("lion rorar");
	  }
  }
  
  
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger1 t=new Tiger1();
		t.sound();
	}

}
