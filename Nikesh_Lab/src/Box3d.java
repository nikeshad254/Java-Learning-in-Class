
public class Box3d extends Box {
	public int lh;
	public int bh;
	public int ht;
	public Box3d(int length, int breadth, int height) {
		Box b = new Box();
		b.setL(length);
		b.setB(breadth);
		b.setH(height);
		
		lh = b.getL();
		bh = b.getB();
		ht = b.getH();
	}
	
	public void Area() {
		System.out.println("Area is "+ (2*(lh*bh+bh*ht+ht*lh)) + " m^2");
	}
	public void Volume() {
		System.out.println("Volume is "+ lh*bh*ht+ " m^3");
	}
	
	public static void main(String[] args) {
		Box3d box = new Box3d(10, 20, 30);
		box.Area();
		box.Volume();

	}
}
