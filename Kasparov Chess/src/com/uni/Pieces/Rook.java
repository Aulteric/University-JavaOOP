package com.uni.Pieces;

import com.uni.ChessBoard;

public class Rook extends ChessPiece implements Actions{

    Rook(String color){
        super(color);
        this.id = 5;
        this.power = 6;
    }


    @Override
    public void Move(ChessBoard board, int OldRow, int OldCol, int NewRow, int NewCol) {
        if(ValidateInput(OldRow, OldCol, NewRow, NewCol)) {
            if (ValidateMove(board, OldRow, OldCol, NewRow, NewCol))
            {
                board.Move(OldRow, OldCol, NewRow, NewCol);
            } else {
                System.out.println("This is not a valid move");
                Move(board, OldRow, OldCol, NewRow, NewCol);
            }
        }else {
            System.out.println("This is not a valid input");
        }
    }

    @Override
    public boolean ValidateMove(ChessBoard board, int OldRow, int OldCol, int NewRow, int NewCol) {
        if (OldCol == NewCol || OldRow == NewRow) {
            return true;
        }

        return false;
    }
}
