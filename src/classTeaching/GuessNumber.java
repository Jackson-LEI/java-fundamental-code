package classTeaching;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		//猜数字
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		//Random类可以用于生成随机数，使用这个类需要引入，random是随机数生成器名
		int key = random.nextInt(100);
		//nextInt方法中输入的数字可以限制随机数生成的范围，输入100代表将生成一个大于等于0小于等于100的值
		int answer = -1;
		System.out.print(answer);
		
		while(key != answer){//while循环：当不满足()中的表达式时，跳出循环
			System.out.println("请输入一个0-100的整数:");
			answer = input.nextInt();
			if(answer == key)
				System.out.print("恭喜你猜对了，随机数就是"+key);
			else if(key > answer)
				System.out.println("猜小啦！");
			else
				System.out.println("猜大啦！");
		}
		input.close();
	}

}
