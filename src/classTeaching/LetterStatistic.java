package classTeaching;

import java.util.Scanner;

public class LetterStatistic {

	public static void main(String[] args) {
		//ͳ��ÿ����ĸ���ַ����г��ֵĴ���
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����ĸ��");
		String a = input.nextLine();
		input.close();
		String b = new String(a.toLowerCase());//��Ϊ�����˴�Сд�����Խ��ַ����е�����ֱ��ת����Сд
		
		char []ch = b.toCharArray();
		//���ַ���b������ת�����ַ�����[]ch�е�Ԫ��
	
		int []times = new int[26];
		//��ĸ���ֵĴ���
		
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
				System.out.println(j+"�ĳ��ִ���Ϊ��"+times[i]);
			}
		}
	}

}
