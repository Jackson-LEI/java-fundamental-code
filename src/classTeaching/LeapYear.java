package classTeaching;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//闰年的应用
		Scanner input =  new Scanner(System.in);
		System.out.print("请输入一个年份:");
		int year = input.nextInt();
		input.close();

		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)//双分支if-else语句
			System.out.print(year+"年是闰年");
		else
			System.out.print(year+"年是平年");

	}

}
