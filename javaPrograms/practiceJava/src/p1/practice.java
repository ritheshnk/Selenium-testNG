package p1;

public class practice {

	public static void main(String[] args) {
		Employee e= new Employee(1,"Narayan",true);
		CarAvailabilty c=new CarAvailabilty(1,"Narayan",true,true);
		
		e.setSal(10000);
		e.display();
		
		c.display(c);
		
		

	}

}
