package class_task;

public class Algo_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7,sum=0;
		System.out.println("the generated series is: ");
		System.out.print(n +" , ");
		while(n!=1) {
			if(n%2==0) {
				n = n/2;
				 System.out.print(n+ " , ");
			}
			else {
				n = n*3+1;
				System.out.print(n + " , ");
			}
		}
	}

}
