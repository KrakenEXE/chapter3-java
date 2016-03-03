package projectTwo;

public class Car {
	private int yearModel;
	private String make;
	private int speed = 0;
	private int accelerate = 5;
	private int brake = -5;
	public Car(int inputYearModel, String inputMake){
		yearModel = inputYearModel;
		make = inputMake;
	}
	
	
	//getters
	public int getYearModel(){
		return yearModel;
	}
	public String getMake(){
		return make;
	}
	public int getSpeed(){
		return speed;
	}
	public int getAccelerate(){
		speed = speed + accelerate; 
		return speed;
	}
	public int getBrake(){
		speed = speed + brake;
		return speed;
	}
}
