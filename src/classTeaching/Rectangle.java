package classTeaching;

import java.text.DecimalFormat;

public class Rectangle {
	double length = 1;
	double width = 1;
	DecimalFormat df = new DecimalFormat("0.00");

	public Rectangle() {

	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public String getArea() {
		return df.format(length * width);
	}

	public String getPerimeter() {
		return df.format(length + width);
	}

	public void setLength(double length) {
		if(length>0) {
			this.length = length;
		}else {
			System.err.println("长度值要大于0！");
		}
	}

	public void setWidth(double Width) {
		if(Width>0) {
			this.width = Width;
		}else {
			System.err.println("宽度值要大于0！");
		}

	}

	public String toString() {
		return "长"+length+"，宽"+width+",面积"+this.getArea()+",周长"+this.getPerimeter();
	}

	public boolean equals(Rectangle c) {
		if(this.length==c.length&&this.width==c.width) {
			return true;
		}else {
			return false;
		}	
	}
}
