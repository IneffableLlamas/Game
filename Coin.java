import java.util.Random;

/**
 * 
 * Coin class for Game
 *
 *
 * @author Ben LeDoux
 * @author Jimmy Morgan
 * @author Mark Huntington
 * @author Anh Nguyen
 * @version 1.0
 */

public class Coin {
	private String coinState;

	/**
	* Constructs a Coin object with a randomized value of 'H' or 'T'.
	*/
	public Coin() {
		String[] coinChoose = {"H", "T"}; // Coin options: H for heads, T for tails
		Random random = new Random(); 

		this.coinState = coinChoose[random.nextInt(coinChoose.length)]; // Randomly selects 0 or 1 from coinChoose and assigns value to coinState
	}

	/**
	 * Modifies the coin state by flipping the value
	*/
	public void flip() {
		if(coinState == "H") {
			coinState = "T";
		}
		else {
			coinState = "H";
		}
	}

	/**
	 * Provides the current state of the coin
	 * 
	 * @return Current Coin State
	 */	
	public String get_coin() {
		return coinState;
	}	

	/**
	 * Sets the state of the coin to a new state provided by the engine
	 * @param newState	new state of the coin as input by the engine
	*/
	public void set_coin(String newState) {
		coinState = newState;
	}
}
