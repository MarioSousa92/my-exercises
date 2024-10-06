package io.codeforall.bootcamp.field;

public class Position {

    private int col;
    private int row;

    // metodos para retorna a posição
        public int getCol() {return 0;}

        public int getRow() {return 0;}

    public Position(int col, int row) { // construtor da posição posição inicial
        this.col = col;
        this.row = row;

        public void setPosition (int col, int row){ // atualiza a posição
            this.col = col;
            this.row = row;
        }
    }
}