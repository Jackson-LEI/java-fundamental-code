package classTeaching;

import java.util.Scanner;

public class TempWind {
	
	public static void main(String[] args) {
		//IPOģʽ������纮�¶�
		Scanner input = new Scanner(System.in);
		System.out.print("�����������¶�(��λ�������¶�):");//����ֵ5.3
		double temp = input.nextDouble();//�����¶�
		System.out.print("���������(��λ��ÿСʱӢ����):");//����ֵ6
		int v = input.nextInt();//����
		input.close();
		
		if (temp > -58 && temp < 41 && v >= 2) {
			double tempWind = 35.74 + 0.6215 * temp - 35.75 * Math.pow(v,0.16) + 0.4275 * temp * Math.pow(v,0.16);
			//Math���е�pow�����������һ��ֵ����
			String result = String.format("�纮�¶��ǣ�%.5f", tempWind);//�����-5.56707
			System.out.print(result);
		}
		else if(temp < -58 || temp > 41)
				System.out.print("�¶Ȳ���֧�ֵķ�Χ�ڣ�");
		else if(v < 2)
				System.out.print("���ٲ���֧�ֵķ�Χ�ڣ�");
	}

}
