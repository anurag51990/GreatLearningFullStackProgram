import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Question1 {
    public static void question1(int floors, int[] flatSizeIthDay){
        int floorSizeReq = floors;
        TreeSet<Integer> floorSizeSet = new TreeSet<>();
        System.out.println("The order of construction is as follows");
        int dayCounter = 0;
        for(int floorSize: flatSizeIthDay){
            System.out.println("Day " + ++dayCounter);
            if (floorSizeReq == floorSize){
                System.out.print(floorSize + " ");
                floorSizeReq--;
            }else{
                floorSizeSet.add(floorSize);
            }

            if ( !floorSizeSet.isEmpty() && floorSizeSet.contains(floorSizeReq)){
                while (!floorSizeSet.isEmpty() && floorSizeSet.contains(floorSizeReq)){
                    System.out.print(floorSizeSet.pollLast() + " ");

                    floorSizeReq--;

                }
                System.out.println();
            }else{
                System.out.println("");
            }

        }


    }
}
