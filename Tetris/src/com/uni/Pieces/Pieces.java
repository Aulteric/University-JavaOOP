package com.uni.Pieces;

public class Pieces {
    private PieceType pieceType;
    int blockCound;

    public static Pieces getRandomPiece() {
        PieceType pieceType = PieceType.getRandomPiece();
        return new Pieces(pieceType);
    }

    public Pieces(PieceType pieceType){
        this.pieceType = pieceType;
        blockCound = 4;
    }
}
