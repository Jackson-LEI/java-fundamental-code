package classTeaching;

import java.util.Scanner;

public class CompetitionScore {

	public static void main(String[] args) {
		//竞赛评分
		double score[] = new double[10];

		Scanner input = new Scanner(System.in);
		System.out.print("请输入10位评委的分数：");
		for(int i=0;i<score.length;i++) {//数组循环输入初始化
			score[i]= input.nextDouble();
		}
		input.close();

		double max = score[0];
		double min = score[0];
		double sum = 0;
		for(int i=0;i<score.length;i++) {
			sum = sum + score[i];
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
		}
		double average = (sum - max - min) / (score.length - 2);
		//减去一个最高分，减去一个最低分，其余8个数的平均值

		System.out.printf("最高分为：%.1f,最低分为：%.1f,最终得分为：%.2f",max,min,average);
	}
}
