import Desserts.Dessert;
import Desserts.McFlurry.McFlurry;
import Desserts.McFlurry.McFlurryType;
import IndividualDishes.Dish;
import IndividualDishes.McNuggets.McNuggets;
import IndividualDishes.McNuggets.McNuggetsType;
import Meal.MealBase;
import Meal.MealType.ChipsType;
import Meal.MealType.DrinkType;
import Meal.MealType.MealSizeType;
import SelfServicesMechin.SelfServicesMechanic;

public class Main {
    public static void main(String[] args) {
        SelfServicesMechanic selfServicesMechanic = new SelfServicesMechanic();

        //TODO ask for input of these parameters
        Dish dish = new McNuggets(McNuggetsType.REGULAR, 10);
        MealBase meal = new MealBase(dish, DrinkType.SPRITE, ChipsType.POTATO, MealSizeType.BIG);
        Dessert dessert = new McFlurry(McFlurryType.OREAO);

        selfServicesMechanic.order(dish); //ordering dish
        selfServicesMechanic.order(meal); //ordering meal
        selfServicesMechanic.order(dessert); //ordering dessert
    }
}
