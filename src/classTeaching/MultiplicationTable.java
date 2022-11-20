package classTeaching;

public class MultiplicationTable {

	public static void main(String[] args) {
		//³Ë·¨±íÊä³ö
		for(int i=1;i<=9;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println("****************************************************************");
		for(int i=1;i<=9;i++) {
			for(int j=i;j<=9;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
