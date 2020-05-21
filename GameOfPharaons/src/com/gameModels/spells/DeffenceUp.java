package com.gameModels.spells;

public interface DeffenceUp {
    void defenceUp();

    default int requiredMagicPointsDeffenceUp() {
        return 10;
    }
}
