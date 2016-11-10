
public class Conversion1 {
	
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}

	public static void main(String[] args) {
		double i;
		System.out.println(" Feet			Meters");
		System.out.println("-------------------------------------");
		for (i=1;i<=10;i++) {
			System.out.printf("%5.1f\t\t\t%6.3f\n",i,footToMeter(i));
		}

	}

}