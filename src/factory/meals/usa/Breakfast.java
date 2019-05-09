/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.meals.usa;

import factory.meals.Meal;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class Breakfast implements Meal {

    private String description;
    private int calories;

    public Breakfast() {
        description = "Bacon, eggs, and Coffee";
        calories = 500;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
    
}
