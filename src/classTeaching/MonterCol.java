package classTeaching;

//import java.util.Random;

public class MonterCol {

	public static void main(String[] args) {
		//���ؿ���ģ��
		int test = 1000000;
		int numberOfHit = 0;

		for(int i=0;i<=test;i++) {
			double x = Math.random() * 2 - 1;
			double y = Math.random() * 2 - 1;
			//Random random = new Random();ʹ��Random�����������
			//double x = random.nextDouble();
			//double y = random.nextDouble();
			if(x * x + y * y <= 1)
				numberOfHit++;
		}
		double PI = 4.0 * numberOfHit / test;
		System.out.print(PI);
	}

}
