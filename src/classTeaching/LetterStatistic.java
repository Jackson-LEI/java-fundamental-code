package classTeaching;

import java.util.Scanner;

public class LetterStatistic {

	public static void main(String[] args) {
		//统计每个字母在字符串中出现的次数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一行字母：");
		String a = input.nextLine();
		input.close();
		String b = new String(a.toLowerCase());//因为忽略了大小写，可以将字符串中的内容直接转换成小写
		
		char []ch = b.toCharArray();
		//将字符串b的内容转换成字符数组[]ch中的元素
	
		int []times = new int[26];
		//字母出现的次数
		
		for(int index = 0;index<ch.length;index++) {
			for(char c='a';c<'z';c++) {
				if(c==ch[index]) {
					times[ch[index]-97]++;
				}
			}
		}
		for(int i=0;i<times.length;i++) {
			if(times[i]!=0) {
				char j = (char)(i+97);
				System.out.println(j+"的出现次数为："+times[i]);
			}
		}
	}

}
