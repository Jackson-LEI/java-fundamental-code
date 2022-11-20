package classTeaching;

import java.text.DecimalFormat;

public class Circle {
	//��Ա����
	double radius = 1;
	public static final double PI = 3.14;//����
	DecimalFormat df = new DecimalFormat("0.00");
	
	public Circle() {//�޲Ρ�������Ϊ�յ�Ĭ�Ϲ��췽��

	}

	public Circle(double radius) {//����Ϊdouble���͵�radius�����صĹ��췽������������һ��Բ�İ뾶
		this.radius = radius;
	}

	public String getArea() {//�����Ǽ���Բ������ĳ�Ա����
		return df.format(PI * radius * radius);
	}

	public String getPerimeter() {//�����Ǽ���Բ���ܳ��ĳ�Ա����
		return df.format(2 * PI * radius);
	}

	public double getRadius() {//������ȡԲ�İ뾶�ĳ�Ա����
		return radius;
	}

	public void setRadius(double radius) {//�������趨һ��Բ�İ뾶�ĳ�Ա����
		if(radius>0) {//�������趨����С���������
			this.radius = radius;
		}else {
			System.err.println("�뾶ֵҪ����0��");
		}

	}

	public String toString() {//�����˳���object�е�toString��������Բ�İ뾶���ܳ������һ�����
		return "�뾶"+radius+",�ܳ�"+this.getPerimeter()+",���"+this.getArea();
		/*���Զ�����Ϊ���ݽ���ֱ�����ʱ��������toString������ͬ��������ﲻ�������������
		 * ���������.����+@+��ϣֵ��
		 */	
	}

	public boolean equals(Circle c) {//�ж϶����Ƿ���һ��Բ�ĳ�Ա����
		if(this.radius==c.radius) {
			return true;
		}else {
			return false;
		}	
	}
}
