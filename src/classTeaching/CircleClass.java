package classTeaching;

import java.util.Scanner;

public class CircleClass {
	
	public static void main(String []args) {
		//在Circle类中圆的默认半径是1
		Circle c1 = new Circle();
		//使用Circle类创建Circle对象，为其分配内存空间并初始化，完成对象的实例化过程
		
		System.out.println(c1.getArea());
		//调用对象的getArea()方法得到圆的面积
		System.out.println(c1.getPerimeter());
		//调用对象的getArea()方法得到圆的周长
		System.out.println(c1.getRadius());
		//调用对象的getArea()方法得到圆的半径
		System.out.println(c1);
		DemoString.printLine();
		
		Circle c2 = new Circle(2);
		System.out.println(c2);
		/*如果在Circle类中没有一个覆盖了超类的toString()方法的成员方法，这里将输出“包.类名+@+哈希值”
		 * 这条语句将等同于System.out.println(c2.toString());
		 */
		
		DemoString.printLine();
		
		Circle c3 = new Circle();
		c3.setRadius(6);
		//调用对象的setRadius()方法设定圆的周长
		System.out.println(c3);
		DemoString.printLine();
		
		Circle c4 = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入圆的半径：");
		c4.setRadius(sc.nextDouble());
		//也可以以输入的方式将半径输入
		sc.close();
		System.out.println(c4);
	}
}
