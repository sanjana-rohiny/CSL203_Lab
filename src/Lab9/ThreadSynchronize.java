package Lab9;

class Callme {
	
	public synchronized void printInfo(String name) {
		System.out.print("["+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.print("]");
	}
}

class ThreadProc extends Thread{
	
	String name;
	Callme callme;
	ThreadProc(String name, Callme callme) {
		this.name = name;
		this.callme = callme;
	}
	
	public void run() {
		callme.printInfo(name);
	}
	
}
public class ThreadSynchronize {

	public static void main(String[] str) {
		Callme callme = new Callme();
		
		ThreadProc t1 = new ThreadProc("one", callme);
		ThreadProc t2 = new ThreadProc("two", callme);

		t1.start();
		t2.start();
	}	
}
