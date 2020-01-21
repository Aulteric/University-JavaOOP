package com.uni.Pieces;

public abstract class ChessPiece {
    public String color;
    public int power;
    public int id;

    ChessPiece(String color) {

        this.color  = color;


    }
    public boolean ValidateInput(int OldRow, int OldCol, int NewRow, int NewCol ){
        if (OldCol >=0 && OldRow>=0 && OldCol <8 && OldRow<8 && NewCol>=0&& NewRow >=0&&NewCol<8 && NewRow<8 ){
            return true;
        }
        return false;
    }
}
