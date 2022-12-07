
public class Testing {
	public String ary = "This is a srting";
	
	public void come() {
		System.out.println(ary);
	}
	
	void call() {
		System.out.println(this.ary);
	}
	
	public static void main (String[] args) {
		String ary = "modified string";
		Testing test = new Testing();
		test.call();
		System.out.println(ary);
	}
}
