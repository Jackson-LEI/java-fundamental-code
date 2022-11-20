package classTeaching;

import java.util.Scanner;

public class TempWind {
	
	public static void main(String[] args) {
		//IPO模式：计算风寒温度
		Scanner input = new Scanner(System.in);
		System.out.print("请输入室外温度(单位：华氏温度):");//测试值5.3
		double temp = input.nextDouble();//室外温度
		System.out.print("请输入风速(单位：每小时英里数):");//测试值6
		int v = input.nextInt();//风速
		input.close();
		
		if (temp > -58 && temp < 41 && v >= 2) {
			double tempWind = 35.74 + 0.6215 * temp - 35.75 * Math.pow(v,0.16) + 0.4275 * temp * Math.pow(v,0.16);
			//Math类中的pow方法可以求出一个值的幂
			String result = String.format("风寒温度是：%.5f", tempWind);//将输出-5.56707
			System.out.print(result);
		}
		else if(temp < -58 || temp > 41)
				System.out.print("温度不在支持的范围内！");
		else if(v < 2)
				System.out.print("风速不在支持的范围内！");
	}

}
