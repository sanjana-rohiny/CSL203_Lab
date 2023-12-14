package Lab7;

import java.util.Random;

public class FirstThread extends Thread {

	public void run() {

		Random random = new Random();
		while (true) {
			int digit = random.nextInt(10);

			if (digit % 2 == 0 ) {
				// even number
				SquareThread square = 
						new SquareThread(digit);
				square.start();
			} else {
				// odd numer
				CubeThread cube = new CubeThread(digit);
				cube.start();
				
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
