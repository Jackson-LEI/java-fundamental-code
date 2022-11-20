package classTeaching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EchoProgram {

	public static void main(String[] args) throws IOException {
		//»ØÉù³ÌÐò
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s =  br.readLine();
		
		while(!s.equals("exit")) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
	}

}
