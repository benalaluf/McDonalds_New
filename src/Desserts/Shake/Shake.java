package Desserts.Shake;

import Desserts.Dessert;

public class Shake extends Dessert {

    private final double shakePrice = 4;

    private ShakeType shakeType;

    public Shake(ShakeType shakeType) {
        this.shakeType = shakeType;
    }

    public ShakeType getShakeType() {
        return shakeType;
    }

    public double getPrice() {
        return shakePrice;
    }
}
