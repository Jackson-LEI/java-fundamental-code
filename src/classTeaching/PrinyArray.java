package classTeaching;

import java.util.Scanner;

public class PrinyArray {

	public static void main(String[] args) {
		//打印数组元素
		Scanner sc = new Scanner(System.in);

		System.out.print("请输入要整数的个数：");
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		System.out.print("请输入"+n+"个整数：");
		for(int i=0;i<arr.length;i++) {
			arr [i] = sc.nextInt();
		}
		sc.close();

		System.out.print("正向顺序：");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("逆向顺序：");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
