package classTeaching;

import java.util.Scanner;

public class HuiWenChuan {

	public static void main(String[] args) {
		//���Ĵ�
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("������һ���ַ�����");
			String a = input.nextLine();

			StringBuffer buffer = new StringBuffer(a);
			//����ʹ��StringBuffer����Ϊֻ��StringBuffer������reverse()����
			String s = new String(buffer.reverse());
			//����StringBuffer�����reverse()�����ַ����������������ת����String

			if(a.equals(s)) {
				//equals()����ֻ������String���������Ҫ��StringBufferת����String
				System.out.println("����ַ����ǻ��Ĵ�");
				break;
			}else
				System.out.println("����ַ������ǻ��Ĵ�");
		}
		input.close();
	}

}