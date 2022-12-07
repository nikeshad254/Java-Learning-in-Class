package abstraction_example;

abstract class Animal {
	abstract void sound();
	
	public abstract void color();
	
	public void call() {
		System.out.println("this is called");
	}
}
