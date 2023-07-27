package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int rowCount = 1;
        for (int i = cathetusLength; i >= 1; i--) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= cathetusLength; j++) {
                System.out.print(j + " ");
            }
            for (int j = cathetusLength - 1; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;

        }

    }
}

