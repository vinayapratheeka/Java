package vinaya;

public class Sleep_Ex extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+ " : "+i);
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Sleep_Ex t1 = new Sleep_Ex();
	Sleep_Ex t2 = new Sleep_Ex();
	t1.setName("Thread - 1");
	t2.setName("Thread - 2");
	t1.start();
	t2.start();
	}

}
