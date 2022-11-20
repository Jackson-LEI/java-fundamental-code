package classTeaching;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		//解一元二次方程
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a,b,c的值:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();

		double delta = (Math.pow(b, 2)) - 4 * a * c;
		double root1 = (2 * a) / (-b - Math.sqrt(delta));
		double root2 = (2 * a) / (-b + Math.sqrt(delta));
		if (delta < 0)
			System.out.print("这个方程没有实数根！");
		else if(delta == 0)
			System.out.printf("这个方程有一个实数根！%f",root1);
		else 	
			System.out.printf("这个方程有两个实数根！%.6f %.6f",root1,root2);
	}
}
