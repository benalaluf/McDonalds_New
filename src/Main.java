import Meal.McNuggetsMeal;
import Meal.MealBase;

public class Main {
    public static void main(String[] args) {
        MealBase meal1 = new McNuggetsMeal("meal 69");
        meal1.orderMeal();
        meal1.recipe();
    }
}
