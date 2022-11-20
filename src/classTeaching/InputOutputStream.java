package classTeaching;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InputOutputStream {

	public static void main(String[] args) throws IOException {
		InputStream in1 = System.in;
		/*使用字节输入流类创建字节输入流对象，System.in是Java的标准输入，in是InpurStream类型，
		 * 抽象类InputStream不能使用new为对象实例化，InputStream类是所有字节输入流类的超类
		 */
		char i = (char)in1.read();
		//调用InputSteam对象的read()方法读取一个整型数据，这里抛出了IOException异常
		System.out.print(i+"\n");
		//将字符i输出，但是在这里只能输出一个字符
		
		InputStream in2 = (System.in);
		byte by[] = new byte[10];
		//这种写法可以控制接收的字符数量
		in2.read(by);
		System.out.print(new String (by));//可以接收10个字符
		//以上代码只能接收字母，不能接收汉字
		
		InputStreamReader isr = new InputStreamReader(in2);
		/*InputStreamReader是字节流通向字符流的桥梁，使用InputStreamReader类创建InputStreamReader对象，
		 * 使用new和与类名相同的构造方法，将字节流变量in转换成字符流
		 */
		char data[] = new char[20];
		isr.read(data);
		System.out.println(new String (data));//可以接收20个汉字
		
		BufferedReader br = new BufferedReader(isr);
		/*BufferedReader是字符缓冲类，使用InputStreamReader类创建InputStreamReader对象，
		 * 使用new和与类名相同的构造方法，参数一般是一个字符流对象，这个类一般很常用
		 */
		String s = br.readLine();
		//调用字符缓冲类对象的readline()方法可以接收以回车结束的一整行数据
		System.out.println(s);

		File dir = new File("D:\\s");
		//使用File类创建目录或文件对象，使用文件名或目录将对象初始化
		File dir2 = new File("D:\\sa3");
		dir.mkdir();
		//调用文件类对象dir的mkdir()方法创建目录
		if(dir.exists()) {
			//调用文件类对象dir的exist()方法判断目录是否存在，返回布尔类型数据
			dir.renameTo(dir2);
			//调用文件类对象dir的
		}
		System.out.println("finished!");
		if(dir2.exists()) {
			//调用对象的
			dir2.delete();
		}
		System.out.println("finished!");
		
		File dir3 = new File("D://sa3//a");
		dir3.mkdirs();
		System.out.println("finished!");
		
		File file = new File("D://sa3//a//compute2.txt");
		file.createNewFile();
		System.out.print(file.length());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日，hh:mm:ss");
		Date date = new Date(file.lastModified());//输出修改时间，输出毫秒
		System.out.println(sdf.format(date));
		
		FileOutputStream out = new FileOutputStream(file,true);
		out.write("a,aaa\r\n".getBytes());
		out.close();
		
		FileWriter out2 = new FileWriter(file,true);
		out2.write("现在是字符数组\r\n");
		System.out.println("finished!");
		out2.close();
		
		FileInputStream out3 = new FileInputStream(file);
		Scanner sc = new Scanner(out3);
		while(sc.hasNext()){
			String a = sc.nextLine();
			System.out.print(s);
		}
		sc.close();
	}

}
