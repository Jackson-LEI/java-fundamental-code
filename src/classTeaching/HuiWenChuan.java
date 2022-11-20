package classTeaching;

import java.util.Scanner;

public class HuiWenChuan {

	public static void main(String[] args) {
		//回文串
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("请输入一个字符串：");
			String a = input.nextLine();

			StringBuffer buffer = new StringBuffer(a);
			//这里使用StringBuffer是因为只有StringBuffer对象有reverse()方法
			String s = new String(buffer.reverse());
			//调用StringBuffer对象的reverse()方法字符串变量反向输出并转换成String

			if(a.equals(s)) {
				//equals()方法只能用于String，因此上面要将StringBuffer转换成String
				System.out.println("这个字符串是回文串");
				break;
			}else
				System.out.println("这个字符串不是回文串");
		}
		input.close();
	}

}