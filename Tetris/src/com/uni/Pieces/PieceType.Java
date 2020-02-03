package com.uni.Pieces;

import java.util.Random;

public enum  PieceType {
    StraightShape, WASDShape, SquareShape, ZShape, LShape;

    private static final Random random = new Random();

    public static PieceType getRandomPiece() {
        return PieceType.values()[random.nextInt(PieceType.values().length)];
    }
}
