package classTeaching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcepetionHandling {
	
	public static void main(String[] args) {
		//异常处理
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int x = Integer.valueOf(br.readLine());
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
