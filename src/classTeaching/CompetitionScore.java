package classTeaching;

import java.util.Scanner;

public class CompetitionScore {

	public static void main(String[] args) {
		//��������
		double score[] = new double[10];

		Scanner input = new Scanner(System.in);
		System.out.print("������10λ��ί�ķ�����");
		for(int i=0;i<score.length;i++) {//����ѭ�������ʼ��
			score[i]= input.nextDouble();
		}
		input.close();

		double max = score[0];
		double min = score[0];
		double sum = 0;
		for(int i=0;i<score.length;i++) {
			sum = sum + score[i];
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
		}
		double average = (sum - max - min) / (score.length - 2);
		//��ȥһ����߷֣���ȥһ����ͷ֣�����8������ƽ��ֵ

		System.out.printf("��߷�Ϊ��%.1f,��ͷ�Ϊ��%.1f,���յ÷�Ϊ��%.2f",max,min,average);
	}
}
