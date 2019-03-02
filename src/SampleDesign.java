public class SampleDesign {

	public static void main(String[] args) {
		EggDrop eggDrop = new EggDrop(100);
		int result = 0;
		try {
			result = findBreakingFloor(eggDrop);
		} catch (EmptyNestException e) {
			
		}
		//System.out.println(result);
		printArray(eggDrop.building);
	}
	
	public static int findBreakingFloor(EggDrop eggDrop) throws EmptyNestException {
		int n = eggDrop.building.length;
	
		return binarySearch(eggDrop, 0, n);
		
	}
	
	private static int binarySearch(EggDrop eggDrop, int min, int max) throws EmptyNestException {
		int floor = (max - min)/2 + min;
		
		//System.out.println("Binary Search: Floor " + floor + " | Egg count at beginning of function: " + eggDrop.eggCount());
		
		if(!eggDrop.drop(floor)) {
			if(eggDrop.eggCount() == 2) {
				return binarySearch(eggDrop, floor, max);
			}
			//System.out.println("entering linear search. Egg Count: " + eggDrop.eggCount());
			return linearSearch(eggDrop, min);
		}
		return floor;
	}
	
	private static int linearSearch(EggDrop eggDrop, int min) throws EmptyNestException {
		int counter = min;
		boolean foundFloor = false;
		
		while(!foundFloor) {
			//System.out.println("Linear Search: " + counter);
			foundFloor = eggDrop.drop(counter);
			if(!foundFloor){
				counter++;
			}
		}
		
		return counter;
	}

	private static void printArray(boolean[] array) {
		//System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if(i != array.length -1) {
				//System.out.print(i + " " + array[i] + ", ");
			}
			else {
				//System.out.print(i + " " + array[i]);
			}
		}
		//System.out.println("]");
	}
}
