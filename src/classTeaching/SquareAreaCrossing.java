package classTeaching;

import java.util.Scanner;

public class SquareAreaCrossing {

	public static void main(String[] args) {
		//���������
		Scanner input = new Scanner(System.in);
		//��һ������
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		//�ڶ�������
		double X1 = input.nextDouble();
		double Y1 = input.nextDouble();
		double X2 = input.nextDouble();
		double Y2 = input.nextDouble();

		input.close();

		//�����ཻ����
		double cx1 = Math.max(Math.min(x1,x2),Math.min(X1,X2));
		double cx2 = Math.min(Math.max(x1,x2),Math.max(X1,X2));
		double cy1 = Math.max(Math.min(y1,y2),Math.min(Y1,Y2));
		double cy2 = Math.min(Math.max(y1,y2),Math.max(Y1,Y2));

		double area = 0;
		if(cx2 > cx1&&cy2 > cy1)
			area = (cx2 - cx1) * (cy2 - cy1);
		System.out.print(area);
	}

}
