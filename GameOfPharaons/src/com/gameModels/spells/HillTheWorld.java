package com.gameModels.spells;

public interface HillTheWorld {
    void heal();

    default int requiredMagicPointsHealTheWorld() {
        return 20;
    }
}
