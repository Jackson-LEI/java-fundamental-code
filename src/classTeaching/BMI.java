package classTeaching;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		//求身体健康指数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入以千克为单位的体重:");
		int weight = input.nextInt();
		System.out.print("请输入以米为单位的身高:");
		double height = input.nextDouble();
		input.close();
		
		double bmi = weight / Math.pow(height,2);
		if(bmi < 18.5){
			System.out.printf("您的BMI值为:%.2f",bmi);
			System.out.print("身体健康状况:偏轻");
		}else if(bmi < 25.0){
			System.out.printf("您的BMI值为:%.2f",bmi);
			System.out.print("身体健康状况:正常体重");
		}else if(bmi < 30.0){
			System.out.printf("您的BMI值为:%.2f",bmi);
			System.out.print("身体健康状况:偏重");
		}else{
			System.out.printf("您的BMI值为:%.2f",bmi);
			System.out.print("身体健康状况:肥胖");
		}

	}

}