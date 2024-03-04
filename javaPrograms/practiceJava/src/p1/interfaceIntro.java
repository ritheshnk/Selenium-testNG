package p1;


 interface Animal{
	public void sound();
	public void attack();
}
 
 class Tiger implements Animal{
	 public void sound() {
		 System.out.println("Tiger roar ");
	 }
	 
	 public void attack() {
		 System.out.println("ALone");
	 }
 }
 
 class Lion implements Animal{
	 public void sound() {
		 System.out.println("Lion roar ");
		 
	 }
	 
	 public void attack() {
		 System.out.println("Group");
	 }
 }
public class interfaceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion l=new Lion();
		l.sound();
		l.attack();
		
		Tiger t=new Tiger();
		t.sound();
		t.attack();
		
		

	}

}
