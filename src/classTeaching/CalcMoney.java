package classTeaching;

import java.util.Scanner;//显示导入

public class CalcMoney {

	public static void main(String[] args) {
		/*IPO模式：小费的计算
		 * 
		Input输入*/
		Scanner sc = new Scanner(System.in);
		/* Scanner类是外部类，作用是从键盘读取数据，sc是用Scanner类创建的对象，new是内存分配运算符，Scanner
		 * 是构造方法，因为要向程序输入数据，传递给构造方法的参数就是System.in，也是Java的标准输入，这里是使
		 * 用内存分配运算符new为Scanner对象sc实例化的过程
		 */
		System.out.print("请输入一笔费用:");//测试值10
		int fee = sc.nextInt();
		//使用Scanner对象的nextInt()方法将输入的整型数据赋值给fee
		System.out.print("请输入酬金率:");//测试值0.15
		double rate =sc.nextDouble();
		//使用Scanner对象的nextDouble()方法将输入的双精度型数据赋值给rate
		sc.close();//调用Scanner对象的close()方法关闭sc的输入流
		
		//Processing处理
		double chouJin = fee * rate;
		double money = chouJin + fee;
		
		//Output输出
		System.out.print("酬金为"+chouJin+",总费用为"+money);//将输出酬金1.5，总费用：11.5
	}
}