import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WheelTestUnit {

	@Test
	void testWheel() {
		Wheel testwheel = new Wheel(8);
		assertEquals(8, testwheel.get_wheel().length);
		Coin[] values = testwheel.get_wheel();
		for(int i = 0; i < 8; i++) {
			assertNotNull(values[i]);
		}
		
		testwheel = new Wheel(-4);
		assertEquals(0, testwheel.get_wheel().length);		
	}

	@Test
	void testGet_wheel() {
		fail("Not yet implemented");
	}

	@Test
	void testSet_wheel_coin() {
		fail("Not yet implemented");
	}

	@Test
	void testSpin() {
		fail("Not yet implemented");
	}

}
