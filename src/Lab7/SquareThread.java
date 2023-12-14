package Lab7;

public class SquareThread extends Thread {

	int digit;
	SquareThread(int digit) {
		this.digit = digit;
	}
	
	public void run() {
		System.out.println("Square of " + digit +
				" = " + (digit*digit));
	}
}
