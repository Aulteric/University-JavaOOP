package com.uni.Pieces;

import com.uni.ChessBoard;

public interface Actions {
    public void Move(ChessBoard board, int OldRow, int OldCol, int NewRow, int NewCol );
    public boolean ValidateMove(ChessBoard board, int OldRow, int OldCol, int NewRow, int NewCol );
}
