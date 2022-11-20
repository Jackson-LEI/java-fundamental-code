package classTeaching;

import java.util.Scanner;

public class TempSwap {

	public static void main(String[] args) {
		/*IPO模式：温度转换器
		 * 
		 *///Input输入
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要转换的摄氏温度:");//测试值43
		double celsius = sc.nextDouble();//celsius摄氏度
		sc.close();

		//Processing处理
		double Fahrenheit = ((float)(9)/5) * (celsius) + 32;//Fahrenheit华氏度
		/*(float)是强制类型转换运行算符，由于9/5是整型，不会保留小数部分，所以可以把9写成9.0或
		 * 使用强制类型转换运算符
		 */

		//Output输出
		System.out.printf(celsius+"摄氏度即"+"%.1f华氏度",Fahrenheit);//将输出109.4
	}
}