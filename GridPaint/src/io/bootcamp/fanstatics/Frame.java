package io.bootcamp.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Frame {

    public static final int CELLSIZE = 20;
    private Rectangle cel;
    private int col;
    private int row;

    public Frame (int col, int row) {
        this.col = col;
        this.row = row;
        cel = new Rectangle(row * CELLSIZE + 20, col * CELLSIZE + 20, CELLSIZE, CELLSIZE);
        cel.draw();
    }
}