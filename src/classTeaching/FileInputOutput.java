package classTeaching;

import java.io.*;

public class FileInputOutput {
	static byte []buff;//��������Ǹ���ʱ��Ҫ�Ļ�������

	public static void copyFile(File file) throws IOException {//���ļ����Ƶ�������(��������)��
		FileInputStream fis = new FileInputStream(file);
		FileInputOutput.buff = new byte[(int) file.length()];
		fis.read(buff);
		fis.close();
	}

	public static void pasteFile(File file) throws IOException {//��������(��������)������д�����ļ���
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(buff);
		fos.close();
	}

	public static void main(String[] args) throws IOException {
		File file1 = new File("D:\\1.txt");
		File file2 = new File("D:\\1",file1.getName());
		copyFile(file1);
		pasteFile(file2);
		System.out.print("Finished");
	}

}
