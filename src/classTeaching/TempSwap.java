package classTeaching;

import java.util.Scanner;

public class TempSwap {

	public static void main(String[] args) {
		/*IPOģʽ���¶�ת����
		 * 
		 *///Input����
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫת���������¶�:");//����ֵ43
		double celsius = sc.nextDouble();//celsius���϶�
		sc.close();

		//Processing����
		double Fahrenheit = ((float)(9)/5) * (celsius) + 32;//Fahrenheit���϶�
		/*(float)��ǿ������ת���������������9/5�����ͣ����ᱣ��С�����֣����Կ��԰�9д��9.0��
		 * ʹ��ǿ������ת�������
		 */

		//Output���
		System.out.printf(celsius+"���϶ȼ�"+"%.1f���϶�",Fahrenheit);//�����109.4
	}
}