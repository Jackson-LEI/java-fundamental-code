package classTeaching;

public class Cat {
	/*������ࣺ��������ľ��廯�����Ƕ���ĳ������
	 * �����������������
	 * ������[�������η�] class ����
	 * ���壺{
	 * 			��Ա����(�������)
				���췽��(������)
				��Ա����(�����Ϊ�����)
			}
	 */
	String name;
	String breed;
	int age;
	String color;
	//è���ǳơ�Ʒ�֡����䡢��ɫ��è�����ԣ�������cat��ĳ�Ա����

	public void catchMouse() {//èץ������è����Ϊ���������cat��ĳ�Ա����
		System.out.println(name+"is catching mouse");
	}

	public void eatFish() {//è������è����Ϊ�������Ҳ��cat��ĳ�Ա����
		System.out.println(name+"is eating fish");
	}

	public Cat() {/*��cat�Ĺ��췽����û�з���ֵ���ͣ����Խ�����ĳ�ʼ��������ʱ����ʹ��new��
					*��һ����û�й��췽����ʱ��jvm���Զ�����һ���޲εģ�ȱʡ��Ĭ�Ϲ��췽��
					*/
		super();
	}
	public Cat(String name,String breed,int age,String color) {//�вεĹ��췽��
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
		//this��ָ����Ķ������������
	}
}
