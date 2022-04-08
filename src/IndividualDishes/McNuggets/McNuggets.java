package IndividualDishes.McNuggets;

import IndividualDishes.Dish;

public class McNuggets extends Dish {

    private final McNuggetsType mcNuggetsType;

    private final int pieces;
    private final double fourNuggetsPrice = 4;
    private final double sixNuggetsPrice = 6;
    private final double tenNuggetsPrice = 10;
    private final double twentyNuggetsPrice = 20;
    private double price;

    public McNuggets(McNuggetsType mcNuggetsType, int pieces) {
        this.mcNuggetsType = mcNuggetsType;
        this.pieces = pieces;
    }

    public McNuggetsType getType() {
        return mcNuggetsType;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPrice() {
        switch (pieces) {
            default -> this.price = fourNuggetsPrice;
            case 6 -> this.price = sixNuggetsPrice;
            case 10 -> this.price = tenNuggetsPrice;
            case 20 -> this.price = twentyNuggetsPrice;
        }
        //Spicy nugget cost 10% more than regular
        price = mcNuggetsType == McNuggetsType.SPICY ? price * 1.1 : price * 1;
    }

    public double getPrice() {
        setPrice();
        return price;
    }

    //TODO add souse feature
    public void setSouse() {

    }
}
