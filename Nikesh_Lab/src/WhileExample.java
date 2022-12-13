//sum of n natural numbers.
public class WhileExample {

	public static void main(String[] args) {
		int num = 10, sum=0;
		int original = num;
		while(num>0) {
			sum += num;
			num--;
		}
		System.out.println("Sum of natural number till "+ original + " is "+ sum);
	}
}
