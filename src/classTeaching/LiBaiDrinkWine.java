package classTeaching;

public class LiBaiDrinkWine {
	//李白打酒
	static int answer = 0;
	//成员变量写在方法之外，类之内，static是访问修饰符，表示成员变量可以被静态的方法中调用
	public static void fun(int wine,int store,int flower,String path) {
		if(wine<0) {
			return;
		}
		if(store==0 && flower == 0) {
			if(wine==0 && path.endsWith("b")) {
				//调用字符串对象的endsWith()方法可以判断字符串最后一个位置上的字符
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
