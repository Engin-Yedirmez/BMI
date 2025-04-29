package projectpart3;

public class Bmi {
	private String name;     
	private int age;     
	private double height, weight;     
	static final double KILOGRAMS_PER_POUND = 0.45359237;     
	static final double METERS_PER_INCH = 0.0254;    
	public Bmi()     {         
		name = "John Black";         
		age = 25;         weight = 100;         
		height = 50;     
		}
	
	public Bmi(String n, double w, double h)     {         
		name = n;         age = 20;        
		weight = w;        
		height = h;     
		}
	public Bmi(String n, int a, double w, double h)     {         
		name = n;         
		age = a;         
		weight = w;         
		height = h;     
		}
	
	public void setName(String x) {
		name = x; 
		}
	
	public void setAge(int x) {
		age = x; 
		}
	public void setWeight(double x) {
		weight = x; 
		}
	public void setHeight(double x) {
		height = x; 
		}
	public String getName() { 
		return name; 
		}
	public int getAge() {
		return age; 
		}
	
	public double getWeight() {
		return weight; 
		}
	
	public double getHeight() {
		return height; 
		}
	public double getBMI()     {
		double weightInKg = weight * KILOGRAMS_PER_POUND;         
		double heightInMeters = height * METERS_PER_INCH;                  
		double BMI = weightInKg/(heightInMeters*heightInMeters);         
		return (Math.round(BMI));     
		}
	public String getStatus()     { 
		double BMI = getBMI(); 
		if(BMI <= 18.5)             
			return "Underweight";
		else if(BMI > 18.5 && BMI <= 24.9)
			return"Normal weight";
		else if(BMI >= 25 && BMI <= 29.9)
			return "Overweight";         
		else
			return "Obesity";     
		} 
}
