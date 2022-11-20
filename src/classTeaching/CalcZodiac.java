package classTeaching;

import java.util.Scanner;

public class CalcZodiac {

	public static void main(String[] args) {
		//计算生肖
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个年份:");
		int year = input.nextInt();
		input.close();

		String zodiac;
		switch(year % 12) {
		case 0: zodiac ="monkey"; break;
		case 1: zodiac ="rooster"; break;
		case 2: zodiac ="dog"; break;
		case 3: zodiac ="pig"; break;
		case 4: zodiac ="rat"; break;
		case 5: zodiac ="ox"; break;
		case 6: zodiac ="tiger"; break;
		case 7: zodiac ="rabbit"; break;
		case 8: zodiac ="dragon"; break;
		case 9: zodiac ="snake"; break;
		case 10: zodiac ="horse"; break;
		case 11: zodiac ="sheep"; break;
		default: zodiac ="monkey";
		}
		System.out.print(year+"年是"+zodiac+"年");
	}

}
