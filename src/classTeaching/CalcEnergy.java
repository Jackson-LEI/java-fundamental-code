package classTeaching;

import java.util.Scanner;

public class CalcEnergy {

	public static void main(String[] args) {
		// ��������
		Scanner input = new Scanner(System.in);
		System.out.print("������ˮ������(��ǧ��Ϊ��λ):");// ����ֵ50
		int m = input.nextInt();
		System.out.print("������ˮ�ĳ�ʼ�¶�:");// ����ֵ5
		int tempInitial = input.nextInt();
		System.out.print("������ˮ�������¶�:");// ����ֵ38
		int tempFinal = input.nextInt();
		input.close();

		float q = m * (tempFinal - tempInitial) * 4184;

		System.out.print("���������Ϊ:" + q);// �����6903600.0
	}

}
