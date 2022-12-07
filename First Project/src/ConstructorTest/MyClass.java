package ConstructorTest;

public class MyClass {
	
	// if not made any constructor then it is Default
	// if no arguments are send then it is not argument constructor
	// if arguments are send it is parameterized constructor
	// can have multiple constructor
	
	private int age;
	MyClass()
	{	
		System.out.println("constructor runs!!");
	}
	
	MyClass(int a, String b)
	{
		// used to initialize without using setter method
		this.age = a;
		System.out.println("my name is "+b+" and my age is "+a);
	}
	public int getAge(){
		return this.age;
	}
	
	public static void main(String[] args) 
	{
		MyClass myclass = new MyClass();
		MyClass myclass1 = new MyClass(10, "this");
		System.out.println(myclass1.getAge());
	}

}
