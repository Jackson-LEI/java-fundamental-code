package classTeaching;

import java.util.Scanner;

public class TransCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������Ҫ����İ�������:");
		float weight = input.nextFloat();
		input.close();

		if(weight > 20) {
			System.out.print("�ð����޷����䣬����!");
			return;//����return���ֱ�ӽ�ֵ���أ�������ߴ����Ч��
		}
		if(weight <= 0) {
			System.err.print("��Ч����!");
			return;
		}
		double cost;
		if(weight < 1)
			cost = 3.5 * weight;
		else if(weight < 3)
			cost = 5.5 * weight;
		else if(weight < 10)
			cost = 8.5 * weight;
		else
			cost = 10.5 * weight;

		System.out.print("��������Ϊ"+weight+"�İ������ɱ���"+cost);
	}
}
