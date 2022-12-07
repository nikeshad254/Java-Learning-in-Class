package Exception;

public class ExceptionTest {
	
	public void division(int a, int b)
	{	
		int c=0;
		
		try {
			c = a/b;
			System.out.println(c);
			
		}catch(Exception e) {
			System.out.println("Divide by zero not allowed!!");
		}

	}
	
	public static void main(String[] args)
	{	
		ExceptionTest et = new ExceptionTest();
		et.division(10,0);
		
	}
}
