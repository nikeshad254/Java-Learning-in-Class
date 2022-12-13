//vowel and consonant seperator
public class SwitchExample {
	
	public String message(char letter) {
		String str = "";
		switch (letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			str = "vowel letter";
			
		default:
			str = "not a vowel";
		}
		return str;
	}
	public static void main(String[] args) {
		char letter = 'a';
		SwitchExample swEx = new SwitchExample();
		System.out.println("Message:- "+ swEx.message(letter));
	}

}
