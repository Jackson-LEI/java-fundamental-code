package classTeaching;

import java.util.Scanner;

public class TransCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要运输的包裹重量:");
		float weight = input.nextFloat();
		input.close();

		if(weight > 20) {
			System.out.print("该包裹无法运输，超重!");
			return;//利用return语句直接将值返回，可以提高代码的效率
		}
		if(weight <= 0) {
			System.err.print("无效输入!");
			return;
		}
		double cost;
		if(weight < 1)
			cost = 3.5 * weight;
		else if(weight < 3)
			cost = 5.5 * weight;
		else if(weight < 10)
			cost = 8.5 * weight;
		else
			cost = 10.5 * weight;

		System.out.print("运输重量为"+weight+"的包裹，成本是"+cost);
	}
}
