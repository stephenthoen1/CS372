/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;
import java.util.*;
/**
 *Randomizes the dice and then outputs a total.
 * @author stephenthoen
 */
public class Random_Dice {
    
    Random rand = new Random();
    private int d1 = 0;
    private int d2 = 0;
    public int dice_1()
    {
        d1 = rand.nextInt(6)+1;
        
        return d1;
    }
    public int dice_2()
    {
        d2 = rand.nextInt(6)+1;
        
        return d2;
    }
    
    public int print_dice_total()
    {
        int total_dice = d1 + d2;     
        return total_dice;
    }
    
}
