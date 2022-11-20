package classTeaching;

import java.util.Arrays;

public class DemoArray{

	public static void printArray(int [] array) {
		for(int n :array) {
			System.out.print(n+" ");//��������
		}
		System.out.print("\n");
	}//����������Խ������ӡ����

	public static void main(String[] args) {
		int [] a1;//һά���������
		int a2 [];//��һ��д��

		int a3 [][];//��ά���������
		int [][]a4;//��һ��д��
		int []a5[];//��һ��д��
		//�Դ����ƣ���ά����������д��

		//һά����Ĵ���
		a1 = new int[6];
		//int���������ͣ�6��������Ԫ�صĸ�������һά��������������Ǳ�����

		//��ά����Ĵ���
		a3 = new int[4][4];//[��][��]
		//�ڶ�ά�������к��в��Ǳ����������д����һ��
		a4 = new int[4][];
		//��ά�����������������ֻд�л����е����ά

		//��ά�����ж����ʵ��������		
		a3[0] = new int[1];//��һ��һ��Ԫ��
		a3[1] = new int[2];//�ڶ�������Ԫ��
		a3[2] = new int[3];
		a3[3] = new int[4];

		//����ѭ����ʼ��һά����
		for(int i=0;i<a1.length;i++) {
			a1[i]=i+1;
			System.out.print(a1[i]+" ");//��ӡ����
		}
		System.out.print("\n");
		System.out.println("*******************************");

		//һά�����ö�ٳ�ʼ��
		int score[]= {100,98,77,99,60};
		int[] score2;
		score2 = new int[] {100,98,75,99,60};

		//��ά�����ö�ٳ�ʼ��
		int [][]data={{1,2,3},{4,5,6},{7,8,9}};
		//���
		System.out.println(data[2][1]);//�ڶ��е�һ��
		System.out.println("*******************************");

		//���һ��
		for(int i=0;i<data.length;i++) {//��������
			System.out.print(data[2][i]+" ");
		}
		System.out.print("\n");
		System.out.println("*******************************");

		//���������
		for(int i=0;i<data.length;i++) {//��������
			for(int j=0;j<data[i].length;j++)//��������
				System.out.print(data[i][j]+"\t");
			System.out.println();//ǿ�ƻ���
		}
		System.out.println("*******************************");

		int data2 [][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(data2.length);//�����ά����data2������
		System.out.println(data2[0].length);//�������ά����data2��������Ҳ����ÿ���ж��ٸ�Ԫ��
		System.out.println("*******************************");

		printArray(score2);//ʹ��printArray�������Խ�����score2��ӡ����
		System.out.println("*******************************");

		Arrays.sort(score);//ʹ��Arrays���sort�������Խ������е�Ԫ������������

		int a = Arrays.binarySearch(score,99);
		//ʹ��Arrays���binarySearch�������Բ���������Ԫ�ص��±꣬score����������99������Ԫ��֮һ
		System.out.println(a);
		System.out.println("*******************************");

		int score3[] = {100,98,77,99,60};
		int score4[] = {100,98,77,60,99};
		System.out.println(Arrays.equals(score3, score4));
		/*ʹ��Arrays���equals���������ж����������е�Ԫ�����ݡ�������˳���Ƿ���ȣ�
		���������ͽ�����ظ�����a����ͬ���true���������false*/
		System.out.println("*******************************");

		//���õ��������

		a1 = new int []{68,90,24,57,39,78};

		//��ӡ����Ԫ��
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.print("\n");
		System.out.println("*******************************");
		//��һ��д��
		for(int i:a1) {
			System.out.print(i+" ");
		}
		System.out.print("\n");
		System.out.println("*******************************");

		//�������е�Ԫ���ۼ����
		int total = 0;
		for(int i=0;i<a1.length;i++) {
			total = total + a1[i];
		}
		System.out.println(total);
		System.out.println("*******************************");

		//�ҳ����������Ԫ��
		int max = a1[0];//��������a1���±�Ϊ0��Ԫ��������
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>max) {//���ѭ�������±�i����max�����丳ֵ��max
				max = a1[i];
			}
		}
		System.out.println(max);
		System.out.println("*******************************");

		//�ҳ���������СԪ��
		int min = a1[0];//��������a1���±�Ϊ0��Ԫ������С��
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<min) {//���ѭ�������±�iС��min�����丳ֵ��min
				min = a1[i];
			}
		}
		System.out.println(min);
		System.out.println("*******************************");
	}

}