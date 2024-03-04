package p1;

public class CarAvailabilty extends Employee {
	
	public boolean haveCar;

	public CarAvailabilty(int empNo, String name, boolean isPresent,boolean haveCar) {
		super(empNo, name, isPresent);
		this.haveCar=haveCar;
	}
	
	public 	void display(CarAvailabilty car) {
		if(haveCar)
		System.out.println("the employe with name "+car.name+" have car?(true/false) "+ car.haveCar);
	}

}
