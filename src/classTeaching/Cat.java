package classTeaching;

public class Cat {
	/*对象和类：对象是类的具体化，类是对象的抽象概念
	 * 类由类名和类体组成
	 * 类名：[访问修饰符] class 类名
	 * 类体：{
	 * 			成员变量(类的属性)
				构造方法(构造器)
				成员方法(类的行为或操作)
			}
	 */
	String name;
	String breed;
	int age;
	String color;
	//猫的昵称、品种、年龄、颜色是猫的属性，他们是cat类的成员变量

	public void catchMouse() {//猫抓老鼠是猫的行为或操作，是cat类的成员方法
		System.out.println(name+"is catching mouse");
	}

	public void eatFish() {//猫吃鱼是猫的行为或操作，也是cat类的成员方法
		System.out.println(name+"is eating fish");
	}

	public Cat() {/*类cat的构造方法，没有返回值类型，可以将对象的初始化，调用时必须使用new，
					*在一个类没有构造方法的时候，jvm会自动创建一个无参的，缺省的默认构造方法
					*/
		super();
	}
	public Cat(String name,String breed,int age,String color) {//有参的构造方法
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
		//this是指向类的对象自身的引用
	}
}
