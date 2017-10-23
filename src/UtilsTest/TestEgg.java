import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEgg {
	

	@Test
	public void testCount () {
		Egg egg = new Egg();
		assertEquals(2, egg.count());
	}
	
	@Test (expected = EmptyNestException.class)
	public void testOneEgg() throws EmptyNestException {
		Egg egg = new Egg();
		EggDrop eggDrop = new EggDrop(100, 50);
		eggDrop.drop(egg, 25);
		assertEquals(1, egg.count());
		eggDrop.drop(egg, 31);
		assertEquals(0, egg.count());
	}
	
	@Test
	public void testDecriment() {
		Egg egg = new Egg();
		egg.decriment();
		assertEquals(1, egg.count());
		egg.decriment();
		assertEquals(0, egg.count());
	}
}
