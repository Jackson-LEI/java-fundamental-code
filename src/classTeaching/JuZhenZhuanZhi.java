package classTeaching;

import java.util.Scanner;

public class JuZhenZhuanZhi {

	public static void main(String[] args) {
		//����ת��
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		input.close();

		int [][]arrayA = new int[n][m];//ԭʼ����

		for(int i=0;i<n;i++) {//����ԭʼ����
			for(int j=0;j<m;j++) {
				arrayA[i][j] = input.nextInt();
			}
		}

		System.out.println("ת�ý����");
		for(int i=0;i<m;i++) {//������
			for(int j=0;j<n;j++) {
				System.out.print(arrayA[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
