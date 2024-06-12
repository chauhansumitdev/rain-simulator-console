import java.util.Random;

public class RainSimulatorConsole {

    public static void main(String[] args) {
        try {
            render();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void render() throws Exception {
        char grid[][] = grid();

        while (true) {
            clearScreen();
            insertChar(grid);
            updateGrid(grid);
            printGrid(grid);
            Thread.sleep(100);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static char[][] grid() {
        return new char[20][20];
    }

    public static int randomCol() {
        Random random = new Random();
        return random.nextInt(20);
    }

    public static void printGrid(char grid[][]) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                char current = grid[i][j];
                if (current == '\u0000') {
                    System.out.print(" ");
                } else {
                    System.out.print(current);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void insertChar(char grid[][]) {
        int randomValue = randomCol();
        grid[0][randomValue] = '*';
    }

    public static void updateGrid(char grid[][]) throws Exception {
        for (int i = 18; i >= 0; i--) {
            for (int j = 0; j < 20; j++) {
                if (grid[i][j] == '*') {
                    grid[i + 1][j] = '*';
                    grid[i][j] = '\u0000';
                }

                if(grid[19][j] == '*'){
                    grid[19][j] = '_';
                }
            }
        }
    }
}
