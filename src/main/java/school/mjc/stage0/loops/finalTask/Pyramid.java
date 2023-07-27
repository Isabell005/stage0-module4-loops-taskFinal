package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {


    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
        for (int i = 7; i >= 1; i--) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = i * 2;

            System.out.println(" " + numberOfWhiteSpaces);
            for (int x = i; x == i; i--) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
