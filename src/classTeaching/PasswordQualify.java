package classTeaching;

import java.util.Scanner;

public class PasswordQualify {

	public static void main(String[] args) {
		//������֤
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("���������룺");
			String password = input.next();

			if(password.length()>=6) {//�жϳ����Ƿ����Ҫ��
				boolean existChar = false;//����û����ĸ
				boolean existDig = false;//����û������
				boolean exist_ = false;//����û���»���
				for(int index = 0;index<password.length();index++) {//�����ַ���
					char ch = password.charAt(index);//�����±�
					if(Character.isAlphabetic(ch)) {
						/*�ð�װ��Character��isLetter()��isAlphabetic�����ж��ַ���ch���Ƿ�����ĸ��
						 * ���ز�������ֵ����true��false
						 */
						existChar = true; //����ĸ
					}else if(Character.isDigit(ch)) {
						//���ð�װ��Character��isDigit()�����ж��ַ���ch���Ƿ������֣����ز�������ֵtrue��false
						existDig = true;//������
					}else if(ch == '_') {
						exist_ = true;//���»���
					}

					if (existChar && existDig && exist_) {//���������������������ѭ��
						break;
					}
				}

				if (existChar && existDig && exist_){//�������������ֳɷ�
					System.out.print("�������óɹ���");
					break;
				}
				else
					System.out.println("�������ٰ�����ĸ�����ֺ��»������ֳɷ֣�");

			}else {
				System.out.println("���볤�Ȳ�����Ҫ��");
			}
		}
		input.close();
	}
}