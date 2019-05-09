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
public class Lunch implements Meal{

    private String description;

    public Lunch() {
        description = "Burger and fries ";
    }

    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
    
}
