package classTeaching;

public class Output {

	public static void main(String[] args) {

		System.out.println(0100);//锟剿斤拷锟斤�?
		System.out.println(0xab);//十锟斤拷锟斤拷锟斤拷

		char ch1 = 'a';
		char ch2 = (char) (ch1 + 1);//锟剿达拷锟斤拷锟斤拷使锟斤拷强锟斤拷转锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
		System.out.println(ch2);

		char ch = '2';
		int i = ch;
		System.out.print(Integer.toHexString(i));//使锟斤拷int锟侥帮拷装锟斤拷锟斤拷远锟絠锟斤拷锟斤拷转锟斤拷

		char a = '\u03b1';
		char b = '\u03b2';
		char c = '\u03b3';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);//锟斤拷锟斤拷ASCII锟斤拷锟斤拷锟斤拷锟解，java锟斤拷锟斤拷锟斤拷锟斤拷Unicode锟斤拷锟斤拷

		System.out.println(5<<1);//锟斤拷锟斤拷锟斤拷锟斤拷位锟斤拷锟斤拷锟斤拷锟揭诧拷锟斤拷前锟�5锟侥讹拷锟斤拷锟斤拷锟斤�?0101锟斤拷锟斤拷锟斤拷位锟矫碉拷1010锟侥癸拷锟教ｏ拷锟斤拷锟�?10
		System.out.println(5>>1);//锟斤拷锟斤拷锟斤拷位锟斤拷锟斤拷锟�
	}
}