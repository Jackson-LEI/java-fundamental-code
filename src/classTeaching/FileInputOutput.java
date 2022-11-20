package classTeaching;

import java.io.*;

public class FileInputOutput {
	static byte []buff;//类变量，是复制时需要的缓存区域

	public static void copyFile(File file) throws IOException {//将文件复制到剪贴板(缓存区域)中
		FileInputStream fis = new FileInputStream(file);
		FileInputOutput.buff = new byte[(int) file.length()];
		fis.read(buff);
		fis.close();
	}

	public static void pasteFile(File file) throws IOException {//将剪贴板(缓存区域)的内容写入新文件中
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
