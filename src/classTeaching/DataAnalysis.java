package classTeaching;

import java.util.Scanner;

public class DataAnalysis {

	public static void main(String[] args) {
		//���ݷ���:��߷֣���ͷ֣�ƽ����
		Scanner input = new Scanner(System.in);
		float[] myList = new float[10];//�����������������

		for(int i=0;i<myList.length;i++)
			myList[i] = input.nextFloat();

		input.close();

		float sum = 0;
		float max = myList[0];//����0�����ֵ
		float min = myList[0];//����0����Сֵ

		for(int i=0;i<myList.length;i++) {
			sum = sum + myList[i];//�ۼ����
			if(myList[i]>max) {//i���������±�
				max = myList[i];
			}
			if(myList[i]<min) {
				min = myList[i];
			}
		}
		
		float average = sum / myList.length;
		System.out.print("��߷֣�"+max+"��ͷ֣�"+min+"ƽ���֣�"+average);
		int _a = 1;

	}

}
