package io.bootcamp.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private int cols;
    private int rows;
    private Frame[][] frame;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        showGrid();
        Player player = new Player();
    }
public void showGrid(){
        frame = new Frame[cols][rows];
    for (int i = 0; i < cols; i++) {
        for (int j = 0; j < rows; j++) {
            frame[i][j] = new Frame(i, j);
        }
    }
}
}