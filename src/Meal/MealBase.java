package Meal;

import IndividualDishes.Dish;
import Meal.MealType.ChipsType;
import Meal.MealType.DrinkType;
import Meal.MealType.MealSizeType;

public class MealBase implements Meal {

    //protected Scanner scn = new Scanner(System.in);

    private DrinkType drink;
    private ChipsType chips;
    private MealSizeType mealSize;

    public MealBase(Dish dish, DrinkType drink, ChipsType chips, MealSizeType mealSize) {
        this.drink = drink;
        this.chips = chips;
        this.mealSize = mealSize;
    }

    @Override
    public DrinkType getDrinkType() {
        return drink;
    }

    @Override
    public ChipsType getChipsType() {
        return chips;
    }

    @Override
    public MealSizeType getMealSizeType() {
        return mealSize;
    }

    /**
     * set basic-meal things
     */
    public void setDrink(DrinkType drinkType) {
        switch (drinkType) {
            case COLA -> {
                drink = DrinkType.COLA;
            }
            case SPRITE -> {
                drink = DrinkType.SPRITE;
            }
            case FANTA -> {
                drink = DrinkType.FANTA;
            }
            default -> {
                drink = DrinkType.LEAN;
            }
        }
    }

    public void setChips(ChipsType chipsType) {
        switch (chipsType) {
            case POTATO -> {
                chips = ChipsType.POTATO;
            }
            default -> {
                chips = ChipsType.FRENCH;
            }
        }
    }

    public void setMealSize(MealSizeType mealSizeType) {
        switch (mealSizeType) {
            case BIG -> {
                mealSize = MealSizeType.BIG;
            }
            case ENORMOUS -> {
                mealSize = MealSizeType.ENORMOUS;
            }
            default -> {
                mealSize = MealSizeType.REGULAR;
            }
        }

    }






    
    /**
     * meal ordering basic ignore
     */
    private void orderCrisps() {
        System.out.println("pls chose crisps - ");
        //    setChips();
    }

    private void orderDrink() {
        System.out.println("pls chose drink - ");
        //    setDrink();
    }

    private void chooseMealSize() {
        System.out.println("pls chose meal size - ");
        //   setMealSize();
    }
}
