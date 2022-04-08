package Meal;

import Meal.MealType.ChipsType;
import Meal.MealType.DrinkType;
import Meal.MealType.MealSizeType;

interface Meal {


    ChipsType setChips(ChipsType chipsType);

    DrinkType setDrink(DrinkType drinkType);

    MealSizeType setMealSize(MealSizeType sizeType);
}
