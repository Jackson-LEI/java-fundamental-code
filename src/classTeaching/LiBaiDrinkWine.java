package classTeaching;

public class LiBaiDrinkWine {
	//��״��
	static int answer = 0;
	//��Ա����д�ڷ���֮�⣬��֮�ڣ�static�Ƿ������η�����ʾ��Ա�������Ա���̬�ķ����е���
	public static void fun(int wine,int store,int flower,String path) {
		if(wine<0) {
			return;
		}
		if(store==0 && flower == 0) {
			if(wine==0 && path.endsWith("b")) {
				//�����ַ��������endsWith()���������ж��ַ������һ��λ���ϵ��ַ�
				answer++;
				System.out.println(path);
			}
			return;
		}
		if(store>0) {
			fun(wine*2,store-1,flower,path+"a");
		}
		if(flower>0) {
			fun(wine-1,store,flower-1,path+"b");
		}
	}

	public static void main(String[] args) {
		fun(2,5,10,"");
		System.out.println(answer);
	}

}
