class Triangle extends Shape{
	public void draw(int a, int b, int c) {
		System.out.println("We drew Triangle with cords = "+ a+" ,"+ b+" ,"+ c);
	}
	public void erase(int a, int b, int c) {
		System.out.println("Triangle with cords = "+ a+" ,"+ b+" ,"+ c+" was erased");
	}
	
	public static void main(String[] args) {

		Triangle t = new Triangle();
		t.draw();
		t.draw(12, 13, 14);
		t.erase();
		t.erase(12, 13, 14);
	}
}