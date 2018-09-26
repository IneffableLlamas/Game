import java.util.Random;
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
		return this.coinWheel;
	}

	public void spin() {
		Random randomizer = new Random();
		int randomCoinMaster = randomizer.nextInt(this.coinWheel.length);
		int randomCoinIterate = randomCoinMaster;
		int newOrder = 0;
		Coin[] newCoinOrder = new Coin[this.coinWheel.length];

		while(randomCoinIterate <= this.coinWheel.length) {
			newCoinOrder[newOrder] = this.coinWheel[randomCoinIterate];
			randomCoinIterate++;
			newOrder++;
		}

		int iterator = 0;
		while (iterator < randomCoinMaster) {
			newCoinOrder[newOrder] = this.coinWheel[iterator];
			iterator++;
			newOrder++;
		}

		for(int i = 0; i < newCoinOrder.length; i++) {
			this.coinWheel[i] = newCoinOrder[i];
		}
	}
}
