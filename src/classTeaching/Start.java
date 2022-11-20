package classTeaching;//包名

public class Start {//类头 类体开始
	//public是访问修饰符 公共类Start

	public static void main(String[] args) {//方法头 方法体开始
		/*public 是访问修饰符，static代表这个方法是静态存储，void是返回值类型，main是方法名
		 * 公共静态无返回值的main方法，String是字符串类，[] args是字符串数组名，可以自定义，但一般不更改
		 * public static void main(String[] args)是Java程序的入口，main是供JVM识别的特殊方法名
		 * 只有包含main()方法的Java程序才能被JVM执行
		 */

		System.out.print("Welcome to Java!\n");
		/*System是类，out是System类中的数据成员，System.out是Java的标准输出，print()是其中的方法之一
		*/

		int i = 1; 
		System.out.printf("The value of i is %d\n",i);
		//格式化输出，与c中的printf一样，可以在字符串中添加占位符，并将printf()方法中的下一个参数传递给它

		System.out.println("Welcome to Java!");
		//输出字符串后强制换行

	}//方法体结束

}//类体结束

//单行注释

/*
 * 多行注释
 */

/**Javadoc注释
 * 
 * 
 */
