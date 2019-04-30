package com.epam.training.javajunior.HW3.Task10Memento;

public class Game {
    private static final String XOX_FORMAT =
              "\n %c|%c|%c"
            + "\n_ |_| _"
            + "\n %c|%c|%c"
            + "\n_ |_| _"
            + "\n %c|%c|%c";

    private char[][] grid = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

    public void setCell(char c, int xPos, int yPos) {
        grid[xPos][yPos] = c;
    }

    public Screenshot save() {
        char[][] copy = new char[grid.length][grid[0].length];
        for (int i = 0; i < copy.length; i++) {
            System.arraycopy(grid[i], 0, copy[i], 0, copy[i].length);
        }
        return new Screenshot(copy);
    }
    public void restore(Screenshot screenshot) {
        grid = screenshot.getGrid();
    }
    public String toString(){
        return String.format(XOX_FORMAT, grid[0][0], grid[1][0], grid[2][0],
                                        grid[0][1], grid[1][1], grid[2][1],
                                        grid[0][2], grid[1][2], grid[2][2]);
    }
}
