import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoinTestUnit {

	@Test
	void testCoin() {
		Coin testcoin = new Coin();
		assertNotNull(testcoin);
	}

	@Test
	void testFlip() {
		Coin testcoin = new Coin();
		testcoin.set_coin('H');
		testcoin.flip();
		assertEquals('T', testcoin.get_coin());
		
		testcoin.set_coin('T');
		testcoin.flip();
		assertEquals('H', testcoin.get_coin());
	}

	@Test
	void testSet_coin() {
		Coin testcoin = new Coin();
		testcoin.set_coin('H');
		assertEquals('H', testcoin.get_coin());
		
		testcoin.set_coin('T');
		assertEquals('T', testcoin.get_coin());
		
		char previous = testcoin.get_coin();
		testcoin.set_coin('G');
		assertEquals(previous, testcoin.get_coin());
		
		previous = testcoin.get_coin();
		testcoin.set_coin('h');
		assertEquals(previous, testcoin.get_coin());
	}

}
