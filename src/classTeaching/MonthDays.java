package classTeaching;

import java.util.Scanner;

public class MonthDays {

	public static void main(String args[]) {
		//�·�����
		Scanner input = new Scanner(System.in);
		System.out.print("���������:");
		int year = input.nextInt();
		System.out.print("�������·�:");
		int month = input.nextInt();
		input.close();

		int days = 0;
		if (month == 1 || month == 3 || month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12)
			days = 31;
		else if(month == 4 || month == 6 || month == 9 || month == 11)
			days = 30;
		else if (month == 2){//Ƕ�׵�if-else���
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				days = 29;
			else if(month == 2)
				days = 28;
		}else 
			System.out.print("������·�����");

		System.out.print(year+"��"+month+"�·���"+days+"��");
	}
}