package classTeaching;

import javax.swing.JOptionPane;

public class SimpleGUI {
	
	public static void main(String args[]) {
		String electronic0 = JOptionPane.showInputDialog("��������");
		/* JOptionPane���ⲿ�࣬��������Ļ����ʾ��Ϣ
		 * ����showInputDialog()������������Ļ����ʾһ�����б༭��Ĵ��ڣ���Java����ķ���֮һ
		 * �����ֵ����ֵ���ֲ�����electronic0
		 */
		String gas0 = JOptionPane.showInputDialog("������ú����");
		String water0 = JOptionPane.showInputDialog("������ˮ��");
		System.out.println("����"+(electronic0+gas0+water0));
		//����һ��ֻ�ܽ�����ַ���������һ���д��
		DemoString.printLine();
		
		//Ҫ��ֵ��ӣ�����ʹ�ð�װ��Integer��parseInt()��valueOf()���������ַ�������ת��������
		int electronic = Integer.parseInt(JOptionPane.showInputDialog("��������"));
		int gas = Integer.valueOf(JOptionPane.showInputDialog("������ú����"));
		int water = Integer.valueOf(JOptionPane.showInputDialog("������ˮ��"));
		System.out.print("����"+(electronic+gas+water));
		
	}
}