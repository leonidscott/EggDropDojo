import org.junit.Test;

public class TestEmptyNestException {

	@Test(expected = EmptyNestException.class) 
	public void TestErr() throws EmptyNestException, HumptyDumptyException {
		EggDrop eggDrop = new EggDrop(100, 50);
		try {
			eggDrop.drop(66);
		} catch (HumptyDumptyException exc) {
			//Hurray!
		}
		eggDrop.drop(65);
	}

}
