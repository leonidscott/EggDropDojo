import java.util.Random;

public class EggDrop {
	
	private Egg egg;
    private int[] building;
    private int breakFloor;

    //Main Constructor
    public EggDrop(int n) {
    	
        building = new int[n];
        Random random = new Random();
        breakFloor = random.nextInt(n);
        
        egg = new Egg();
    }
    //Constructor for tests cases
    public EggDrop(int n, int breakFloor) {
        building = new int[n];
        this.breakFloor = breakFloor;
        
        egg = new Egg();
    }


    public boolean drop(int floor) throws EmptyNestException, HumptyDumptyException {
		checkEmpty(egg);
		if(floor > breakFloor) {
			egg.decriment();
			checkEmpty(egg);
			throw new HumptyDumptyException();
		}
		else if (floor < breakFloor) {
			return false;
		}
		return true;
    }
    
    public int eggCount () {
    	return egg.count();
    }
    
    private void checkEmpty(Egg egg) throws EmptyNestException {
    	if(egg.count() < 1){
    		throw new EmptyNestException();
    	}
    }
}
