package classTeaching;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
	//�ļ�����
	public static String fileType;//��������ļ���չ��

	public static void fileSearch(File dir) {
		if(dir==null) {//�ж��ļ�Ŀ¼�Ƿ����
			return;
		}
		File[] files = dir.listFiles();
		//�����ļ������dir��listFiles()���������ļ������ļ��б�������ļ�����files��
		if(files==null) {//�ж��ļ��Ƿ����
			return;
		}
		for(File file:files) {//�����ļ����е��ļ�
			if(file.isFile()) {//�жϱ������б�ָ��λ�õ��ļ��Ƿ�Ϊ�ļ�
				if(file.getName().endsWith(fileType)) {//�ж�����ļ��Ƿ��������fileType�����ݽ���
					System.out.println(file.getAbsolutePath());//������ļ��ľ���·�����
				}
			}else {
				fileSearch(file);//����������б�ָ��λ�õ��ļ���һ���ļ��У�����ִ��֮ǰ�Ĳ���
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ�ҵ��ļ���׺����");
		fileType = sc.nextLine();
		System.out.println("������ҪѰ�ҵ��ļ�·����");
		String dirString = sc.nextLine();
		File dir = new File(dirString);//���ַ���ת��Ϊ�ļ�Ŀ¼
		sc.close();
		fileSearch(dir);//����fileSearch���������ļ�
		System.out.print("Finished!");

	}

}
