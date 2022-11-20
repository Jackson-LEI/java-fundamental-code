package classTeaching;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		//求圆面积
		Scanner input = new Scanner(System.in);
		System.out.print("Input the radius of a cirle:");
		double radius = input.nextDouble();
		input.close();

		double area;//面积
		if(radius > 0) {
			area = (Math.PI) * (Math.pow(radius,2));
			//Math类在Java.lang核心包中，其中的PI方法可以自动取π的值3.14159265358979323846
			System.out.println("The area of the circle of radius "+radius+" is "+(float)area);
		}
		else {
			System.err.print("Negative input!");
			//System类中的err方法是Java的标准错误输出，输出的内容将变成红色
		}

	}

}
