package projectNine;

public class CircleProperties {

	private double radius;
	final double PI =  3.14159;
	private double area;
	private double diameter;
	private double circumference;
	
	public CircleProperties(double radius){
		this.radius = radius;
	}
	
	
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		area= PI * radius * radius;
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getDiameter() {
		diameter = radius*2;
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getCircumference() {
		circumference = 2*PI*radius;
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public double getPI() {
		return PI;
	}
	
}
