package classTeaching;

import java.util.Scanner;

public class YangHuiTriangle {

	public static void main(String[] args) {
		//�������
		int [][]yh;

		System.out.print("������Ҫ��ӡ��������");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.close();

		yh = new int[N][];

		for(int i=0;i<yh.length;i++) {
			yh[i]=new int[i+1];//ÿһ��Ҫ����һ�ж�һ��Ԫ��
		}

		for(int i=0;i<yh.length;i++) {//��������
			for(int j=0;j<yh[i].length;j++) {//��������
				if(j ==0|| j==yh[i].length-1) {
					yh[i][j]=1;
				}else {
					yh[i][j]=yh[i-1][j]+yh[i-1][j-1];
				}
			}
		}
		for(int i=0;i<yh.length;i++) {//��������
			for(int j=0;j<yh[i].length;j++) {//��������
				System.out.print(yh[i][j]+"\t");
			}
			System.out.println();//����
		}
	}
}
