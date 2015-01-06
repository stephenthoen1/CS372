/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 * Searches and determines if the number is prime
 * @author stephenthoen
 */
public class PrimeNumbers {
    
    public static void searchprime() {
        for (int i = 2; i < 100; i++) {
            for (int s = 2; s <= i; s++) {
                if (i % s == 0) {
                    if (i == s) {
                        System.out.printf("Prime = %d\n", i);
                    } else {
                        break;
                    }
                }
            }
        }
    }

}
