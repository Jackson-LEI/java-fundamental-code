package classTeaching;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		//������
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		//Random��������������������ʹ���������Ҫ���룬random���������������
		int key = random.nextInt(100);
		//nextInt��������������ֿ���������������ɵķ�Χ������100��������һ�����ڵ���0С�ڵ���100��ֵ
		int answer = -1;
		System.out.print(answer);
		
		while(key != answer){//whileѭ������������()�еı��ʽʱ������ѭ��
			System.out.println("������һ��0-100������:");
			answer = input.nextInt();
			if(answer == key)
				System.out.print("��ϲ��¶��ˣ����������"+key);
			else if(key > answer)
				System.out.println("��С����");
			else
				System.out.println("�´�����");
		}
		input.close();
	}

}
