package classTeaching;

import java.util.Scanner;

public class CircleClass {
	
	public static void main(String []args) {
		//��Circle����Բ��Ĭ�ϰ뾶��1
		Circle c1 = new Circle();
		//ʹ��Circle�ഴ��Circle����Ϊ������ڴ�ռ䲢��ʼ������ɶ����ʵ��������
		
		System.out.println(c1.getArea());
		//���ö����getArea()�����õ�Բ�����
		System.out.println(c1.getPerimeter());
		//���ö����getArea()�����õ�Բ���ܳ�
		System.out.println(c1.getRadius());
		//���ö����getArea()�����õ�Բ�İ뾶
		System.out.println(c1);
		DemoString.printLine();
		
		Circle c2 = new Circle(2);
		System.out.println(c2);
		/*�����Circle����û��һ�������˳����toString()�����ĳ�Ա���������ｫ�������.����+@+��ϣֵ��
		 * ������佫��ͬ��System.out.println(c2.toString());
		 */
		
		DemoString.printLine();
		
		Circle c3 = new Circle();
		c3.setRadius(6);
		//���ö����setRadius()�����趨Բ���ܳ�
		System.out.println(c3);
		DemoString.printLine();
		
		Circle c4 = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("������Բ�İ뾶��");
		c4.setRadius(sc.nextDouble());
		//Ҳ����������ķ�ʽ���뾶����
		sc.close();
		System.out.println(c4);
	}
}
