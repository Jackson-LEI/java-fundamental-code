package classTeaching;

import java.util.Scanner;

public class KaiserPassword {

	public static void main(String[] args) {
		//凯撒密码
		Scanner input = new Scanner(System.in);
		System.out.print("要加密的内容：");
		String s = input.nextLine();
		//Scanner对象的nextLine()方法可以接收带空格的字符串，但next()方法不能
		input.close();
		
		char []sa = new char[s.length()];//初始化字符数组的长度
		
		for(int index = 0;index < sa.length;index++) {//控制字符串数组下标
			char ch = s.charAt(index);//取出字符串s中的字符
			if(Character.isLetter(ch)==true) {//判断是否是字母
				if(Character.isLowerCase(ch)==true) {//判断是否为小写
					sa[index] = (char)('a'+(ch-'a'+3)%26);	
				}else {
					sa[index] = (char)('A'+(ch-'A'+3)%26);	
				}
				
			}else
				sa[index] = ch;
		}
		System.out.print(new String(sa));
	}

}
