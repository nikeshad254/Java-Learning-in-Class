class MultiThreadingExample extends Thread {
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void main(String[] args) {
	  for (int i = 0; i < 2; i++) {
		  MultiThreadingExample mth = new MultiThreadingExample();
		  mth.start();
	  }
  }
}



