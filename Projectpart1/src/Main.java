import java.util.Scanner;

public class Main {
	public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounts, height in inches: (as space separated) ");
        System.out.println();
        double weight = input.nextDouble();
        double height = Double.parseDouble(input.nextLine());
        
        
        double BMI = (weight * 0.45359237) / (height * 0.0254 * height * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
        
        if (BMI < 18.5)
            System.out.print("underweight");
 
        else if (BMI >= 18.5 && BMI < 24.9)
            System.out.print("normal");
 
        else if (BMI >= 24.9 && BMI < 30)
            System.out.print("overweight");
 
        else if (BMI >= 30)
            System.out.print("obese");
    }
}