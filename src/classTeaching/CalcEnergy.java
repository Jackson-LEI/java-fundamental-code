package classTeaching;

import java.util.Scanner;

public class CalcEnergy {

	public static void main(String[] args) {
		// 计算能量
		Scanner input = new Scanner(System.in);
		System.out.print("请输入水的重量(以千克为单位):");// 测试值50
		int m = input.nextInt();
		System.out.print("请输入水的初始温度:");// 测试值5
		int tempInitial = input.nextInt();
		System.out.print("请输入水的最终温度:");// 测试值38
		int tempFinal = input.nextInt();
		input.close();

		float q = m * (tempFinal - tempInitial) * 4184;

		System.out.print("所需的能量为:" + q);// 将输出6903600.0
	}

}
