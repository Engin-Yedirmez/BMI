package projectpart3;

import java.util.Scanner;

public class BmiTest {
	public static void main(String[] args)  	{
		Scanner input = new Scanner(System.in); 
		int Size = 3; 	     	    
		Bmi b[] = new Bmi[Size]; 	    
		for(int x=0;x<Size;x++) 	    {
			System.out.print("\nEnter Data of Person " + (x+1));
			System.out.print("\nName: " ); 	        
			String n = input.next(); 	        
			System.out.print("Age: " ); 	        
			int a = input.nextInt(); 	        
			System.out.print("Weight: " ); 	        
			double w = input.nextDouble(); 	        
			System.out.print("Height: " ); 	        
			double h = input.nextDouble(); 	         	        
			b[x] = new Bmi(n,a,w,h); 	    
			} 		
		for(int x=0;x<Size;x++) 	    
		{ 	        
			System.out.print("\nPerson " + (x+1)); 	        
			System.out.print("\nName: " + b[x].getName()); 	        
			System.out.print("\nAge: " + b[x].getAge()); 	        
			System.out.print("\nWeight: " + b[x].getWeight()); 	        
			System.out.print("\nHeight: " + b[x].getHeight()); 	        
			System.out.print("\nBMI Status: " + b[x].getStatus() + "\n"); 	    
			} 	
		} 
}