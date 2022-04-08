package IndividualDishes.McNuggets;

import IndividualDishes.Dish;

public class McNuggets extends Dish {

    private final McNuggetsType mcNuggetsType;
    private int pieces;

    public McNuggets(McNuggetsType mcNuggetsType, int pieces) {
        this.mcNuggetsType = mcNuggetsType;
        this.pieces = pieces;
    }

    public McNuggetsType getType() {
        return mcNuggetsType;
    }

    private void setPieces(int pieces) {
        switch (pieces) {
            case 4 -> this.pieces = 4;
            case 6 -> this.pieces = 6;
            case 10 -> this.pieces = 10;
            case 20 -> this.pieces = 20;
            default -> {
                System.out.println("pls enter valid number!");
                this.pieces = -1;
            }
        }
    }

    public int getPieces() {
        return pieces;
    }

    public void setSouse() {

    }
}
