package calculator;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter number 1:");
int a=scan.nextInt();
System.out.println("enter number 2:");
int b=scan.nextInt();
System.out.println("enter calculation num 1:+,2:-,3:x,4:/,5:%");
int num=scan.nextInt();
switch(num)
{
	case 1:
	System.out.println("add of a&b:"+(a+b));	
break;
	case 2:
	System.out.println("sub of a&b:"+(a-b));	
break;
	case 3:
		System.out.println("mult of a&b:"+(a*b));	
	break;
	case 4:
		System.out.println("div of a&b:"+(a/b));	
	break;
	case 5:
		System.out.println("reminder of a&b:"+(a%b));	
	break;
	default:
		System.out.println("you are an idot....");	
	break;
}
	}

}
