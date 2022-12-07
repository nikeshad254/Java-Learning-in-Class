class ExceptionTest
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 0;
        int c ;

        try{
//            try ma error ayo vane Exception le catch garxa and runs catch block.

            c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("error occured " + e.getMessage());
        }
    }

}
