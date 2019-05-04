package com.highpowerbear.hpbanalytics.enums;

/**
 * Created by robertk on 11/18/2017.
 */
public enum ContractMultiplier {
    ES(50),
    NQ(20),
    RTY(50),
    YM(5),
    ESTX50(10),
    DAX(5),
    SMI(10),
    N225(1000),
    N225M(100),
    HSI(50),
    MHI(10),
    HHI_HK(50),
    MCH_HK(10),
    K200(250000),
    K200M(50000),
    ZB(1000),
    GC(100),
    CL(1000),
    M6E(12500),
    M6A(10000),
    M6B(6250);

    private final int multiplier;

    ContractMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public static int getByUnderlying(SecType secType, String underlying) {
        int multiplier = secType == SecType.OPT ? 100 : 1;
        String undl = underlying.replace(".", "_").toUpperCase();

        for (ContractMultiplier cm : ContractMultiplier.values()) {
            if (cm.name().equals(undl)) {
                multiplier = cm.multiplier;
                break;
            }
        }
        return multiplier;
    }
}
