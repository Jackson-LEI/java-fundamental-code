package classTeaching;

import java.util.Scanner;

public class JDK12Switch {

	public static void main(String args[]) {
		//在JDK12中对月份天数的优化
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份:");
		int year = input.nextInt();
		System.out.print("请输入月份:");
		int month = input.nextInt();
		input.close();

		int days = 0;
		switch(month) {
		case 1,3,5,7,8,10,12->days = 31;
		//JDK12中的switch语句可以将多种情况写在一行，用逗号隔开，并将“:”替换成箭头“->”
		case 4,6,9,11->days = 30;
		case 2->{
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				days = 29;
			else 
				days = 28;
		}
		default->{
			System.out.print("输入的月份有误！");
			return;
		}
		}
		System.out.print(year+"年"+month+"月份有"+days+"天");
	}
}

