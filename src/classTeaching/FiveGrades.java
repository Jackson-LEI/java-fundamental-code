package classTeaching;

import java.util.Scanner;

public class FiveGrades {

	public static void main(String[] args) {
		//五级制成绩
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的分数:");
		int score = input.nextInt();
		input.close();
		
		char grade;//如果switch语句中default后面没有为grade赋值的语句，编译器会提示你需要初始化这个变量
		switch(score / 10) {//switch-case语句
		case 10://没有break，程序会向下执行
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default : grade = 'F';//一种涵盖除case以外所有情况的赋值
		}
		System.out.print("你的分数按照五级制划分为:"+grade);
	}

}
