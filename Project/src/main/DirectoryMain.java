package main;

import java.io.FileNotFoundException;

public class DirectoryMain {
	public static void main(String[] args) throws FileNotFoundException {
		Directory phoneDirectory = new Directory("names.txt");
		System.out.println();
		phoneDirectory.displayDirectory(); //display all names
		System.out.println();
		phoneDirectory.add("Mayur Tawade", "7887585458");
		phoneDirectory.add("Aryan Srivastav","916-423-4324");
		phoneDirectory.change("Aryan Srivastav","924-335-6575");
		System.out.println();
		phoneDirectory.displayDirectory();
		System.out.println();
		phoneDirectory.delete("Akanksha Deshmukh");
		System.out.println();
		if(phoneDirectory.getPhoneNumber("Akanksha Deshmukh").equals(""))
			System.out.println(" Not Found");
		else
			System.out.println("Akanksha Deshmukh number:     "         +phoneDirectory.getPhoneNumber("Akanksha Deshmukh"));
		System.out.println();
		phoneDirectory.displayDirectory();
		System.out.println();
		System.out.println("John Adam's number:     " +phoneDirectory.getPhoneNumber("John Adams"));
		System.out.println("Amal Rona's number:    ");
		if(phoneDirectory.getPhoneNumber("Amal Rona").equals(""))
			System.out.println(" Not Found");
		else
			System.out.println(phoneDirectory.getPhoneNumber("Amal Rona"));
	}

}
