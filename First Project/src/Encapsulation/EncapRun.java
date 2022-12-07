package Encapsulation;

public class EncapRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encaptest encaptest = new Encaptest();
		encaptest.setRollno(30);
		System.out.println("the roll no from one is: "+ encaptest.getRollno());
		
		encaptest.setName("nik");
		System.out.println("the name from one is: "+ encaptest.getName());
		
		Encaptest encaptest1 = new Encaptest();
		encaptest1.setRollno(40);
		System.out.println("the roll no from two is: "+ encaptest1.getRollno());
	}

}
