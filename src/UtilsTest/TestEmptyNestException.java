import org.junit.Test;

public class TestEmptyNestException {

	@Test(expected = EmptyNestException.class) 
	public void TestErr() throws EmptyNestException {
		EggDrop eggDrop = new EggDrop(100, 50);
		Egg egg = new Egg();
		eggDrop.drop(egg, 25);
		eggDrop.drop(egg, 27);
	}

}
