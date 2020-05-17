package me.frostythedev.farmlands.nutrients;

public enum NutrientType {

    NITRATES(50, 2.5),


    PHOSPHATES(50, 1.5),
    ;

    private double defValue;
    private double decayRate;

    NutrientType(double defValue, double decayRate) {
        this.defValue = defValue;
        this.decayRate = decayRate;
    }

    public double getDefValue() {
        return defValue;
    }

    public double getDecayRate() {
        return decayRate;
    }
}
