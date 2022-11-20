package classTeaching;

import java.util.Scanner;

public class JuZhenZhuanZhi {

	public static void main(String[] args) {
		//矩阵转置
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		input.close();

		int [][]arrayA = new int[n][m];//原始矩阵

		for(int i=0;i<n;i++) {//输入原始矩阵
			for(int j=0;j<m;j++) {
				arrayA[i][j] = input.nextInt();
			}
		}

		System.out.println("转置结果：");
		for(int i=0;i<m;i++) {//结果输出
			for(int j=0;j<n;j++) {
				System.out.print(arrayA[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
