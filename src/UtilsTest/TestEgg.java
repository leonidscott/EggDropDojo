import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEgg {
	
	Egg egg = new Egg();

	@Test
	public void testCount () {
		assertEquals(2, egg.count());
	}
	
	@Test
	public void testOneEgg() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 50);
		eggDrop.drop(egg, 25);
		assertEquals(1, egg.count());
	}

}
