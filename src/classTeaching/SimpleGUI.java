package classTeaching;

import javax.swing.JOptionPane;

public class SimpleGUI {
	
	public static void main(String args[]) {
		String electronic0 = JOptionPane.showInputDialog("请输入电费");
		/* JOptionPane是外部类，可以在屏幕上显示消息
		 * 调用showInputDialog()方法可以在屏幕上显示一个带有编辑框的窗口，是Java输入的方法之一
		 * 输入的值将赋值给局部变量electronic0
		 */
		String gas0 = JOptionPane.showInputDialog("请输入煤气费");
		String water0 = JOptionPane.showInputDialog("请输入水费");
		System.out.println("共计"+(electronic0+gas0+water0));
		//这是一种只能将多个字符串排列在一起的写法
		DemoString.printLine();
		
		//要将值相加，必须使用包装类Integer的parseInt()或valueOf()方法，将字符串数据转换成整型
		int electronic = Integer.parseInt(JOptionPane.showInputDialog("请输入电费"));
		int gas = Integer.valueOf(JOptionPane.showInputDialog("请输入煤气费"));
		int water = Integer.valueOf(JOptionPane.showInputDialog("请输入水费"));
		System.out.print("共计"+(electronic+gas+water));
		
	}
}