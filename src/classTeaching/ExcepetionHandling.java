package classTeaching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcepetionHandling {
	
	public static void main(String[] args) {
		//�쳣����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int x = Integer.valueOf(br.readLine());
		} catch (NumberFormatException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
