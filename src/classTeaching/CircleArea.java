package classTeaching;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		//��Բ���
		Scanner input = new Scanner(System.in);
		System.out.print("Input the radius of a cirle:");
		double radius = input.nextDouble();
		input.close();

		double area;//���
		if(radius > 0) {
			area = (Math.PI) * (Math.pow(radius,2));
			//Math����Java.lang���İ��У����е�PI���������Զ�ȡ�е�ֵ3.14159265358979323846
			System.out.println("The area of the circle of radius "+radius+" is "+(float)area);
		}
		else {
			System.err.print("Negative input!");
			//System���е�err������Java�ı�׼�����������������ݽ���ɺ�ɫ
		}

	}

}
