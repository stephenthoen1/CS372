/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;
import java.util.*;
/**
 *Contains the random number tests for equals, greater than, less than.
 * @author stephenthoen
 */
public class RandomNumbers {
    
    public void randtest()
    {
        Random rand = new Random();
        int firstrand = rand.nextInt(100)+1;
        int secrand = rand.nextInt(100)+1;

        if(firstrand == secrand)
        {
            System.out.printf("%d is equal to %d\n", firstrand, secrand);
        }
        else if(firstrand > secrand)
        {
            System.out.printf("%d is Greater Than %d\n", firstrand, secrand);
        }
        else if(firstrand < secrand)
        {
            System.out.printf("%d is Less Than %d\n", firstrand, secrand);
        }
    };
    
}
