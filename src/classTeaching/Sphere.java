package classTeaching;

import java.text.DecimalFormat;

public class Sphere extends Object{
	double radius = 1;
	static final double PI = 3.14;
	DecimalFormat df = new DecimalFormat("0.00");

	public Sphere() {
		radius = 1;
	}

	public Sphere(double radius) {
		this.radius = radius;
	}

	public String getArea() {
		return df.format(4 * PI *radius * radius);
	}

	public String getVolume() {
		return df.format(4.0/3*PI*radius * radius * radius);
	}

	public void setRadius(double radius) {
		if(radius>0) {
			this.radius = radius;
		}else {
			System.err.println("�뾶ֵҪ����0��");
		}

	}

	@Override
	public String toString() {
		return "�뾶��"+radius+",�����"+this.getVolume()+",�������"+getArea();
	}

	public boolean equals(Sphere c) {
		if(this.radius==c.radius) {
			return true;
		}else {
			return false;
		}	
	}
}
