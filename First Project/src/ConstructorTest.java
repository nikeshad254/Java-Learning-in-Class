
public class ConstructorTest {
	int age;
	// this is a constructor
	public ConstructorTest() {
		age = 25;
		System.out.println("constructor runs");
	}
	
	//constructor with paras
	public ConstructorTest(int num) {
		System.out.println("the number from below constructor with paras "+ num);
	}
	
	public int GetAge() {	//getter
		return age;	//main ma static bahek aru jadaina direct.
		// get age garna pardaina as constructor calls itself.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConstructorTest test =  new ConstructorTest();
		 // if define xaina vane constructor default defines hunxa by jvm
		 System.out.println("this is age from getage "+ test.GetAge());
		 System.out.println("this is age from direct test "+ test.age);
		 
		 ConstructorTest test1 =  new ConstructorTest(20);
		 
	}

}
