package Exception;

import java.io.IOException;
public class ThrowsExample {
	
	void m()throws IOException
	{
		throw new IOException("Device Error"); //checked exception
	}
	
	void n()throws IOException{
		m();
	}
	
	void p()
	{
		try
		{
			n();
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Handeled");
		}
	}
	
	public static void main()
	{
		ThrowsExample te = new ThrowsExample();
		te.p();
		System.out.println("normal flow...");
	}
}
