package classTeaching;

public class TypeJudge {

	public static void main(String[] args) {
		Object object = "金雷";
		System.out.print(object instanceof Integer);//要判断的类型必须写包装类
		//instanceof是实例运算符，作用是判断“金雷”是否为Integer，是输出true，否输出false
	}

}
