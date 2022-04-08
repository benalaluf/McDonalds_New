package Meal;

import Meal.MealType.ChipsType;
import Meal.MealType.DrinkType;
import Meal.MealType.MealSizeType;

interface Meal {


    DrinkType getDrinkType();

    ChipsType getChipsType();

    MealSizeType getMealSizeType();

    void setDrink(DrinkType drinkType);

    void setChips(ChipsType chipsType);

    void setMealSize(MealSizeType sizeType);
}
