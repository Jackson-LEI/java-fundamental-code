package classTeaching;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		//�����彡��ָ��
		Scanner input = new Scanner(System.in);
		System.out.print("��������ǧ��Ϊ��λ������:");
		int weight = input.nextInt();
		System.out.print("����������Ϊ��λ�����:");
		double height = input.nextDouble();
		input.close();
		
		double bmi = weight / Math.pow(height,2);
		if(bmi < 18.5){
			System.out.printf("����BMIֵΪ:%.2f",bmi);
			System.out.print("���彡��״��:ƫ��");
		}else if(bmi < 25.0){
			System.out.printf("����BMIֵΪ:%.2f",bmi);
			System.out.print("���彡��״��:��������");
		}else if(bmi < 30.0){
			System.out.printf("����BMIֵΪ:%.2f",bmi);
			System.out.print("���彡��״��:ƫ��");
		}else{
			System.out.printf("����BMIֵΪ:%.2f",bmi);
			System.out.print("���彡��״��:����");
		}

	}

}