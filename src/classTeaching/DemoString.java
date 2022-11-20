package classTeaching;

public class DemoString {
	
	public static void printLine() {//����Ϊ����ָ��ߵĳ�Ա����
		System.out.println("************************");
	}

	public static void main(String[] args) {
		String s1;//�ַ������������
		s1 = "Hello! Java!";//�����ַ�����������
		//�ַ�������������String�����Զ�����
		
		//�������ַ�������
		String s2;
		s2 = new String();
		System.out.println(s2);//�������ֵ
		printLine();

		//ʹ�ó�ʼֵ�����ַ�������
		String s3 = new String("Hello,Java!");//���д��뽫�ַ�������������봴��д����һ��

		//���ַ�����Ϊ���������ַ���
		char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };// һά�ַ�����chars��ö�ٳ�ʼ��
		String s4 = new String(chars);//���췽���еĲ���chars���Խ��ַ������е�Ԫ��д���ַ���
		System.out.println(s4);
		printLine();

		String s5 = new String(chars, 3, 4);
		//���췽���еĲ���3��4��������chars�д��±�3��ʼ��������4��Ԫ��
		System.out.println(s5);
		printLine();

		//��Java�У��ַ����������ս��

		//�ַ����Ĳ���

		String s6 = "Hello!";

		//��ȡ�ַ����ĳ���
		System.out.println(s6.length());//�����ַ��������length�������Ի�ȡ�ַ����ĳ���
		printLine();

		//���ַ����л�ȡ�����ַ�
		System.out.println(s6.charAt(3));
		//�����ַ��������charAt()�������Ի�ȡ�ַ����еĵ����ַ����ַ����±��0��ʼ
		printLine();

		//�ַ���������
		String s7 = "Jackson!";
		String s8 = s6.concat(s7);//�����ַ��������concat()�������Խ������ַ�����������
		String s9 = s6 + s7;
		/*���������д����Ч���ǵȼ۵ģ��������еļӺ����ߵĲ�����ֻҪ��һ�����ַ������ͣ�
		 * ����ӺžͲ������ӷ����㣬�������ַ�����������
		 */
		System.out.println(s8);
		System.out.println(s9);
		String s10 = "Welcome";
		String s11 = " To";
		String s12 = " Java!";
		System.out.println(((s10.concat(s11)).concat(s12)).concat(s7));
		//���д����Ƿ���concat()��Ƕ��ʹ��
		printLine();

		//�ҳ��ַ����е�ĳ���ַ�����ĳ���Ӵ�
		System.out.println(s10.indexOf('e'));
		//�����ַ��������indexOf()�������Է����ַ�e���ַ���s10�е�һ�γ��ֵ�λ��

		System.out.println(s10.indexOf('e', 2));
		//���д�����Է����ַ�e���ַ����±�2(����2)�Ժ��һ�γ��ֵ�λ��(������)

		System.out.println(s10.lastIndexOf('e'));
		//�����ַ��������lastIndexOf()�������Է����ַ�e���ַ���s10�����һ�γ��ֵ�λ��

		System.out.println(s10.lastIndexOf('e', 6));
		//���д�����Է����ַ�e���ַ����±�6(����6)��ǰ��һ�γ��ֵ�λ��(���ҵ���)
		printLine();

		//�ַ����ıȽ�
		String s13 = "Jinlei";
		String s14 = "Jinlei";
		String s15 = "jinlei";
		String s16 = new String("Jinlei");
		System.out.println(s13 == s14);
		/*��==�������ж������ַ����Ƿ�����ͬһ�����������ͬ�����ز�������ֵtrue�����򷵻�false��
		 * ������s13��s14�����ַ�����������Java�У���ͬ���ݵ��ַ�����������Ϊͬһ��������
		 * �洢����ͬ���ڴ�ռ�
		 */
		System.out.println(s13 == s15);//�����ַ�������s13��s15�Ĵ�Сд��ͬ��������false
		System.out.println(s13 == s16);
		/*s13���ַ�����������s16�����ַ���������ֵ���ַ��������ʼ�����ڴ�����������Ϊ������µ��ڴ�ռ䣬 
		 * ���ǲ�����ͬһ������
		 */
		System.out.println(s13.equals(s14));
		/*�����ַ��������equals()���������ж��ַ���s13���ַ���s14�������Ƿ���ͬ�� 
		 * �����ͬ�����ز�������ֵtrue�����򷵻�false��
		 */
		System.out.println(s13.equals(s15));
		System.out.println(s13.equals(s16));// equals����ֻ�ж������ַ����������Ƿ���ͬ
		System.out.println(s13.equalsIgnoreCase(s15));
		//�����ַ��������equalsIgnoreCase()�������Ժ��Դ�Сд���ж��ַ���s13���ַ���s15�������Ƿ���ͬ
		System.out.println(s13.compareTo(s16));
		//�����ַ��������compareTo()���������ֵ�˳���ж��ַ���s13���ַ���s16�������Ƿ���ͬ����ͬ����0
		System.out.println(s13.compareTo(s15));
		/*��������ֵ�˳���ж��ַ���s13���ַ���s15�����ݲ�ͬ�������ｫ�����ַ���s13���ݼ�ȥ�ַ���s15��ֵ
		 * ����Сд��ĸ��ASCII����ڴ�д��ĸ�������-32
		 */
		System.out.println(s13.compareToIgnoreCase(s15));
		/*�����ַ��������compareToIgnoreCase()�������Ժ��Դ�Сд�������ֵ�˳���ж��ַ���s13��
		 * �ַ���s15�������Ƿ���ͬ
		 */
		printLine();

		//��ȡ�Ӵ�
		String s17 = "abcdefghijk";
		System.out.println(s17.substring(4));
		//�����ַ��������substring()�������Է��ش��ַ����±�4��ʼ���Ӵ�
		System.out.println(s17.substring(4, 9));
		//substring()��������������������������ָ�������Ӵ��ķ�Χ
		printLine();

		//�ַ�����ת�����滻�ͷָ�
		String s18 = "  AbCdE ";
		System.out.println(s18.toLowerCase());
		//�����ַ��������toLowerCase()�������Խ��ַ����еĴ�д��ĸ�滻��Сд��ĸ

		System.out.println(s18.toUpperCase());
		//�����ַ��������toUpperCase()�������Խ��ַ����е�Сд��ĸ�滻�ɴ�д��ĸ

		System.out.println(s18.trim());
		//�����ַ��������trim()�������Խ��ַ������˵Ŀհ��ַ�ɾ��������ַ�������

		System.out.println(s18.replace('E', 'f'));
		//�����ַ��������replace()�������Խ���һ���������ַ��滻Ϊ�ڶ����������ַ�
		
		System.out.println(s18.replaceAll("AbCdE", "ghijk"));
		/*�����ַ��������replaceAll()�������Խ��ַ������������һ�������е��ַ�����ͬ���ַ���
		 * �滻Ϊ�ڶ��������е��ַ���
		 */
		
		String s19 = "Good Morning��Good Morning";
		System.out.println(s19.replaceFirst("Morning", "Evening"));
		/*�����ַ��������replaceFirst()�����������ַ����д�����Ѱ�����һ�������е��ַ���
		 * ��ͬ�ĵ�һ�γ��ֵ��ַ������������滻Ϊ�ڶ��������е��ַ���
		 */
		printLine();

		//�ַ�����ת��
		String s22 = "1200";
		String s23 = "12.15";

		System.out.println(Integer.valueOf(s22) + Float.valueOf(s23));
		//ʹ�ð�װ��Integer�����Float�����valueOf()�������ַ���ת��Ϊ���ͺ͸�����

		System.out.println(Integer.parseInt(s22) + Float.parseFloat(s23));
		//Ҳ����ʹ��parseTPYE()����

		String s24 = "China";
		char array[] = s24.toCharArray();//�����ַ��������toCharArray()�������Խ��ַ���ת�����ַ�����
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		printLine();
		
		String sp = "this is a test";
		sp.split(sp);
		System.out.print(sp);

		//String��StringBuffer/StringBuilder��ת��
		
		String s25 = "a";
		//StringBuffer��StringBuilder����������봴��
		StringBuffer buffer1 = new StringBuffer("b");
		StringBuilder builder1 = new StringBuilder("c");

		StringBuffer buffer2 = new StringBuffer(s24);
		StringBuilder builder2 = new StringBuilder(s24);
		//����ʹ��StringBuffer���StringBuilder��Ĺ��췽����Stringת����StringBuffer��StringBuilder

		String str1 = new String(buffer1);
		String str2 = new String(builder1);
		//����ʹ��String��Ĺ��췽����StringBuffer��StringBuilderת����String

		s24.toString();
		/*����StringBuffer��StringBuilder�����toString()������
		 * ��StringBuffer��StringBuilderת����String
		 */
		
		//��һ��д��
		String s26 = new String(s24);

		//StringBuilder�ĳ��ò���

		StringBuilder builder3 = new StringBuilder("abc");
		//ʹ���ַ�����abc����StringBuilder�����ʼ��
		builder3.append("defg");
		//ʹ��StringBuilder�����append()�����������ַ�������׷������
		System.out.println(builder3);

		StringBuilder builder4 = new StringBuilder("abcdefg");
		builder4.delete(3, 5);
		//����StringBuilder�����delete()�����е��������������Ƴ��ַ����±�3��5֮����ַ�
		System.out.println(builder3);

		StringBuilder builder5 = new StringBuilder("abcdefg");
		builder5.deleteCharAt(3);
		//����StringBuilder�����deleteCharAt()���������Ƴ�ָ�����ַ����±��ϵ��ַ�
		System.out.println(builder5);

		StringBuilder builder6 = new StringBuilder("abcfg");
		builder6.insert(3, "de");
		/*����StringBuilder�����insert()�������Խ��ڶ��������ϵ��ַ������뵽�ַ���
		 * ����λ�õ�ƫ������(������)
		 */
		System.out.println(builder6);

		StringBuilder builder7 = new StringBuilder("gfedcba");
		builder7.reverse();
		//����StringBuilder�����reverse()�������Խ��ַ����������
		System.out.println(builder7);
		printLine();
		
		//String��StringBuffer��Ч�ʱȽ�
		
		//String��StringBuffer�Ĵ���������
		String s27 = null;
		StringBuffer buffer3 = new StringBuffer();
		
		long t0 = System.currentTimeMillis();//��¼��ǰʱ��
		/*System���currentTimeMills()��������һ��long���͵�ֵ��
		 * ��ֵ��ʾ��ǰʱ����1970��1��1��0��0��0��֮���ʱ����λ�Ǻ��룬ͨ��Ҳ����ֵ��Ϊʱ�����
		 */
		
		for(int i=1;i<=100000;i++) {//����String�ۼ���������ʱ��
			s27 = s27 + String.valueOf(i);
		}
		long t1 = System.currentTimeMillis();//��¼ִ�������forѭ���Ժ�ĵ�ǰʱ��
		
		long t2 = System.currentTimeMillis();//��¼��ǰʱ��
		for(int i=1;i<=100000;i++) {//����StringBuffer�ۼ���������ʱ��
			buffer3.append(i);
		}
		long t3 = System.currentTimeMillis();//��¼ִ�������forѭ���Ժ�ĵ�ǰʱ��
		System.out.println("String:");
		System.out.println(t1-t0);//ʹ��t1-t0�ó���һ��forѭ��ִ�е�ʱ��
		System.out.println("StringBuffer:");
		System.out.println(t3-t2);//ʹ��t3-t2�ó��ڶ���forѭ��ִ�е�ʱ��
		/*���жϳ����ַ�����������ҪƵ�����ĵ�ʱ��StringBuffer����������
		 * String��StringBuffer��StringBuilder���ٶȴ�С�ǣ�
		 * String > StringBuffer > StringBuilder
		 */
	}
}
