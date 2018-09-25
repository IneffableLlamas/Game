/**
 *
 * Wheel class for Game
 *
 *
 * @author Ben LeDoux
 * @author Jimmy Morgan
 * @author Mark Huntington
 * @author Anh Nguyen
 * @version 1.0
 */

public class Wheel {
	private Coin[] coinWheel;

	public Wheel(int sections) {
		this.coinWheel = new Coin[sections];
		for(int i = 0; i < coinWheel.length; i++) {
			coinWheel[i] = new Coin();
		}
	}

	public Coin[] get_wheel() {
		
	}

	public void spin() {

	}
} 
