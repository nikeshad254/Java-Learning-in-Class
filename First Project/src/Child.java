
public class Child extends Parent{
	//this is example of overriding. runtime polymorphism
	public void show() {
		System.out.println("This is from demo class.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b;
		Child child = new Child();
		child.show();
		b = child.age;
		System.out.println("the number is "+ b);
	}

}
