import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
	void testPrint_wheel() {
		fail("Not yet implemented");
	}

	@Test
	void testSet_wheel_coin() {
		Wheel testwheel = new Wheel(4);
		Coin[] wheel = testwheel.get_wheel();
		char[] original = new char[4];
		for(int i = 0; i < 4; i++) {
			original[i] = wheel[i].get_coin();
		}
		
		
		testwheel.set_wheel_coin(4);
		for(int i = 0; i < 4; i++) {
			assertEquals(original[i], wheel[i].get_coin());
		}
		
		testwheel.set_wheel_coin(-1);
		for(int i = 0; i < 4; i++) {
			assertEquals(original[i],wheel[i].get_coin());
		}
		

		testwheel.set_wheel_coin(1);
		char newval = wheel[1].get_coin();
		assertNotEquals(original[1],newval);		
		
	}

	@Test
	void testSpin() {
		fail("Not yet implemented");
	}

}
