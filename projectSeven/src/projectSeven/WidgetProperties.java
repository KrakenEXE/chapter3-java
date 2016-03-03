package projectSeven;

public class WidgetProperties {

	private double numberOfWidgets;
	private double daysToProduceWidgets;
	
	//max widgets 10 per hour
	//two shifts of 8 = 16 hours a day
	//max widgets in a day is 160
	
	public WidgetProperties(double numberOfWidgets){
		this.daysToProduceWidgets = numberOfWidgets /160;
	}

	public double getNumberOfWidgets() {
		return numberOfWidgets;
	}

	public void setNumberOfWidgets(double numberOfWidgets) {
		this.numberOfWidgets = numberOfWidgets;
	}

	public double getDaysToProduceWidgets() {
		return daysToProduceWidgets;
	}

	public void setDaysToProduceWidgets(double daysToProduceWidgets) {
		this.daysToProduceWidgets = daysToProduceWidgets;
	}
}
