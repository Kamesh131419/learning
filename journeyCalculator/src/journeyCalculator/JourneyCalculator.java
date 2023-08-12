package journeyCalculator;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
   System.out.print("enter the speed:");
   double speed=scan.nextDouble();
   System.out.print("enter the time:");
   double time=scan.nextDouble();
   CalculateDistance cal=new CalculateDistance();
 double ss=cal.calculateDistance(speed,time);
 System.out.println("distance covered is:"+ss);
}
}
