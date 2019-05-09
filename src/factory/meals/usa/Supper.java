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
public class Supper implements Meal {

    private String description;
    private boolean isDelicious;

    public Supper() {
        description = "Steak, baked potato, and wine";
        isDelicious = true;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
    
}
