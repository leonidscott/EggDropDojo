import java.util.Random;

public class EggDrop {
    private int[] building;
    private int breakFloor;

    //Main Constructor
    public EggDrop(int n) {
        building = new int[n];
        Random random = new Random();
        random.nextInt(n);
    }
    //Constructor for tests cases
    public EggDrop(int n, int breakFloor) {
        building = new int[n];
        this.breakFloor = breakFloor;
    }


    public boolean drop(Egg egg, int floor) throws EmptyNestException {
		checkEmpty(egg);
		if(floor != breakFloor) {
			egg.decriment();
			checkEmpty(egg);
			return false;
		}
		return true;
    }
    
    private void checkEmpty(Egg egg) throws EmptyNestException {
    	if(egg.count() < 1){
    		throw new EmptyNestException();
    	}
    }
}
