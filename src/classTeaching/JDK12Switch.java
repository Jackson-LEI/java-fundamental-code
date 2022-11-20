package classTeaching;

import java.util.Scanner;

public class JDK12Switch {

	public static void main(String args[]) {
		//��JDK12�ж��·��������Ż�
		Scanner input = new Scanner(System.in);
		System.out.print("���������:");
		int year = input.nextInt();
		System.out.print("�������·�:");
		int month = input.nextInt();
		input.close();

		int days = 0;
		switch(month) {
		case 1,3,5,7,8,10,12->days = 31;
		//JDK12�е�switch�����Խ��������д��һ�У��ö��Ÿ�����������:���滻�ɼ�ͷ��->��
		case 4,6,9,11->days = 30;
		case 2->{
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				days = 29;
			else 
				days = 28;
		}
		default->{
			System.out.print("������·�����");
			return;
		}
		}
		System.out.print(year+"��"+month+"�·���"+days+"��");
	}
}

