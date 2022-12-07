package interface_implementation;

public class School implements Building {
	
	// abstract public void door();
	
	public void door() 
	{
		System.out.println("door is calling from school");
	}
	
	public void window()
	{
		System.out.println("window called from school");
	}

	public static void main(String[] args) {
		
		// method one not valid
		School school = new School();
		school.window();
		
		//valid and method two
		Building building = new School();
		building.door();

	}

}
