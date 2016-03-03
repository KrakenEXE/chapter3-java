package projectFour;
import java.util.Scanner;
public class TemperatureInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Enter degree in Fahrenheit >>");
		double inputFTemp = Double.parseDouble(scanner.nextLine());
		TemperatureDetermination inputTemp = new TemperatureDetermination(inputFTemp);
		System.out.print("F: "+inputTemp.getFtemp()+" C: "+inputTemp.getCtemp()+" K: "+inputTemp.getKtemp());
	}

}
