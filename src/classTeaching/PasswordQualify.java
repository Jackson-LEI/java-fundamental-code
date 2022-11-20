package classTeaching;

import java.util.Scanner;

public class PasswordQualify {

	public static void main(String[] args) {
		//密码验证
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("请输入密码：");
			String password = input.next();

			if(password.length()>=6) {//判断长度是否符合要求
				boolean existChar = false;//假设没有字母
				boolean existDig = false;//假设没有数字
				boolean exist_ = false;//假设没有下划线
				for(int index = 0;index<password.length();index++) {//遍历字符串
					char ch = password.charAt(index);//控制下标
					if(Character.isAlphabetic(ch)) {
						/*用包装类Character的isLetter()或isAlphabetic方法判断字符串ch中是否有字母，
						 * 返回布尔类型值数据true或false
						 */
						existChar = true; //有字母
					}else if(Character.isDigit(ch)) {
						//调用包装类Character的isDigit()方法判断字符串ch中是否有数字，返回布尔类型值true或false
						existDig = true;//有数字
					}else if(ch == '_') {
						exist_ = true;//有下划线
					}

					if (existChar && existDig && exist_) {//如果条件成立，跳出本层循环
						break;
					}
				}

				if (existChar && existDig && exist_){//如果密码包含三种成分
					System.out.print("密码设置成功！");
					break;
				}
				else
					System.out.println("密码至少包含字母，数字和下划线三种成分！");

			}else {
				System.out.println("密码长度不符合要求！");
			}
		}
		input.close();
	}
}