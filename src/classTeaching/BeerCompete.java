package classTeaching;

public class BeerCompete {

	public static void main(String[] args) {
		//╠х╬фа©
		for(int a=1;a<=20;a++)
			for(int b=1;b<a;b++)
				for(int c=1;c<b;c++)
					for(int d=1;d<c;d++){
						if(b*c*d+a*c*d+a*b*d+a*b*c==a*b*c*d)
							System.out.println(a+","+b+","+c+","+d+",0");
					}

	}

}
