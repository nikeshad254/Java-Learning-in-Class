
class Square extends Shape{
	public void draw(int l, int b) {
		System.out.println("We drew Square with cords = "+ l +" ,"+ b);
	}
	public void erase(int l, int b) {
		System.out.println("Square with cords = "+ l + " ,"+ b +" was erased");
	}
	
	public static void main(String[] args) {
		Square s = new Square();
		s.draw();
		s.draw(12, 12);
		s.erase();
		s.erase(12, 12);
	}
}