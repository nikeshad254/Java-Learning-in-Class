package abstraction_example;

public class Cow extends Animal {
	
	@Override 				//na lekhya ni hunxa
	public void sound() {
		System.out.println("moo");
	}
	
	public void color() {
		System.out.println("white");
	}
	
	public void onlysub() {
		System.out.println("this property is only in sub class");
	}

	public static void main(String[] args) {
		Animal animal = new Cow();		//Animal = type , Cow() = object can also make 
										//abstract class ko object banauna mildaina
										//Cow animal = new Cow() is also valid
		animal.call();
		animal.sound();
		animal.color();
//		animal.onlysub(); 		this throws error as onlysub is method of cow type not of animal type
		
		
/*	
 		abstract ko object banune tarika this is called anonymous class
 
		Animal animal = new Animal() {
			public void sound() {
				
			}
			public void color() {
				
			}
		};
*/

	}

}
