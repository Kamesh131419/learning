package control;

import java.util.Scanner;

public class controlconstruct {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the mark:");
int mark=scan.nextInt();
System.out.println("welcome to college");
club(mark);
	}
public static void club(int mark) {
	if(mark>=80)
	{
		System.out.println("welcome to tech club");
	}
	
}
}
