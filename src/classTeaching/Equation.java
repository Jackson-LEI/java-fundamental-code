package classTeaching;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		//��һԪ���η���
		Scanner input = new Scanner(System.in);
		System.out.print("������a,b,c��ֵ:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();

		double delta = (Math.pow(b, 2)) - 4 * a * c;
		double root1 = (2 * a) / (-b - Math.sqrt(delta));
		double root2 = (2 * a) / (-b + Math.sqrt(delta));
		if (delta < 0)
			System.out.print("�������û��ʵ������");
		else if(delta == 0)
			System.out.printf("���������һ��ʵ������%f",root1);
		else 	
			System.out.printf("�������������ʵ������%.6f %.6f",root1,root2);
	}
}
