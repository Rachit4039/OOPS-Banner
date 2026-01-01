package uc3;

public class uc3 {

    // Static methods for each letter pattern
    public static char[][] getOPattern() {
        char[][] grid = new char[7][9];
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = ' ';

        for (int i = 1; i < 8; i++) {
            grid[0][i] = '*';
            grid[6][i] = '*';
        }
        for (int i = 1; i < 6; i++) {
            grid[i][0] = '*';
            grid[i][8] = '*';
        }
        return grid;
    }

    public static char[][] getPPattern() {
        char[][] grid = new char[7][9];
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = ' ';

        for (int i = 0; i < 7; i++) grid[i][0] = '*';
        for (int i = 0; i < 8; i++) {
            grid[0][i] = '*';
            grid[3][i] = '*';
        }
        grid[1][8] = '*';
        grid[2][8] = '*';
        return grid;
    }

    public static char[][] getSPattern() {
        char[][] grid = new char[7][9];
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = ' ';

        for (int i = 1; i < 9; i++) {
            grid[0][i] = '*';
            grid[3][i] = '*';
            grid[6][i] = '*';
        }
        for (int i = 1; i < 3; i++) grid[i][0] = '*';
        for (int i = 4; i < 6; i++) grid[i][8] = '*';
        return grid;
    }

    // Utility method to assemble letters
    public static void printBanner(char[] letters) {
        char[][][] grids = new char[letters.length][][];

        // Assign patterns
        for (int i = 0; i < letters.length; i++) {
            switch (Character.toUpperCase(letters[i])) {
                case 'O' -> grids[i] = getOPattern();
                case 'P' -> grids[i] = getPPattern();
                case 'S' -> grids[i] = getSPattern();
                default -> grids[i] = new char[7][9]; // Empty grid for other letters
            }
        }

        // Print row by row
        for (int row = 0; row < 7; row++) {
            String line = "";
            for (char[][] grid : grids) {
                for (int col = 0; col < 9; col++) {
                    line += grid[row][col]; // String concatenation (+ operator)
                }
                line += "  "; // space between letters
            }
            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {
        char[] letters = {'O', 'O', 'P', 'S'};
        printBanner(letters);
    }
}
