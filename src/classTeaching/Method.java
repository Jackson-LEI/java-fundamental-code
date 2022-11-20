package classTeaching;

public class Method {

	public static void main(String[] args) {
		//方法
		int i = 7;
		int j = 3;
		int k = max(i,j);
		//调用方法max，i和j是实际参数，指代的是形式参数
		System.out.println(k);
		System.out.println("*****************************");
		
		int a = 5;
		change(a);
		//虽然调用了change方法，但其功能只修改了形式参数，并不会使局部变量a的值自增
		System.out.println(a);
		System.out.println("*****************************");
		
		int []array = {56,98,74,12,50,46,34};
		halfArray(array);
		for(int b = 0;b<array.length;b++) {
			System.out.print(array[b]+" ");
			//调用了halfArray方法后，数组Array的所有元素的值都将减半
		}
	}

	public static int max(int num1,int num2) {//max(int num1,int num2)方法签名
		//max是方法名，int num1,int num2是参数列表，方法名在同一个类中可以相同，但形式参数不能相同
		int result;
		if(num1>num2) {
			result = num1;
		}else {//else语句是必须的，因为赋值必须是全覆盖的
			result = num2;
		}
		return result;//对于返回值类型为void的方法，return语句是必须的
	}
	
	public static int change(int a) {//功能是将形式参数+1的方法
		a++;
		return a;
		//这种修改数据类型是基本数据类型的形式参数的方法并不会改变实际参数的值
	}
	
	public static int []halfArray(int []array){//功能是将数组中的元素减半的方法
		for(int index = 0; index<array.length;index++) {
			array[index] = array[index]/2;
		}
		return array;
		//这种修改数据类型是引用数据类型的形式参数的方法会改变实际参数的值
	}

}
