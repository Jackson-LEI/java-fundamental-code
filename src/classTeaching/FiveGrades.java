package classTeaching;

import java.util.Scanner;

public class FiveGrades {

	public static void main(String[] args) {
		//�弶�Ƴɼ�
		Scanner input = new Scanner(System.in);
		System.out.print("��������ķ���:");
		int score = input.nextInt();
		input.close();
		
		char grade;//���switch�����default����û��Ϊgrade��ֵ����䣬����������ʾ����Ҫ��ʼ���������
		switch(score / 10) {//switch-case���
		case 10://û��break�����������ִ��
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default : grade = 'F';//һ�ֺ��ǳ�case������������ĸ�ֵ
		}
		System.out.print("��ķ��������弶�ƻ���Ϊ:"+grade);
	}

}
