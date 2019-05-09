package factory.meals;

import factory.meals.german.GermanMealFactory;
import factory.meals.usa.USAMealFactory;

public class Driver {

    public static void main(String[] args) {
        //GermanMealFactory mealFactory = new GermanMealFactory();
        USAMealFactory mealFactory = new USAMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
