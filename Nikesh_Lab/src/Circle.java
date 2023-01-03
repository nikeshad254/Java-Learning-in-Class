class Circle extends Shape{
	public void draw(int rad) {
		System.out.println("We drew Circle with rad = "+ rad);
	}
	public void erase(int rad) {
		System.out.println("Circle with rad = "+ rad +" was erased");
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.draw(12);
		c.erase();
		c.erase(12);

	}
}
