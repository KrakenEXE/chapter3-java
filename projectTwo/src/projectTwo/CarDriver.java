package projectTwo;


import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Enter car model >> ");
		int inputYearModel = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Enter car make >> ");
		String inputMake = scanner.nextLine();
		
		Car newCar = new Car(inputYearModel, inputMake);
		
		System.out.println("The car before moving Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getSpeed());
		System.out.println("The car During acceleration Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getAccelerate());
		System.out.println("The car During acceleration Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getAccelerate());
		System.out.println("The car During acceleration Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getAccelerate());
		System.out.println("The car During acceleration Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getAccelerate());
		System.out.println("The car During acceleration Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getAccelerate());
		System.out.println("The car During braking Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getBrake());
		System.out.println("The car During braking Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getBrake());
		System.out.println("The car During braking Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getBrake());
		System.out.println("The car During braking Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getBrake());
		System.out.println("The car During braking Year Model:"+newCar.getYearModel()+" Make:"+newCar.getMake()+" Speed:"+newCar.getBrake());

	}

}
