package Lab7;

public class CubeThread extends Thread {

	int digit;
	CubeThread(int digit) {
		this.digit = digit;
	}
	
	public void run() {
		System.out.println("Cube of " + digit + " = " + (Math.pow(digit, 3)));
	}
}
