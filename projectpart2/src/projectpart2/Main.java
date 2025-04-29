package projectpart2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		final int Size = 3;
		String line;
		String[] words;
		String[] nameArray = new String[Size];
		int[] ageArray = new int[Size];
		double[] weightArray = new double[Size];
		double[] heightArray = new double[Size];
		String[] interpretArray = new String[Size];
		double BMI;		
		
		for(int x = 0; x < Size; x++) {
			System.out.println("---ENTER PERSON " + (x + 1) + "'s VALUES---");
			System.out.println("Enter name, age, weight in pounts, height in inches: (as space separated)");
			line = input.nextLine();
			words = line.split(" ");
			nameArray[x] = words[0] + " " + words[1];
			ageArray[x] = Integer.parseInt(words[2]);
			weightArray[x] = Integer.parseInt(words[3]);
			heightArray[x] = Integer.parseInt(words[4]);		
		}	
		
		for(int x = 0; x < Size; x++) {
			BMI = BmiFunctions.calculateBMI(weightArray[x], heightArray[x]);
			interpretArray[x] = BmiFunctions.interpretBMI(BMI);
		}		
		
		for(int i = 0; i < Size; i++) {
			System.out.println("** The BMI result for " + nameArray[i]
					+ "( Age: " + ageArray[i] + " Weight: " + weightArray[i]
					+ " Height: " + heightArray[i] + ") is \n" + interpretArray[i]);
		}
		input.close();
	}
}