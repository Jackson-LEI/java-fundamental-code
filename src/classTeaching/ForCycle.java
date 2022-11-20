package classTeaching;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ForCycle {

	public static void main(String[] args) {
		//传统的for循环用法
		String [] names = {"pig","cat","dog","horse"};//定义字符串数组，names是数组名
		for (int index = 0; index < names.length;index++) {
			System.out.println(names[index]);
		//[]是数组下标运算符，这行代码可以按数组下标顺序，依次输出数组中的内容
		}
			
		System.out.println("********************************");

		//JDK5:增强型for循环
		for (String s:names)//使用“:”将循环变量类型及其名称与数组names分隔开，可以简单的遍历这个数组
			System.out.println(s);
		System.out.println("********************************");

		//集合
		List<String> names2 = new ArrayList<String>();
		/*List是列表，使用时需要引入，String是列表类型，names2是列表名
		 *ArrayList是动态数组，使用时需要引入，可以动态的改变数组的大小
		 */
		names2.add("pig");
		names2.add("cat");
		names2.add("dog");
		names2.add(0,"horse");
		//使用add方法为列表添加内容，同时可以添加一个表示序号的参数，也就是数组下标，可以指定添加对象的顺序
		System.out.println(names2);
		System.out.println("********************************");

		Set<String> names3 = new TreeSet<String>();
		/*Set是集合，使用时需要引入，在set中不能出现重复对象
		 *TreeSet是有序集合，使用时需要引入，可以自动为数组中的对象排序，按照字母顺序
		 */
		names3.add("d");
		names3.add("e");
		names3.add("f");
		names3.add("g");
		names3.add("g");
		System.out.println(names3);
	}

}