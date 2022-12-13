//tell state from age
public class IfExample {
	
	public String tellState(int age) {
		if(age<5) 
			return "Wait! You can use program?";
		
		else if(age>=5 && age<18)
			return "You are teen";
		
		else if(age>=18 && age<40) 
			return "you are adult";
		
		else
			return "You are old";
		
	}

	public static void main(String[] args) {
		int age = 12;
		IfExample ifE = new IfExample();
		System.out.println("Message:- "+ ifE.tellState(age)); 
	}
}
