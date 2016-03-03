package projectThree;

import java.util.Scanner;

public class PersonalInformationCreator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		//for(int i=0; i<3;i++){
			
		//System.out.print("Enter name >> ");
		//String inputName = scanner.nextLine();
		String inputName ="Matthew";
		//System.out.print("Enter address >> ");
		//String inputAddress = scanner.nextLine();
		String inputAddress= "4703 Primm";
		//System.out.print("Enter age >> ");
		//int inputAge = Integer.parseInt(scanner.nextLine());
		int inputAge = 20;
		//System.out.print("Enter phone number >> ");
		//double inputPhoneNumber = Double.parseDouble(scanner.nextLine());
		String inputPhoneNumber = "3142100865";
		PersonalData human1 = new PersonalData(inputName, inputAddress, inputAge, inputPhoneNumber);
		
		System.out.println("Name: "+human1.getName()+" Address: "+human1.getAddress()+" Age: "+human1.getAge()+" Phone: "+human1.getPhoneNumber());
		//}
		
		//System.out.print("Enter name >> ");
		//inputName = scanner.nextLine();
		inputName ="Mallow Poppy";
		//System.out.print("Enter address >> ");
		//inputAddress = scanner.nextLine();
		inputAddress= "461 Swamp Ln.";
		//System.out.print("Enter age >> ");
		//inputAge = Integer.parseInt(scanner.nextLine());
		inputAge= 15;
		//System.out.print("Enter phone number >> ");
		//inputPhoneNumber = Double.parseDouble(scanner.nextLine());
		inputPhoneNumber = "1231231234";
		PersonalData human2 = new PersonalData(inputName, inputAddress, inputAge, inputPhoneNumber);
		
		System.out.println("Name: "+human2.getName()+" Address: "+human2.getAddress()+" Age: "+human2.getAge()+" Phone: "+human2.getPhoneNumber());
		
		//System.out.print("Enter name >> ");
		//inputName = scanner.nextLine();
		inputName ="Tsubaki-Chan";
		//System.out.print("Enter address >> ");
		//inputAddress = scanner.nextLine();
		inputAddress= "927 Shell Ln.";
		//System.out.print("Enter age >> ");
		//inputAge = Integer.parseInt(scanner.nextLine());
		inputAge= 17;
		//System.out.print("Enter phone number >> ");
		//inputPhoneNumber = Double.parseDouble(scanner.nextLine());
		inputPhoneNumber = "9879879876";
		PersonalData human3 = new PersonalData(inputName, inputAddress, inputAge, inputPhoneNumber);
		
		System.out.println("Name: "+human3.getName()+" Address: "+human3.getAddress()+" Age: "+human3.getAge()+" Phone: "+human3.getPhoneNumber());
	}

}
