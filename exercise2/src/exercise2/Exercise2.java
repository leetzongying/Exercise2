package exercise2;
import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.print("Enter the radius of circle:");
		double radius = in.nextDouble();
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI*radius*radius;
		System.out.println("Perimeter of Circle:" + perimeter);
		System.out.println("Area of Circle:" + area);
		
	printNumber1();
	printNumber2();
	printMath();
	printMath2();
	printMath3();
	printLoop();
    printAverage();
	printExp1();
    printExp2();
	}

	public static void printNumber1() {
		Scanner in=new Scanner(System.in);
	 System.out.print("Enter your number:");
	 int number1 = in.nextInt();
	 System.out.print("Enter your number again:");
	 int number2 = in.nextInt();
	 int sum = number1 + number2;
	 System.out.println("Sum of two numbers is:" + sum);
	}
    public static void printNumber2() {
    	Scanner in=new Scanner(System.in);
    	System.out.print("Enter your number:");
    	int number3 = in.nextInt();
    	System.out.print("To be divided by:");
    	int number4 = in.nextInt();
    	int total = (number3/number4);
    	System.out.println("Division of two numbers is:" + total);
}
    public static void printMath() {
    	System.out.print(-5+8*6 + "\n");
    	System.out.print((55+9) % 9 + "\n");
        System.out.print(20 + -3*5 / 8 + "\n");
        System.out.print(5 + 15 / 3 * 2 - 8 % 3 + "\n");			
    }
    public static void printMath2() {
    	Scanner in=new Scanner(System.in);
    	System.out.print("First number:");
    	int number5 = in.nextInt();
    	System.out.print("Second number:");
    	int number6 = in.nextInt();
    	int product = number5*number6;
    	System.out.println(number5 + "x" + number6 + "=" + product);
    }
    public static void printMath3() {
    	Scanner in=new Scanner(System.in);
    	System.out.print("First number:");
    	int number7 = in.nextInt();
    	System.out.print("Second number:");
    	int number8 = in.nextInt();
    	System.out.println(number7 + "+" + number8 + "=" + (number7+number8));
    	System.out.println(number7 + "-" + number8 + "=" + (number7-number8));
    	System.out.println(number7 + "x" + number8 + "=" + (number7*number8));
    	System.out.println(number7 + "/" + number8 + "=" + (number7/number8));
        System.out.println(number7 + "mod" + number8 + "=" + (number7%number8));
    }
    public static void printLoop() {
    Scanner in=new Scanner(System.in);
    System.out.print("Your number:");
    int number9 = in.nextInt();
    for (int i = 1; i <= 10; i++) {
    	System.out.println(number9 + "x" + i + "=" + (number9*i));
    }
}
    public static void printAverage() {
    	Scanner in=new Scanner(System.in);
    	System.out.print("1st number:");
    	int no1 = in.nextInt();
    	System.out.print("2nd number:");
    	int no2 = in.nextInt();
    	System.out.print("3rd number:");
    	int no3 = in.nextInt();
    	System.out.println("Average of numbers are:" + ((no1 + no2 + no3)/3) );
    }
    public static void printExp1() {
    	System.out.print((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
    public static void printExp2() {
    	System.out.print("\n" + 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }
}

