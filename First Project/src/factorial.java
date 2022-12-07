
public class factorial {
	
	public static int factorials(int num) {
		if(num==0) {
			return 1;
		}
		
		return num*factorials(num-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(factorials(n));
	}

}
