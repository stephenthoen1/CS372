/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace.food;

/**
 *
 * @author stephenthoen
 */
public class Coffee extends FoodItem {

    public Coffee(int weight, int volume) {

        super(weight, volume);

    }

    public void Grind() {

        System.out.println("grinding ...");

    }

}
