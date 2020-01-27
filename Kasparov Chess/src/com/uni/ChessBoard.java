package com.uni;

import com.uni.Pieces.ChessPiece;

public class ChessBoard {

    public ChessPiece[][] board;

    public ChessBoard() {
        board = new ChessPiece[8][8];
    }

    public void Move( int OldRow, int OldCol, int NewRow, int NewCol ){
        board[NewRow][NewCol] = board[OldRow][OldCol];
        RemovePiece(NewRow,NewCol);
    }
    public void RemovePiece(int Row, int Col ){
        board[Row][Col] = null;
    }

    public boolean isPieceAt(int row, int col) {
        return board[row][col] != null;
    }

}
