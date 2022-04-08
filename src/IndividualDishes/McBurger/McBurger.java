package IndividualDishes.McBurger;

import IndividualDishes.Dish;

public class McBurger implements Dish {

    McBurgerType mcBurgerType;

    public McBurger(McBurgerType mcBurgerType) {
        this.mcBurgerType = mcBurgerType;
    }

    public McBurgerType getMcBurgerType() {
        return mcBurgerType;
    }

    private void setMcBurgerType(McBurgerType mcBurgerType) {
        this.mcBurgerType = mcBurgerType;
    }
}
