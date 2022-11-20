package classTeaching;

public class DemoString {
	
	public static void printLine() {//功能为输出分割线的成员方法
		System.out.println("************************");
	}

	public static void main(String[] args) {
		String s1;//字符串对象的声明
		s1 = "Hello! Java!";//创建字符串常量对象
		//字符串常量以匿名String类型自动创建
		
		//创建空字符串对象
		String s2;
		s2 = new String();
		System.out.println(s2);//将输出空值
		printLine();

		//使用初始值创建字符串对象
		String s3 = new String("Hello,Java!");//这行代码将字符串对象的声明与创建写在了一起

		//以字符数组为参数构建字符串
		char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };// 一维字符数组chars的枚举初始化
		String s4 = new String(chars);//构造方法中的参数chars可以将字符数组中的元素写入字符串
		System.out.println(s4);
		printLine();

		String s5 = new String(chars, 3, 4);
		//构造方法中的参数3和4代表将数组chars中从下标3开始，向后输出4个元素
		System.out.println(s5);
		printLine();

		//在Java中，字符串不存在终结符

		//字符串的操作

		String s6 = "Hello!";

		//获取字符串的长度
		System.out.println(s6.length());//调用字符串对象的length方法可以获取字符串的长度
		printLine();

		//在字符串中获取单个字符
		System.out.println(s6.charAt(3));
		//调用字符串对象的charAt()方法可以获取字符串中的单个字符，字符串下标从0开始
		printLine();

		//字符串的连接
		String s7 = "Jackson!";
		String s8 = s6.concat(s7);//调用字符串对象的concat()方法可以将两个字符串连接起来
		String s9 = s6 + s7;
		/*上面这两行代码的效果是等价的，下面这行的加号两边的操作数只要有一个是字符串类型，
		 * 这个加号就不再做加法运算，而是做字符串连接运算
		 */
		System.out.println(s8);
		System.out.println(s9);
		String s10 = "Welcome";
		String s11 = " To";
		String s12 = " Java!";
		System.out.println(((s10.concat(s11)).concat(s12)).concat(s7));
		//这行代码是方法concat()的嵌套使用
		printLine();

		//找出字符串中的某个字符串或某个子串
		System.out.println(s10.indexOf('e'));
		//调用字符串对象的indexOf()方法可以返回字符e在字符串s10中第一次出现的位置

		System.out.println(s10.indexOf('e', 2));
		//这行代码可以返回字符e在字符串下标2(包括2)以后第一次出现的位置(从左到右)

		System.out.println(s10.lastIndexOf('e'));
		//调用字符串对象的lastIndexOf()方法可以返回字符e在字符串s10中最后一次出现的位置

		System.out.println(s10.lastIndexOf('e', 6));
		//这行代码可以返回字符e在字符串下标6(包括6)以前第一次出现的位置(从右到左)
		printLine();

		//字符串的比较
		String s13 = "Jinlei";
		String s14 = "Jinlei";
		String s15 = "jinlei";
		String s16 = new String("Jinlei");
		System.out.println(s13 == s14);
		/*“==”可以判断两个字符串是否引用同一个对象，如果相同将返回布尔类型值true，否则返回false。
		 * 在这里s13和s14都是字符串常量，在Java中，相同内容的字符串常量会作为同一个对象处理，
		 * 存储在相同的内存空间
		 */
		System.out.println(s13 == s15);//由于字符串常量s13与s15的大小写不同，将返回false
		System.out.println(s13 == s16);
		/*s13是字符串常量，而s16是由字符串常量的值将字符串对象初始化，内存分配运算符会为其分配新的内存空间， 
		 * 他们并不是同一个对象
		 */
		System.out.println(s13.equals(s14));
		/*调用字符串对象的equals()方法可以判断字符串s13与字符串s14的内容是否相同。 
		 * 如果相同将返回布尔类型值true，否则返回false。
		 */
		System.out.println(s13.equals(s15));
		System.out.println(s13.equals(s16));// equals方法只判断两个字符串的内容是否相同
		System.out.println(s13.equalsIgnoreCase(s15));
		//调用字符串对象的equalsIgnoreCase()方法可以忽略大小写并判断字符串s13与字符串s15的内容是否相同
		System.out.println(s13.compareTo(s16));
		//调用字符串对象的compareTo()方法按照字典顺序判断字符串s13与字符串s16的内容是否相同，相同返回0
		System.out.println(s13.compareTo(s15));
		/*如果按照字典顺序判断字符串s13与字符串s15的内容不同，在这里将返回字符串s13内容减去字符串s15的值
		 * 由于小写字母的ASCII码大于大写字母，将输出-32
		 */
		System.out.println(s13.compareToIgnoreCase(s15));
		/*调用字符串对象的compareToIgnoreCase()方法可以忽略大小写并按照字典顺序判断字符串s13与
		 * 字符串s15的内容是否相同
		 */
		printLine();

		//获取子串
		String s17 = "abcdefghijk";
		System.out.println(s17.substring(4));
		//调用字符串对象的substring()方法可以返回从字符串下标4开始的子串
		System.out.println(s17.substring(4, 9));
		//substring()方法可以输入两个参数，用来指定返回子串的范围
		printLine();

		//字符串的转换、替换和分割
		String s18 = "  AbCdE ";
		System.out.println(s18.toLowerCase());
		//调用字符串对象的toLowerCase()方法可以将字符串中的大写字母替换成小写字母

		System.out.println(s18.toUpperCase());
		//调用字符串对象的toUpperCase()方法可以将字符串中的小写字母替换成大写字母

		System.out.println(s18.trim());
		//调用字符串对象的trim()方法可以将字符串两端的空白字符删除后的新字符串返回

		System.out.println(s18.replace('E', 'f'));
		//调用字符串对象的replace()方法可以将第一个参数的字符替换为第二个参数的字符
		
		System.out.println(s18.replaceAll("AbCdE", "ghijk"));
		/*调用字符串对象的replaceAll()方法可以将字符串中所以与第一个参数中的字符串相同的字符串
		 * 替换为第二个参数中的字符串
		 */
		
		String s19 = "Good Morning，Good Morning";
		System.out.println(s19.replaceFirst("Morning", "Evening"));
		/*调用字符串对象的replaceFirst()方法可以在字符串中从左到右寻找与第一个参数中的字符串
		 * 相同的第一次出现的字符串，并将它替换为第二个参数中的字符串
		 */
		printLine();

		//字符串的转换
		String s22 = "1200";
		String s23 = "12.15";

		System.out.println(Integer.valueOf(s22) + Float.valueOf(s23));
		//使用包装类Integer对象和Float对象的valueOf()方法将字符串转换为整型和浮点型

		System.out.println(Integer.parseInt(s22) + Float.parseFloat(s23));
		//也可以使用parseTPYE()方法

		String s24 = "China";
		char array[] = s24.toCharArray();//调用字符串对象的toCharArray()方法可以将字符串转换成字符数组
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		printLine();
		
		String sp = "this is a test";
		sp.split(sp);
		System.out.print(sp);

		//String与StringBuffer/StringBuilder的转换
		
		String s25 = "a";
		//StringBuffer与StringBuilder对象的声明与创建
		StringBuffer buffer1 = new StringBuffer("b");
		StringBuilder builder1 = new StringBuilder("c");

		StringBuffer buffer2 = new StringBuffer(s24);
		StringBuilder builder2 = new StringBuilder(s24);
		//可以使用StringBuffer类和StringBuilder类的构造方法将String转换成StringBuffer或StringBuilder

		String str1 = new String(buffer1);
		String str2 = new String(builder1);
		//可以使用String类的构造方法将StringBuffer或StringBuilder转换成String

		s24.toString();
		/*调用StringBuffer或StringBuilder对象的toString()方法，
		 * 将StringBuffer或StringBuilder转换成String
		 */
		
		//另一种写法
		String s26 = new String(s24);

		//StringBuilder的常用操作

		StringBuilder builder3 = new StringBuilder("abc");
		//使用字符串“abc”将StringBuilder对象初始化
		builder3.append("defg");
		//使用StringBuilder对象的append()方法可以在字符串后面追加内容
		System.out.println(builder3);

		StringBuilder builder4 = new StringBuilder("abcdefg");
		builder4.delete(3, 5);
		//调用StringBuilder对象的delete()方法中的两个参数可以移除字符串下标3到5之间的字符
		System.out.println(builder3);

		StringBuilder builder5 = new StringBuilder("abcdefg");
		builder5.deleteCharAt(3);
		//调用StringBuilder对象的deleteCharAt()方法可以移除指定的字符串下标上的字符
		System.out.println(builder5);

		StringBuilder builder6 = new StringBuilder("abcfg");
		builder6.insert(3, "de");
		/*调用StringBuilder对象的insert()方法可以将第二个参数上的字符串插入到字符串
		 * 序列位置的偏移量处(从左到右)
		 */
		System.out.println(builder6);

		StringBuilder builder7 = new StringBuilder("gfedcba");
		builder7.reverse();
		//调用StringBuilder对象的reverse()方法可以将字符串反向输出
		System.out.println(builder7);
		printLine();
		
		//String与StringBuffer的效率比较
		
		//String与StringBuffer的创建与声明
		String s27 = null;
		StringBuffer buffer3 = new StringBuffer();
		
		long t0 = System.currentTimeMillis();//记录当前时间
		/*System类的currentTimeMills()方法返回一个long类型的值，
		 * 该值表示当前时间与1970年1月1日0点0分0秒之间的时间差，单位是毫秒，通常也将该值称为时间戳。
		 */
		
		for(int i=1;i<=100000;i++) {//测试String累加求和所需的时间
			s27 = s27 + String.valueOf(i);
		}
		long t1 = System.currentTimeMillis();//记录执行完这个for循环以后的当前时间
		
		long t2 = System.currentTimeMillis();//记录当前时间
		for(int i=1;i<=100000;i++) {//测试StringBuffer累加求和所需的时间
			buffer3.append(i);
		}
		long t3 = System.currentTimeMillis();//记录执行完这个for循环以后的当前时间
		System.out.println("String:");
		System.out.println(t1-t0);//使用t1-t0得出第一个for循环执行的时间
		System.out.println("StringBuffer:");
		System.out.println(t3-t2);//使用t3-t2得出第二个for循环执行的时间
		/*能判断出在字符串中数据需要频繁更改的时候，StringBuffer明显有优势
		 * String、StringBuffer和StringBuilder的速度大小是：
		 * String > StringBuffer > StringBuilder
		 */
	}
}
