public class CoinTest {
	public static void main(String[] args)  {
		Coin test1;
		System.out.println("TESTING RANDOMNESS: ");
		for( int i = 0; i < 10; i++) {
			test1 = new Coin();
			System.out.println(test1.get_coin());		
		}
		Coin test2 = new Coin();
		System.out.println("\n\nTESTING FLIP: INITIAL VALUE IS " + test2.get_coin());
		for(int i = 0; i < 10; i++) {
			test2.flip();
			System.out.println("FLIP: " + test2.get_coin());
		}

	}
}
