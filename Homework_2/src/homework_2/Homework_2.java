/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

import java.util.*;

/**
 * Contains the main of the application
 * @author stephenthoen
 */
public class Homework_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PT -- remove this note. The code is added
        // TODO code application logic here

        //PT -- need to check that there are arguments on the command line -2
        int i = Integer.parseInt(args[0]);

        //Exercise PR2_1, Exercise PR2_2
        Gerbil.gerbilList();

        //Exercise PR2_3
        Gerbil.makeMap();

        //Exercise PR2_4
        System.out.println("\nPr2_4\n");
        PIFormula.piCalc(i);

    }

}
