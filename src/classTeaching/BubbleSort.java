package classTeaching;

public class BubbleSort {

	public static void main(String[] args) {
		//ц╟ещеепР
		int score [] = {85,98,75,62,68,77,91,65,100,99};
		int temp;

		for(int i=1;i<score.length;i++) {
			for(int j=0;j<score.length-i;j++) {
				if(score[j]>score[j+1]) {
					temp = score[j+1];
					score[j+1] = score[j];
					score[j] = temp;
				}
			}
		}
		for(int num:score) {
			System.out.print(num+" ");
		}
	}

}
