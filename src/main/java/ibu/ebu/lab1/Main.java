package ibu.ebu.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	    System.out.println("Reading numbers...");
	    int[] numbers = MaxInteger.readNumbers("C:\\Users\\Basil\\Documents\\Code\\numbers.txt");
	    int maxNumber = MaxInteger.findMax(numbers);
	    System.out.println("Maximum number is: " + maxNumber);
	    System.out.println("Writing to file...");
	    MaxInteger.writeToFile("C:\\Users\\Basil\\Documents\\Code\\maxNumbers.txt", maxNumber);
	}
	
}

//Setup on a second machine