package classTeaching;

import java.util.Scanner;

public class PrinyArray {

	public static void main(String[] args) {
		//��ӡ����Ԫ��
		Scanner sc = new Scanner(System.in);

		System.out.print("������Ҫ�����ĸ�����");
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		System.out.print("������"+n+"��������");
		for(int i=0;i<arr.length;i++) {
			arr [i] = sc.nextInt();
		}
		sc.close();

		System.out.print("����˳��");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("����˳��");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
