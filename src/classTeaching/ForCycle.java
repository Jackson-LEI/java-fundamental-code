package classTeaching;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ForCycle {

	public static void main(String[] args) {
		//��ͳ��forѭ���÷�
		String [] names = {"pig","cat","dog","horse"};//�����ַ������飬names��������
		for (int index = 0; index < names.length;index++) {
			System.out.println(names[index]);
		//[]�������±�����������д�����԰������±�˳��������������е�����
		}
			
		System.out.println("********************************");

		//JDK5:��ǿ��forѭ��
		for (String s:names)//ʹ�á�:����ѭ���������ͼ�������������names�ָ��������Լ򵥵ı����������
			System.out.println(s);
		System.out.println("********************************");

		//����
		List<String> names2 = new ArrayList<String>();
		/*List���б�ʹ��ʱ��Ҫ���룬String���б����ͣ�names2���б���
		 *ArrayList�Ƕ�̬���飬ʹ��ʱ��Ҫ���룬���Զ�̬�ĸı�����Ĵ�С
		 */
		names2.add("pig");
		names2.add("cat");
		names2.add("dog");
		names2.add(0,"horse");
		//ʹ��add����Ϊ�б�������ݣ�ͬʱ�������һ����ʾ��ŵĲ�����Ҳ���������±꣬����ָ����Ӷ����˳��
		System.out.println(names2);
		System.out.println("********************************");

		Set<String> names3 = new TreeSet<String>();
		/*Set�Ǽ��ϣ�ʹ��ʱ��Ҫ���룬��set�в��ܳ����ظ�����
		 *TreeSet�����򼯺ϣ�ʹ��ʱ��Ҫ���룬�����Զ�Ϊ�����еĶ������򣬰�����ĸ˳��
		 */
		names3.add("d");
		names3.add("e");
		names3.add("f");
		names3.add("g");
		names3.add("g");
		System.out.println(names3);
	}

}