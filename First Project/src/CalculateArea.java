
public class CalculateArea {
	
	public static int area(int l)
	{
		return l*l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CalculateArea calcu = new CalculateArea();		//object banarw method ko calling
//		int areas = calcu.area(20);
		
		int areas = area(10);		//static use garda same class ko call 
		
		System.out.println("The area is "+ areas);
	}

}
