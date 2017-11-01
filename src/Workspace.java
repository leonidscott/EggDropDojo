
public class Workspace {
    public static void main(String[] args) {
        //Run your code here
    }

    public static int findBreakingFloor(EggDrop eggDrop) throws EmptyNestException {
        int n = eggDrop.building.length; //the hight of the building
        return 0; //To be changed
    }

    /*
    Directions:
    The primary function you will be coding in is findBreakingFloor.
    The function will take in an eggDrop object with a random breaking floor,
    and will return an integer representing the breaking floor.
    Inside findBreakingFloor or any function called by findBreakingFloor, you may not create a new Egg Drop Object.

    The main function can be used to test findBreakingFloor. It will not be called by tests. 
    --------------------------------------------------------------------------------------
    Egg Drop:
    Constuctor. There are two construtors. The first is for production, and the second is for testing.

    Constructor 1 (Production): This will be used when we run your code.
    EggDrop(int n); int n is the size of the building.

    Constructor 2 (Testing): You can use this construtor to test your code in test cases.
    EggDrop(int n, int breakFloor):

    int <NameOfEggDrop>.eggCount(); Returns an int representing how many eggs the object has. Either 0, 1, 2.

    int <NameOfEggDrop>.drop(int floor); Throws an EmptyNestException.
        You input what floor you would like to drop an egg from, and one of the four outcomes can happen.
            1) The floor will be lower than the breakFloor. The egg will survive, but drop will return false.
            2) The floor will be equal to the breakFloor. The function will return true.
            3) The floor will be above the breakFloor; The egg will break. The function will return false, and the egg count will be decrimented.
                If you loose your last egg, and your eggCount decriments to zero, drop will return a EmptyNestException.
                If you call drop with zero eggs, you will recieve another EmptyNestException. 
    
    If you loose all eggs, it is recomended that you throw the EmptyNestException rather than trying in an infinite loop of dropping egs you don't have. 
    */
}
