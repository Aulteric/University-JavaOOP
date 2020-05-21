package com.gameModels.spells;

public interface AttackOn {
    void attackOn();

    default int requiredMagicPointsAttackOn() {
        return 20;
    }
}
