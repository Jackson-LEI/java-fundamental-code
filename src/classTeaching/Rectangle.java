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
			System.err.println("����ֵҪ����0��");
		}
	}

	public void setWidth(double Width) {
		if(Width>0) {
			this.width = Width;
		}else {
			System.err.println("���ֵҪ����0��");
		}

	}

	public String toString() {
		return "��"+length+"����"+width+",���"+this.getArea()+",�ܳ�"+this.getPerimeter();
	}

	public boolean equals(Rectangle c) {
		if(this.length==c.length&&this.width==c.width) {
			return true;
		}else {
			return false;
		}	
	}
}
