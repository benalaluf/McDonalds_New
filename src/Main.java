import IndividualDishes.Dish;
import IndividualDishes.McNuggets.McNuggets;
import IndividualDishes.McNuggets.McNuggetsType;
import Meal.MealBase;
import Meal.MealType.ChipsType;
import Meal.MealType.DrinkType;
import Meal.MealType.MealSizeType;

public class Main {
    public static void main(String[] args) {
        Dish mcnuggets = new McNuggets(McNuggetsType.REGULAR,10);
        MealBase meal = new MealBase(mcnuggets, DrinkType.SPRITE, ChipsType.POTATO, MealSizeType.BIG);


    }
}
