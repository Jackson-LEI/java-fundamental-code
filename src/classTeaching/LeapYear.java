package classTeaching;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//�����Ӧ��
		Scanner input =  new Scanner(System.in);
		System.out.print("������һ�����:");
		int year = input.nextInt();
		input.close();

		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)//˫��֧if-else���
			System.out.print(year+"��������");
		else
			System.out.print(year+"����ƽ��");

	}

}
