package projectpart2;

public class BmiFunctions {
	public static double calculateBMI(double weight, double height) {
		return (weight * 0.45359237) / (height * 0.0254 * height * 0.0254) ;
	}
	
	public static String interpretBMI(double BMI) {
		if(BMI < 18.5)
			return "Underweight";
		else if(BMI >= 18.5 && BMI < 25)
			return "Normal";
		else if(BMI >= 25 && BMI < 30)
			return "Overweight";
		else 
			return "Obese";
	}
}
