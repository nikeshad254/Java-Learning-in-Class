public class CallName {

    public static void main(String[] args)
    {
        StringTest test = new StringTest(); //here test is a copy of StringTest
        String name = test.getName();       // calling method of another class

        System.out.println(name);

        test.greet(name);
    }

}
