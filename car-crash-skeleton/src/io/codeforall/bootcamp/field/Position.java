package io.codeforall.bootcamp.field;

public class Position {

    private int col;
    private int row;

    public Position() { // construtor da posição posição inicial
        this.col = (int) (Math.random() * Field.getWidth());
        this.row = (int) (Math.random() * Field.getHeight());
    }

    public void moveRight() {
        if (this.col < Field.getWidth() - 1) {
            col++;
        }
    }

    public void moveLeft() {
        if (this.col > 0) {
            col--;
        }
    }

    public void moveUp() {
        if (this.row > 0) {
            row--;
        }
    }

    public void moveDown() {
        if (this.row < Field.getHeight() - 1) {
            row++;
        }
    }

    public void setPosition(int col, int row) { // atualiza a posição
        this.col = col;
        this.row = row;
    }

    // metodos para retorna a posição
    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }


    @Override
    public boolean equals(Object object) {
       if(object instanceof Position) {
           Position pos = (Position) object;

           return this.getCol() == pos.getCol() && this.getRow() == pos.getRow();
       }

       return false;
    }

}