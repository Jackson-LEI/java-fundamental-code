package classTeaching;

import java.util.Scanner;//��ʾ����

public class CalcMoney {

	public static void main(String[] args) {
		/*IPOģʽ��С�ѵļ���
		 * 
		Input����*/
		Scanner sc = new Scanner(System.in);
		/* Scanner�����ⲿ�࣬�����ǴӼ��̶�ȡ���ݣ�sc����Scanner�ഴ���Ķ���new���ڴ�����������Scanner
		 * �ǹ��췽������ΪҪ������������ݣ����ݸ����췽���Ĳ�������System.in��Ҳ��Java�ı�׼���룬������ʹ
		 * ���ڴ���������newΪScanner����scʵ�����Ĺ���
		 */
		System.out.print("������һ�ʷ���:");//����ֵ10
		int fee = sc.nextInt();
		//ʹ��Scanner�����nextInt()������������������ݸ�ֵ��fee
		System.out.print("����������:");//����ֵ0.15
		double rate =sc.nextDouble();
		//ʹ��Scanner�����nextDouble()�����������˫���������ݸ�ֵ��rate
		sc.close();//����Scanner�����close()�����ر�sc��������
		
		//Processing����
		double chouJin = fee * rate;
		double money = chouJin + fee;
		
		//Output���
		System.out.print("���Ϊ"+chouJin+",�ܷ���Ϊ"+money);//��������1.5���ܷ��ã�11.5
	}
}