class Lab6Exceptions {
  public void method1() {
    try {
      method2();
    } catch (Exception e) {
      System.out.println("Exception caught in method1()");
    } finally {
      System.out.println("Finally block in method1()");
    }
  }

  public void method2() throws Exception {
    method3();
  }

  public void method3() throws Exception {
    throw new Exception("Exception thrown in method3()");
  }

  public static void main(String[] args) {
    Lab6Exceptions c = new Lab6Exceptions();
    c.method1();
  }
}
