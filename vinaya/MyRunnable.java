package vinaya;

public class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Thread running using Runnable");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
