class Checkboolean {
    public boolean isLogin(String username, String password)
    {
        if(username.equals("nikesh")&&password.equals("nik123"))
        {
            return true;
        }
        return false;
    }

    public static void main (String[] args)
    {


        boolean login=false;
        String username = "nikesh";
        String password = "nik123";

        Checkboolean cb = new Checkboolean();  //method calling is here to create object names cb and agadi chai class name
        //class-name your-object-name = new-keyword class-name()

        login = cb.isLogin(username,password);  // to call function object created + . and method name

        if (login){
            System.out.println("Congrats!! you sucessfully logged in");
        } else{
            System.out.println("login failed");
        }

    }

}
