public class Temperature1 {
	
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0/5) * celsius + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit){
		return (5.0/9) * (fahrenheit - 32);
	}
	public static void main(String[] args) {
		int i;
		System.out.println("Celsius                       Fahrenheit");
		System.out.println("----------------------------------------------");
		for (i=40;i>30;i--) {
			System.out.printf("%5d\t\t\t\t%6.2f\n",i,celsiusToFahrenheit(i));
		}

	}

}