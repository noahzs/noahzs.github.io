
public class maple {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		int c = 2;
		int d = 0;
		
		for(int i = 3; i<60;i++) {
			d = c - 3*b + a;
			a = b;
			b = c;
			c = d;	
			System.out.println(c);
		}
		System.out.println(c);
		

	}

}
