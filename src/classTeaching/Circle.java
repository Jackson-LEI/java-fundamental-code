package classTeaching;

import java.text.DecimalFormat;

public class Circle {
	//成员变量
	double radius = 1;
	public static final double PI = 3.14;//常量
	DecimalFormat df = new DecimalFormat("0.00");
	
	public Circle() {//无参、方法体为空的默认构造方法

	}

	public Circle(double radius) {//参数为double类型的radius的重载的构造方法，可以设置一个圆的半径
		this.radius = radius;
	}

	public String getArea() {//功能是计算圆的面积的成员方法
		return df.format(PI * radius * radius);
	}

	public String getPerimeter() {//功能是计算圆的周长的成员方法
		return df.format(2 * PI * radius);
	}

	public double getRadius() {//功能是取圆的半径的成员方法
		return radius;
	}

	public void setRadius(double radius) {//功能是设定一个圆的半径的成员方法
		if(radius>0) {//给参数设定不能小于零的限制
			this.radius = radius;
		}else {
			System.err.println("半径值要大于0！");
		}

	}

	public String toString() {//覆盖了超类object中的toString方法，将圆的半径、周长、面积一并输出
		return "半径"+radius+",周长"+this.getPerimeter()+",面积"+this.getArea();
		/*在以对象名为内容将其直接输出时，与对象的toString方法等同，如果这里不覆盖这个方法，
		 * 将输出“包.类名+@+哈希值”
		 */	
	}

	public boolean equals(Circle c) {//判断对象是否是一个圆的成员方法
		if(this.radius==c.radius) {
			return true;
		}else {
			return false;
		}	
	}
}
