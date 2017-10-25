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
	public void testOneEgg() throws EmptyNestException, HumptyDumptyException {
		EggDrop eggDrop = new EggDrop(100, 50);
		eggDrop.drop(75);
		assertEquals(1, eggDrop.eggCount());
		eggDrop.drop(80);
		assertEquals(0, eggDrop.eggCount());
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
