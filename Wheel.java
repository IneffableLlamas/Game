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
		if(sections < 0)
			sections = 0;
		
		this.coinWheel = new Coin[sections];
		for(int i = 0; i < coinWheel.length; i++) {
			coinWheel[i] = new Coin();
		}
	}

	public Coin[] get_wheel() {
		return coinWheel;
	}
	

	public void print_wheel(int[] selections) {
		int reveal = 0;
		for(int i = 0; i < this.coinWheel.length; i++) {
			if(i == selections[reveal]) {
				System.out.print(this.coinWheel[i].get_coin() + " ");
				reveal++;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("");
	}

	// Should we rename this to flip_wheel_coin? I think it would be more descriptive?
	public void set_wheel_coin(int coinIndex) {
		this.coinWheel[coinIndex].flip();
	}

	public void spin() {
		Random randomizer = new Random();
		int randomCoinMaster = randomizer.nextInt(this.coinWheel.length);
		int randomCoinIterate = randomCoinMaster;
		int newOrder = 0;
		Coin[] newCoinOrder = new Coin[this.coinWheel.length];

		while(randomCoinIterate <= this.coinWheel.length-1) {
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
