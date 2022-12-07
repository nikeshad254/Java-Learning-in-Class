
public class TestingCont extends Testing{
	
	void call() {
		String ary = "modification in second calss";
		System.out.println(super.ary);
		super.call();
		System.out.println(ary);
	}
	
	public static void main(String[] args) {
		
		TestingCont tct = new TestingCont();
		tct.call();
	}
}
