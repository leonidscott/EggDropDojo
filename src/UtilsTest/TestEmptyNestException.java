import org.junit.Test;

public class TestEmptyNestException {

	@Test(expected = EmptyNestException.class) 
	public void TestErr() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 50);
		eggDrop.drop(66);
		eggDrop.drop(65);
	}

}
