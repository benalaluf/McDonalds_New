package Desserts.McFlurry;

import Desserts.Dessert;

public class McFlurry extends Dessert {

    private McFlurryType mcFlurryType;

    private final double oreoPrice = 3.5;
    private final double mandmPrice= 4;

    public McFlurry(McFlurryType mcFlurryType) {
        this.mcFlurryType = mcFlurryType;
    }

    public McFlurryType getMcFlurryType() {
        return mcFlurryType;
    }

    public double getPrice() {
        return mcFlurryType == McFlurryType.OREAO? oreoPrice: mandmPrice;
    }
}
