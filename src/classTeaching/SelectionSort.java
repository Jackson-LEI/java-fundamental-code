package classTeaching;

public class SelectionSort {

	public static void main(String[] args) {
		//ѡ������
		int score [] = {85,98,75,62,68,77,91,65,100,99};

		for(int i=0;i<score.length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<score.length;j++) {//�ҵ���Сֵ�������±�
				if(score[j] < score[minIndex]) {
					minIndex = j;
				}
			}
			int temp = score[i];
			score[i] = score[minIndex];
			score[minIndex] = temp;
		}

		for(int num:score) {
			System.out.println(num);
		}
	}
}