package classTeaching;

public class Method {

	public static void main(String[] args) {
		//����
		int i = 7;
		int j = 3;
		int k = max(i,j);
		//���÷���max��i��j��ʵ�ʲ�����ָ��������ʽ����
		System.out.println(k);
		System.out.println("*****************************");
		
		int a = 5;
		change(a);
		//��Ȼ������change���������书��ֻ�޸�����ʽ������������ʹ�ֲ�����a��ֵ����
		System.out.println(a);
		System.out.println("*****************************");
		
		int []array = {56,98,74,12,50,46,34};
		halfArray(array);
		for(int b = 0;b<array.length;b++) {
			System.out.print(array[b]+" ");
			//������halfArray����������Array������Ԫ�ص�ֵ��������
		}
	}

	public static int max(int num1,int num2) {//max(int num1,int num2)����ǩ��
		//max�Ƿ�������int num1,int num2�ǲ����б���������ͬһ�����п�����ͬ������ʽ����������ͬ
		int result;
		if(num1>num2) {
			result = num1;
		}else {//else����Ǳ���ģ���Ϊ��ֵ������ȫ���ǵ�
			result = num2;
		}
		return result;//���ڷ���ֵ����Ϊvoid�ķ�����return����Ǳ����
	}
	
	public static int change(int a) {//�����ǽ���ʽ����+1�ķ���
		a++;
		return a;
		//�����޸����������ǻ����������͵���ʽ�����ķ���������ı�ʵ�ʲ�����ֵ
	}
	
	public static int []halfArray(int []array){//�����ǽ������е�Ԫ�ؼ���ķ���
		for(int index = 0; index<array.length;index++) {
			array[index] = array[index]/2;
		}
		return array;
		//�����޸����������������������͵���ʽ�����ķ�����ı�ʵ�ʲ�����ֵ
	}

}
