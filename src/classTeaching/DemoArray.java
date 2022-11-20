package classTeaching;

import java.util.Arrays;

public class DemoArray{

	public static void printArray(int [] array) {
		for(int n :array) {
			System.out.print(n+" ");//匿名数组
		}
		System.out.print("\n");
	}//这个方法可以将数组打印出来

	public static void main(String[] args) {
		int [] a1;//一维数组的声明
		int a2 [];//另一种写法

		int a3 [][];//二维数组的声明
		int [][]a4;//另一种写法
		int []a5[];//另一种写法
		//以此类推，三维数组有四种写法

		//一维数组的创建
		a1 = new int[6];
		//int是数组类型，6是数组中元素的个数，在一维数组中数组个数是必填项

		//二维数组的创建
		a3 = new int[4][4];//[行][列]
		//在二维数组中行和列不是必填项，但至少写其中一个
		a4 = new int[4][];
		//二维数组可以像是这样，只写行或列中的最高维

		//二维数组中对象的实例化过程		
		a3[0] = new int[1];//第一行一个元素
		a3[1] = new int[2];//第二行两个元素
		a3[2] = new int[3];
		a3[3] = new int[4];

		//利用循环初始化一维数组
		for(int i=0;i<a1.length;i++) {
			a1[i]=i+1;
			System.out.print(a1[i]+" ");//打印数组
		}
		System.out.print("\n");
		System.out.println("*******************************");

		//一维数组的枚举初始化
		int score[]= {100,98,77,99,60};
		int[] score2;
		score2 = new int[] {100,98,75,99,60};

		//二维数组的枚举初始化
		int [][]data={{1,2,3},{4,5,6},{7,8,9}};
		//输出
		System.out.println(data[2][1]);//第二行第一列
		System.out.println("*******************************");

		//输出一行
		for(int i=0;i<data.length;i++) {//控制行数
			System.out.print(data[2][i]+" ");
		}
		System.out.print("\n");
		System.out.println("*******************************");

		//输出所有行
		for(int i=0;i<data.length;i++) {//控制行数
			for(int j=0;j<data[i].length;j++)//控制列数
				System.out.print(data[i][j]+"\t");
			System.out.println();//强制换行
		}
		System.out.println("*******************************");

		int data2 [][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(data2.length);//将输二维数组data2的行数
		System.out.println(data2[0].length);//将输出二维数组data2的列数，也就是每行有多少个元素
		System.out.println("*******************************");

		printArray(score2);//使用printArray方法可以将数组score2打印出来
		System.out.println("*******************************");

		Arrays.sort(score);//使用Arrays类的sort方法可以将数组中的元素以升序排序

		int a = Arrays.binarySearch(score,99);
		//使用Arrays类的binarySearch方法可以查找数组中元素的下标，score是数组名，99是数组元素之一
		System.out.println(a);
		System.out.println("*******************************");

		int score3[] = {100,98,77,99,60};
		int score4[] = {100,98,77,60,99};
		System.out.println(Arrays.equals(score3, score4));
		/*使用Arrays类的equals方法可以判断两个数组中的元素数据、个数、顺序是否相等，
		将布尔类型结果返回给变量a，相同输出true，否则输出false*/
		System.out.println("*******************************");

		//常用的数组操作

		a1 = new int []{68,90,24,57,39,78};

		//打印数组元素
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.print("\n");
		System.out.println("*******************************");
		//另一种写法
		for(int i:a1) {
			System.out.print(i+" ");
		}
		System.out.print("\n");
		System.out.println("*******************************");

		//对数组中的元素累加求和
		int total = 0;
		for(int i=0;i<a1.length;i++) {
			total = total + a1[i];
		}
		System.out.println(total);
		System.out.println("*******************************");

		//找出数组中最大元素
		int max = a1[0];//假设数组a1中下标为0的元素是最大的
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>max) {//如果循环数组下标i大于max，将其赋值给max
				max = a1[i];
			}
		}
		System.out.println(max);
		System.out.println("*******************************");

		//找出数组中最小元素
		int min = a1[0];//假设数组a1中下标为0的元素是最小的
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<min) {//如果循环数组下标i小于min，将其赋值给min
				min = a1[i];
			}
		}
		System.out.println(min);
		System.out.println("*******************************");
	}

}