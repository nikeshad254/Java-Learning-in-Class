package Exception;

public class FinallyTest {
	
	public static void main(String[] args) {
		try {
			int a= 2/0;
			System.out.println("answer is "+ a);
		}catch(Exception e) {
			System.out.println("Exception occurs ==> " +e.getMessage());
		}finally{
			// it runs both while exception found or not found
			System.out.println("finally block is executed");
		}
	}
}
