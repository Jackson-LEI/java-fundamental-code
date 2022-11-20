package classTeaching;

public class CalcFailed {

	public static void main(String[] args) {
		//计算不及格人数
		int score[] = {37,89,63,60,59,78,91};
		int failedStudent = 0;
		for(int i=0;i<score.length;i++) {
			if(score[i]<60) {
				failedStudent++;
			}
		}
		System.out.print("有"+failedStudent+"人不及格");
	}

}
