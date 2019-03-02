import static org.junit.Assert.*;

import org.junit.Test;

public class ProductionTests {

	@Test
	public void smallBuilding() throws EmptyNestException {
		System.out.println("******************* SMALL BULDING (N = 100) ********************");
		Long[] floorTimes = new Long[100];
		for(int i = 0; i < 100; i++) {
			EggDrop eggDrop = new EggDrop(100, i);

			Long startTime = System.nanoTime();
//			System.out.println(startTime);
			int breakingFloor = SampleDesign.findBreakingFloor(eggDrop);
			Long endTime = System.nanoTime();
//			System.out.println(endTime);

			Long ellapsedTime = endTime - startTime;
			System.out.println("Small Building (n = 100)| Breaking Floor: " + i + " | Elapsed Time: " + ellapsedTime);
			floorTimes[i] = ellapsedTime;

			assertEquals(breakingFloor, i);
		}
		System.out.println("AVERAGE TIME: " + averageArray(floorTimes));
		printArray(floorTimes);
	}

	@Test
	public void mediumBuilding() throws EmptyNestException {
		System.out.println("******************* SMALL BULDING (N = 10,000) ********************");
		Long[] floorTimes = new Long[10000];
		for(int i = 0; i < 10000; i++) {
			EggDrop eggDrop = new EggDrop(10000, i);

			Long startTime = System.nanoTime();
//			System.out.println(startTime);
			int breakingFloor = SampleDesign.findBreakingFloor(eggDrop);
			Long endTime = System.nanoTime();
//			System.out.println(endTime);

			Long ellapsedTime = endTime - startTime;
			System.out.println("Medium Building (n = 10000)| Breaking Floor: " + i + " | Elapsed Time: " + ellapsedTime);
			floorTimes[i] = ellapsedTime;

			assertEquals(breakingFloor, i);
		}
		System.out.println("AVERAGE TIME: " + averageArray(floorTimes));
	}
	
	@Test
	public void largeBuilding() throws EmptyNestException {
		System.out.println("******************* SMALL BULDING (N = 100,000) ********************");
		Long[] floorTimes = new Long[100000];
		for(int i = 0; i < 100000; i++) {
			EggDrop eggDrop = new EggDrop(100000, i);

			Long startTime = System.nanoTime();
//			System.out.println(startTime);
			int breakingFloor = SampleDesign.findBreakingFloor(eggDrop);
			Long endTime = System.nanoTime();
//			System.out.println(endTime);

			Long ellapsedTime = endTime - startTime;
			System.out.println("Large Building (n = 10000)| Breaking Floor: " + i + " | Elapsed Time: " + ellapsedTime);
			floorTimes[i] = ellapsedTime;

			assertEquals(breakingFloor, i);
		}
		System.out.println("AVERAGE TIME: " + averageArray(floorTimes));
	}
	
	public static long averageArray(Long[] arr) {
		if(arr.length == 0) return 0;

		long numerator = 0;
		for(int i = 0; i < arr.length; i ++) {
			numerator += arr[i];
		}
		return numerator/arr.length;
	}

	public static void printArray(Long[] arr) {
		System.out.print('[');
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length - 1) {
				System.out.println("( " + i +  " ) " + arr[i] + ']');
			}
			else {
				System.out.print("( " + i +  " ) " + arr[i] + ',');
			}
		}
	}

}
