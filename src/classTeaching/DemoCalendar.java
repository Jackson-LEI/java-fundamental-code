package classTeaching;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DemoCalendar {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		/*Calendar����java�������࣬���Զ����ڽ���һϵ�еĲ���
		 * ʹ��Calendar�ഴ��һ��Calendar��������Calendar���ǳ����࣬����ʹ��new�����ʼ��
		 * ����Calendar���ṩ��һ������getInstance()�����Calendar���һ��ʵ��
		 */
		System.out.println(date.getTime());
		//���ö����getTime()�������Ի�ȡ��ǰʱ��
		
		Calendar date1 = Calendar.getInstance();
		date1.set(2021, 10, 17);
		//���ö����set()�����趨һ�����ڣ������������������ֱ����ꡢ�¡��գ��µ��±��0��ʼ
		date1.add(Calendar.DAY_OF_YEAR,12345);
		//���ö����add()�����ڽ�ָ����ʱ������ӻ��ȥ�����������ֶ�
		DemoString.printLine();
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		//SimpleDateFormat����������������������еķ�ʽ��ʽ���ͽ�������
		System.out.println(sdf.format(date1.getTime()));
		//����SimpleDateFormat������format()�������Խ����������ڸ�ʽ��
		DemoString.printLine();
		
		System.out.println(date1.get(Calendar.DAY_OF_MONTH));
		//����Calendar���DAY_OF_MONTH��������������������µĵڼ���
		DemoString.printLine();
		
		System.out.println(date1.get(Calendar.DAY_OF_YEAR));
		//����Calendar���DAY_OF_YEAR���������������������ĵڼ���
		DemoString.printLine();
		
		System.out.println(date1.get(Calendar.DAY_OF_WEEK));
		//����Calendar���DAY_OF_WEEK��������������������ܵĵڼ���
		DemoString.printLine();
		
		System.out.println(date1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//����Calendar���DAY_OF_WEEK_IN_MONTH������������ڵ�������������µĵڼ���
		DemoString.printLine();
	}

}
