package com.uni.Pieces;

import com.uni.ChessBoard;

import java.io.Console;

public class Pawn extends ChessPiece implements Actions{
    private boolean firstMove;

    Pawn(String color){
        super(color);
        this.id = 6;
        this.power = 2;
        firstMove = true;
    }

    @Override
    public void Move(ChessBoard board, int OldRow, int OldCol, int NewRow, int NewCol ) {
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
        if (OldCol == NewCol) {
            if (OldRow - NewRow == 1) {
                if (firstMove) {
                    firstMove = false;
                }
                return true;
            } else if (firstMove && (OldRow - NewRow == 2)) {
                if (firstMove) {
                    firstMove = false;
                }
                return true;
            }
        } else if (Math.abs(OldCol - NewCol) == 1) {
            if (board.isPieceAt(OldRow, OldCol) &&
                    OldRow - NewRow == 1) {

                if (firstMove) {
                    firstMove = false;
                }
                return true;
            }
        }
        return false;
    }

}
