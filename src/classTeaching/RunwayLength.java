package classTeaching;

import java.util.*;//ͨ������룬��java.util���������ݵ���

public class RunwayLength {

	public static void main(String[] args) {
		/*IPOģʽ������ܵ�����
		 * 
		Input����*/
		Scanner sc = new Scanner(System.in);
		System.out.print("������ɻ�������ٶ�v��ֵ:");//����ֵ59
		int v = sc.nextInt();
		System.out.print("������ɻ��ļ��ٶ�a��ֵ:");//����ֵ3.5
		double a = sc.nextDouble();
		sc.close();

		//Processing����
		double Length = v * v / (2 * a);

		//Output����
		System.out.printf("�ɻ�������������ܵ�����Ϊ%.3f",Length);//�����497.286
	}

}