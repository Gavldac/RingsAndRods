
/**
 * This class determines how many rods in a ring toss game have all three colors of rings: red, green, and blue.
 * A rod is counted once if it has at least one ring of each color. 
 * Note that some rods may have no rings, while others may have multiple rings of varying colors.
 * 
 * @author Edwin Casady and Minh Vu
 */
public class RodsAndRings {

    /**
     * Counts the number of rods that have at least one ring of each color (R - Red, G - Green, B - Blue).
     * 
     * In the context of a ring toss game, you earn a point for each rod that displays all three colors.
     * 
     * The input is a formatted string representing rings and their corresponding rod positions.
     * For example, "B0B6G0R6R0R6G9" indicates:
     * - 'B0' means a blue ring on rod 0
     * - 'B6' means a blue ring on rod 6
     * - 'G0' means a green ring on rod 0
     * - and so forth.
     * 
     * Each rod is indexed from 0 to 9, and the total number of rods is fixed at 10.
     * The length of the input string can vary, but it will always be an even number, as it consists of color-position pairs.
     * 
     * @param rings A string formatted as color-position pairs (e.g., "R3G2B1").
     * @return int The count of rods that have at least one ring of each color (R, G, B).
     */
    private static int countRodsWith3Colors(String rings) {
        /*
         * Each ring is represented by a color ('R', 'G', 'B') followed by the rod number ('0' to '9').
         * For example, "R3G2B1" indicates:
         * - A red ring on rod 3
         * - A green ring on rod 2
         * - A blue ring on rod 1
         *
         * The method will return the total number of rods that contain rings of all three colors.
         */

       return 0; //TODO 
    }

//-----------------TEST CLIENT------------------------//
//----------------DO NOT MODIFY-----------------------//
    public static void main(String[] args) {
        String test1 = "B0B6G0R6R0R6G9";
        String test2 = "B0R0G0R9R0B0G0";
        String test3 = "G4";
        String test4 = "B7B1G6G0R9B3R1R1R7R1R1B1G7R8B2B0R0G9B9";
        String test5 = "";

        //Test case 1
        System.out.println("Expected count = 1");
        System.out.println("Tested results = " + countRodsWith3Colors(test1));
        System.out.println();

        //Test case 2
        System.out.println("Expected count = 1");
        System.out.println("Tested results = " + countRodsWith3Colors(test2));
        System.out.println();

        //Test case 3
        System.out.println("Expected count = 0");
        System.out.println("Tested results = " + countRodsWith3Colors(test3));
        System.out.println();

        //Test case 4
        System.out.println("Expected count = 3");
        System.out.println("Tested results = " + countRodsWith3Colors(test4));
        System.out.println();

        //Test case 5
        System.out.println("Expected count = 0");
        System.out.println("Tested results = " + countRodsWith3Colors(test5));
        System.out.println();
    }
    
    


}
