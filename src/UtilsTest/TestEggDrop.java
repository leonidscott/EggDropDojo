import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class TestEggDrop {

	//Case: Test that random floor is between 0 and n
	@Test
	public void testRandConstructor() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100);
		Egg egg = new Egg();
		
		boolean foundFloor = false;
		int i = 0;
		
		while(i < 100 && !foundFloor) {
			foundFloor = eggDrop.drop(egg, i);
			i++;
		}
		assertTrue(foundFloor);
	}
	
	//Case: Egg is dropped on the correct floor
	@Test
	public void testSuccesfulDrop() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 75);
		Egg egg = new Egg();
		assertTrue(eggDrop.drop(egg, 75));
	}
	
	//Case: Egg is dropped on the wrong floor, one egg should be left
	@Test
	public void testFirstUnsuccesfullDrop() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 63);
		Egg egg = new Egg();
		assertFalse(eggDrop.drop(egg, 24));
		assertEquals(1, egg.count());
	}
	
	//Case: Egg is dropped on the wrong floor, no eggs remaining.
	@Test (expected = EmptyNestException.class)
	public void testLastUnsuccesfullDrop() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 11);
		Egg egg = new Egg();
		
		//First egg
		assertFalse(eggDrop.drop(egg, 24));
		assertEquals(1, egg.count());
		
		//Second egg
		try {
			assertFalse(eggDrop.drop(egg, 23));
		} catch (EmptyNestException exp) {
			assertEquals(0, egg.count());
			throw exp;
		}
		
	}
	

}
