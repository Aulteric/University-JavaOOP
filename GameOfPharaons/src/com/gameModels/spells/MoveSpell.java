package com.gameModels.spells;

public interface MoveSpell {
    void move(int x, int y);

    default int requiredMagicPointsMove() {
        return 10;
    }
}
