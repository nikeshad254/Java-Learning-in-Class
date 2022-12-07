
public class GetterSetter {
	private int age;
	//method ko bahirw lai attribute vanxa
	private int Rollno;
	
	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter getset = new GetterSetter();
		
		getset.setAge(100);
		System.out.println("the set age from get age is: "+ getset.getAge());
		
		getset.setRollno(20);
		System.out.println("this is set to get roll no: "+ getset.getRollno());
	}

}
