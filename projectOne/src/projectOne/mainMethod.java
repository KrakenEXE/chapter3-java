package projectOne;

public class mainMethod {

	public static void main(String[] args) {
		//creating employee
		employee employeeOne = new employee("Susan Meyer", 47899, "Accounting", "Vice President");
		employee employeeTwo = new employee("Mark Jones", 39119, "IT", "Programmer");
		employee employeeThree = new employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

		System.out.println(employeeOne.getName() + " "+ employeeOne.getId()+" "+employeeOne.getDep()+" "+employeeOne.getPost());
		System.out.println(employeeTwo.getName() + " "+ employeeTwo.getId()+" "+employeeTwo.getDep()+" "+employeeTwo.getPost());
		System.out.println(employeeThree.getName() + " "+ employeeThree.getId()+" "+employeeThree.getDep()+" "+employeeThree.getPost());
	}
}

class employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	//create constructors
	public employee(String newName, int newId, String newDep, String newPost){
		name = newName;
		idNumber = newId;
		department = newDep;
		position = newPost;
	}
	
	//getters
	public String getName(){
		return name;
	}
	public int getId(){
		return idNumber;
	}
	
	public String getDep(){
		return department;
	}
	
	public String getPost(){
		return position;
	}
}
