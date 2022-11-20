package classTeaching;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
	//文件搜索
	public static String fileType;//类变量，文件扩展名

	public static void fileSearch(File dir) {
		if(dir==null) {//判断文件目录是否存在
			return;
		}
		File[] files = dir.listFiles();
		//调用文件类对象dir的listFiles()方法，将文件夹内文件列表输出到文件数组files中
		if(files==null) {//判断文件是否存在
			return;
		}
		for(File file:files) {//遍历文件夹中的文件
			if(file.isFile()) {//判断遍历到列表指定位置的文件是否为文件
				if(file.getName().endsWith(fileType)) {//判断这个文件是否以类变量fileType的内容结束
					System.out.println(file.getAbsolutePath());//将这个文件的绝对路径输出
				}
			}else {
				fileSearch(file);//如果遍历到列表指定位置的文件是一个文件夹，重新执行之前的操作
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要找的文件后缀名：");
		fileType = sc.nextLine();
		System.out.println("请输入要寻找的文件路径：");
		String dirString = sc.nextLine();
		File dir = new File(dirString);//将字符串转换为文件目录
		sc.close();
		fileSearch(dir);//调用fileSearch方法查找文件
		System.out.print("Finished!");

	}

}
