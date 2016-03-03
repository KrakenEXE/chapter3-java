package projectTwo;
import java.util.Scanner;
public class mainMethod {
	/*
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Enter car model >> ");
		int inputYearModel = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Enter car make >> ");
		String inputMake = scanner.nextLine();
		
		car newCar = new car(inputYearModel, inputMake);
		
		System.out.println("The car before acceleration Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getSpeed());
		System.out.println("The car After acceleration Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+(newCar.getSpeed()+newCar.getAccelerate()));
		System.out.println("The car After brake Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+(newCar.getSpeed()+newCar.getBrake()));
		
		car c1 = new car();
	}
	*/

 class car {
	private int yearModel;
	private String make;
	private int speed = 0;
	private int accelerate = 5;
	private int brake = -5;
	public car(int inputYearModel, String inputMake){
		yearModel = inputYearModel;
		make = inputMake;
	}
	
	public car()
	{
		
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
		return accelerate*5;
	}
	public int getBrake(){
		return brake*5;
	}
}



}
