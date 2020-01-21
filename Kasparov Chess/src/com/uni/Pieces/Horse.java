package com.uni.Pieces;

import com.uni.ChessBoard;

public class Horse extends ChessPiece implements Actions{

    Horse(String color){
        super(color);
        this.id = 4;
        this.power = 7;
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
        if (Math.abs(NewCol - OldCol) == 2 &&
                Math.abs(NewRow - OldRow) == 1) {

            return true;
        } else if (Math.abs(NewCol - OldCol) == 1 &&
                Math.abs(NewRow - OldRow) == 2) {

            return true;
        }
        return false;
    }
}
