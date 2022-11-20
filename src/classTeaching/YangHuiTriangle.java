package classTeaching;

import java.util.Scanner;

public class YangHuiTriangle {

	public static void main(String[] args) {
		//杨辉三角
		int [][]yh;

		System.out.print("请输入要打印的行数：");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.close();

		yh = new int[N][];

		for(int i=0;i<yh.length;i++) {
			yh[i]=new int[i+1];//每一行要比上一行多一个元素
		}

		for(int i=0;i<yh.length;i++) {//控制行数
			for(int j=0;j<yh[i].length;j++) {//控制列数
				if(j ==0|| j==yh[i].length-1) {
					yh[i][j]=1;
				}else {
					yh[i][j]=yh[i-1][j]+yh[i-1][j-1];
				}
			}
		}
		for(int i=0;i<yh.length;i++) {//控制行数
			for(int j=0;j<yh[i].length;j++) {//控制列数
				System.out.print(yh[i][j]+"\t");
			}
			System.out.println();//换行
		}
	}
}
