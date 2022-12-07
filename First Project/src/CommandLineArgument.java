
public class CommandLineArgument {
	public static void main ( String[] args)
	{
		if(args.length>0)		// args ma value xa vane matrw run hune else error auxa 
		{
			System.out.println("the command line argument are: ");
			for(String val:args) {  //val ko String data type define gareko ho
				System.out.println(val);
			}
		}
		else {
			System.out.println("no command line" + " argument not found");
		}
	}
}
