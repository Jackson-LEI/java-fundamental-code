package classTeaching;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DemoCalendar {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		/*Calendar类是java的日历类，可以对日期进行一系列的操作
		 * 使用Calendar类创建一个Calendar对象，由于Calendar类是抽象类，不能使用new将其初始化
		 * 但是Calendar类提供了一个方法getInstance()来获得Calendar类的一个实例
		 */
		System.out.println(date.getTime());
		//调用对象的getTime()方法可以获取当前时间
		
		Calendar date1 = Calendar.getInstance();
		date1.set(2021, 10, 17);
		//调用对象的set()方法设定一个日期，传递了三个参数，分别是年、月、日，月的下标从0开始
		date1.add(Calendar.DAY_OF_YEAR,12345);
		//调用对象的add()方法在将指定的时间量添加或减去给定的日历字段
		DemoString.printLine();
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//SimpleDateFormat类可以用于以区域设置敏感的方式格式化和解析日期
		System.out.println(sdf.format(date1.getTime()));
		//调用SimpleDateFormat类对象的format()方法可以将给定的日期格式化
		DemoString.printLine();
		
		System.out.println(date1.get(Calendar.DAY_OF_MONTH));
		//调用Calendar类的DAY_OF_MONTH方法输出该日期是所在月的第几天
		DemoString.printLine();
		
		System.out.println(date1.get(Calendar.DAY_OF_YEAR));
		//调用Calendar类的DAY_OF_YEAR方法输出该日期是所在年的第几天
		DemoString.printLine();
		
		System.out.println(date1.get(Calendar.DAY_OF_WEEK));
		//调用Calendar类的DAY_OF_WEEK方法输出该日期是所在周的第几天
		DemoString.printLine();
		
		System.out.println(date1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//调用Calendar类的DAY_OF_WEEK_IN_MONTH方法输出该日期的所在周是这个月的第几周
		DemoString.printLine();
	}

}
