package classTeaching;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		File file = new File("D://web.txt");
		FileReader fr = new FileReader(file);
		Scanner sc = new Scanner(fr);
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		while(s!=null) {
			System.out.print(s);
			s = br.readLine();
		}
		
		while(sc.hasNext()) {
			String b = sc.nextLine();
			System.out.print(b);
		}
		sc.close();
		br.close();
		fr.close();
		
		FileWriter fw = new FileWriter("D:/study.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.printf("%1$.2f%2$s%1$.3f", 123.6784537878,"Œ“∞ÆJava");
		pw.close();
		fw.close();
	}
	
}
