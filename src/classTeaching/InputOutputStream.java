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
		/*ʹ���ֽ��������ഴ���ֽ�����������System.in��Java�ı�׼���룬in��InpurStream���ͣ�
		 * ������InputStream����ʹ��newΪ����ʵ������InputStream���������ֽ���������ĳ���
		 */
		char i = (char)in1.read();
		//����InputSteam�����read()������ȡһ���������ݣ������׳���IOException�쳣
		System.out.print(i+"\n");
		//���ַ�i���������������ֻ�����һ���ַ�
		
		InputStream in2 = (System.in);
		byte by[] = new byte[10];
		//����д�����Կ��ƽ��յ��ַ�����
		in2.read(by);
		System.out.print(new String (by));//���Խ���10���ַ�
		//���ϴ���ֻ�ܽ�����ĸ�����ܽ��պ���
		
		InputStreamReader isr = new InputStreamReader(in2);
		/*InputStreamReader���ֽ���ͨ���ַ�����������ʹ��InputStreamReader�ഴ��InputStreamReader����
		 * ʹ��new����������ͬ�Ĺ��췽�������ֽ�������inת�����ַ���
		 */
		char data[] = new char[20];
		isr.read(data);
		System.out.println(new String (data));//���Խ���20������
		
		BufferedReader br = new BufferedReader(isr);
		/*BufferedReader���ַ������࣬ʹ��InputStreamReader�ഴ��InputStreamReader����
		 * ʹ��new����������ͬ�Ĺ��췽��������һ����һ���ַ������������һ��ܳ���
		 */
		String s = br.readLine();
		//�����ַ�����������readline()�������Խ����Իس�������һ��������
		System.out.println(s);

		File dir = new File("D:\\s");
		//ʹ��File�ഴ��Ŀ¼���ļ�����ʹ���ļ�����Ŀ¼�������ʼ��
		File dir2 = new File("D:\\sa3");
		dir.mkdir();
		//�����ļ������dir��mkdir()��������Ŀ¼
		if(dir.exists()) {
			//�����ļ������dir��exist()�����ж�Ŀ¼�Ƿ���ڣ����ز�����������
			dir.renameTo(dir2);
			//�����ļ������dir��
		}
		System.out.println("finished!");
		if(dir2.exists()) {
			//���ö����
			dir2.delete();
		}
		System.out.println("finished!");
		
		File dir3 = new File("D://sa3//a");
		dir3.mkdirs();
		System.out.println("finished!");
		
		File file = new File("D://sa3//a//compute2.txt");
		file.createNewFile();
		System.out.print(file.length());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�գ�hh:mm:ss");
		Date date = new Date(file.lastModified());//����޸�ʱ�䣬�������
		System.out.println(sdf.format(date));
		
		FileOutputStream out = new FileOutputStream(file,true);
		out.write("a,aaa\r\n".getBytes());
		out.close();
		
		FileWriter out2 = new FileWriter(file,true);
		out2.write("�������ַ�����\r\n");
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
