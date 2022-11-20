package classTeaching;

import java.util.*;//通配符导入，将java.util中所有内容导入

public class RunwayLength {

	public static void main(String[] args) {
		/*IPO模式：求出跑道长度
		 * 
		Input输入*/
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入飞机的起飞速度v的值:");//测试值59
		int v = sc.nextInt();
		System.out.print("请输入飞机的加速度a的值:");//测试值3.5
		double a = sc.nextDouble();
		sc.close();

		//Processing处理
		double Length = v * v / (2 * a);

		//Output处理
		System.out.printf("飞机起飞所需的最短跑道长度为%.3f",Length);//将输出497.286
	}

}