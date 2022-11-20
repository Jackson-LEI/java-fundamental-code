package classTeaching;

import java.util.Scanner;

public class TEST {

	public static void main(String[]args){
		//(只用于测试的类)
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");		
			}
			System.out.println();
		}
	}
}