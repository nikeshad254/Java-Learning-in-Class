//calculate compounding interest
public class DoExample {

	public static void main(String[] args) {
		float P = 20000, T = 5, R = 10;
		float A = P;
		float i = T;
		do {
			A += (A*R)/100;
			i--;
		}while(i>0);
		System.out.println("Final Amount is: Rs."+A);
	}
}
