package classTeaching;

import java.util.Scanner;

public class KaiserPassword {

	public static void main(String[] args) {
		//��������
		Scanner input = new Scanner(System.in);
		System.out.print("Ҫ���ܵ����ݣ�");
		String s = input.nextLine();
		//Scanner�����nextLine()�������Խ��մ��ո���ַ�������next()��������
		input.close();
		
		char []sa = new char[s.length()];//��ʼ���ַ�����ĳ���
		
		for(int index = 0;index < sa.length;index++) {//�����ַ��������±�
			char ch = s.charAt(index);//ȡ���ַ���s�е��ַ�
			if(Character.isLetter(ch)==true) {//�ж��Ƿ�����ĸ
				if(Character.isLowerCase(ch)==true) {//�ж��Ƿ�ΪСд
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
