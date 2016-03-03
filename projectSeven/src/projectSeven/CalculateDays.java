package projectSeven;
import java.util.Scanner;

public class CalculateDays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("How many widgets?? >> ");
		double widgets = Double.parseDouble(scanner.nextLine());
		
		WidgetProperties defineDays = new WidgetProperties(widgets);
		
		System.out.print(defineDays.getDaysToProduceWidgets()+" wacky widgety day(s).");
	}

}
