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
public class FoodItem {

    private int weight, volume;

    public FoodItem(int weight, int volume) {

        this.weight = weight;

        this.volume = volume;

    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }

}
