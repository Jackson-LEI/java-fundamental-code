package classTeaching;

public class CalcPrime {
	
	public static boolean isPrime(int number) {
		boolean prime = true;
		for(int i=2;i<=(int)(Math.sqrt(number));i++) {
			if(number%i==0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	public static void main(String[] args) {
		//¼ÆËãËØÊý
		int count = 0;
		for (int i=2;i<=10000;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.print(count);
	}

}
