package classTeaching;

import java.util.Scanner;

public class TimeTrans {

	public static void main(String[] args) {
		//Ê±¼ä×ª»»
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		input.close();

		int hour;
		int minute;
		int second;

		second = time % 60;
		minute = time % 3600 / 60;
		hour = time / 3600;

		System.out.print("<"+hour+">:"+"<"+minute+">:"+"<"+second+">");

	}

}
