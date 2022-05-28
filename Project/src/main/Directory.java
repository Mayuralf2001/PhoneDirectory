package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Directory {

	private String name = "";
	private String number = "";
	//<Key,Value>
	private HashMap<String, String> directory = new HashMap<String,String>();
	/**
	 * Reading a file and putting it in into the Hashmap
	 * @param names which is a file
	 * @throws FileNotFoundException
	 */
	public Directory(String names) throws FileNotFoundException {
		//Reading Files
		Scanner read = new Scanner(new File("names.txt"));
		//write file names and numbers into maps, (names = number)
		while (read.hasNextLine()) {
			StringTokenizer st = new StringTokenizer(read.nextLine(), ":");
			directory.put(st.nextToken().trim(), st.nextToken().trim());
			
		}	
	}
	/**
	 * 
	 * @param Name to be added
	 * @param Number to be added
	 */
	public void add(String addName, String addNumber) {
		name = addName;
		number = addNumber;
		directory.put(name,number);
		System.out.println("Adding " + name + " " + number);	
	}
	/**
	 * Changing a name
	 * @param name
	 * @param number
	 */
	public void change(String name, String number) {
		this.name = name;
		this.number = number;
		directory.replace(name, directory.get(name), number);
		System.out.println("Changing " + name + " " + number);
	}
	/**
	 * This method remove a name from a Hashmap
	 * @param name
	 */
	public void delete(String name) {
		this.name=name;
		directory.remove(name);
		System.out.println(name + "Removed");
	}
	/**
	 * Method to see if someone is in the hashmap
	 * @param name
	 * @return
	 */
	public String getPhoneNumber(String name) {
		this.name=name;
		if(directory.containsKey(name)) {
			return " " + directory.get(name);
		}
		else {
			return "";
		}
	}
	public void displayDirectory() {
		for (Map.Entry pairEntry : directory.entrySet()) {
//			System.out.println(pairEntry.getKey() + "\t" + pairEntry.getValue());
			String x = (String) pairEntry.getKey();
			if(x.length()==8)
			{
				System.out.println("\t" + pairEntry.getKey() + "\t" + pairEntry.getValue());
			}
			else if (x.length()==9) 
			{
				System.out.println("\t" + pairEntry.getKey() + "\t" + pairEntry.getValue());
			}
			else if (x.length()==10) 
			{
				System.out.println("		" + pairEntry.getKey() + "\t" + pairEntry.getValue());
			}
			else if (x.length()==11) 
			{
				System.out.println("	   " + pairEntry.getKey() + "\t" + pairEntry.getValue());
			}
			else if (x.length()==13) 
			{
				System.out.println("	 " + pairEntry.getKey() + "\t" + pairEntry.getValue());
			}
			else if (x.length()==14) 
			{
				System.out.println("	" + pairEntry.getKey() + "\t" + pairEntry.getValue());
			}
			else if (x.length()==17) 
			{
				System.out.println("" + pairEntry.getKey() + "\t" + pairEntry.getValue());
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
