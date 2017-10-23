import static org.junit.Assert.*;

import org.junit.Test;

public class TestEggDrop {

	//Case: Test that random floor is between 0 and n
	@Test
	public void testRandConstructor() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100);
		
		boolean foundFloor = false;
		int i = 0;
		
		while(i < 100 && !foundFloor) {
			foundFloor = eggDrop.drop(i);
			//System.out.println("floor: " + i + " | foundFloor: " + foundFloor + " |eggCount: " + eggDrop.eggCount());
			i++;
		}
		assertTrue(foundFloor);
	}
	
	//Case: Egg is dropped on the correct floor
	@Test
	public void testSuccesfulDrop() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 75);
		assertTrue(eggDrop.drop(75));
		assertEquals(2, eggDrop.eggCount());
	}
	
	/*
	//Case: Egg is dropped on the wrong floor, one egg should be left
	@Test
	public void testFirstUnsuccesfullDrop() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 63);
		assertFalse(eggDrop.drop(24));
		assertEquals(1, eggDrop.eggCount());
	}
	
	//Case: Egg is dropped on the wrong floor, no eggs remaining.
	@Test (expected = EmptyNestException.class)
	public void testLastUnsuccesfullDrop() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 11);
		
		//First egg
		assertFalse(eggDrop.drop(24));
		assertEquals(1, eggDrop.eggCount());
		
		//Second egg
		try {
			assertFalse(eggDrop.drop(23));
		} catch (EmptyNestException exp) {
			assertEquals(0, eggDrop.eggCount());
			throw exp;
		}
		
	}
	*/
	
	//Case1: Starting With Two Eggs - Under the break floor
	@Test
	public void egg2Under() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 64);
		assertFalse(eggDrop.drop(50));
		assertEquals(2, eggDrop.eggCount());
	}
	//Case2: Starting with two eggs - On the break floor
	@Test
	public void egg2On() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(200, 190);
		assertTrue(eggDrop.drop(190));
		assertEquals(2, eggDrop.eggCount());
	}
	//Case3: Starting with two eggs - Over the break floor
	@Test
	public void egg2Over() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(250, 199);
		assertFalse(eggDrop.drop(240));
		assertEquals(1, eggDrop.eggCount());
	}
	//Case4: Start with one eggs - Under the break floor
	@Test
	public void egg1Under() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(500, 417);
		assertFalse(eggDrop.drop(450));
		assertEquals(1, eggDrop.eggCount());
		assertFalse(eggDrop.drop(0));
		assertEquals(1, eggDrop.eggCount());
	}
	//Case5: Start with one egg - On the break floor
	@Test
	public void egg1On() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(1000, 10);
		assertFalse(eggDrop.drop(450));
		assertEquals(1, eggDrop.eggCount());
		assertTrue(eggDrop.drop(10));
		assertEquals(1, eggDrop.eggCount());
	}
	//Case6: Start with one egg - Over the break floor
	@Test (expected = EmptyNestException.class)
	public void egg1Over() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100000, 400);
		assertFalse(eggDrop.drop(450));
		assertEquals(1, eggDrop.eggCount());
		try {
			eggDrop.drop(600);
		} catch (EmptyNestException exp) {
			assertEquals(0, eggDrop.eggCount());
			throw exp;
		}
	}
	
}
