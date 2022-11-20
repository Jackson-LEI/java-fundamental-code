package classTeaching;

import java.util.Scanner;

public class DataAnalysis {

	public static void main(String[] args) {
		//数据分析:求高分，最低分，平均分
		Scanner input = new Scanner(System.in);
		float[] myList = new float[10];//声明并创建数组对象

		for(int i=0;i<myList.length;i++)
			myList[i] = input.nextFloat();

		input.close();

		float sum = 0;
		float max = myList[0];//假设0是最大值
		float min = myList[0];//假设0是最小值

		for(int i=0;i<myList.length;i++) {
			sum = sum + myList[i];//累加求和
			if(myList[i]>max) {//i控制数组下标
				max = myList[i];
			}
			if(myList[i]<min) {
				min = myList[i];
			}
		}
		
		float average = sum / myList.length;
		System.out.print("最高分："+max+"最低分："+min+"平均分："+average);
		int _a = 1;

	}

}
