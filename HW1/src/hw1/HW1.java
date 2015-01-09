/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;
import java.util.*;

/**
 * This class contains my main for the HW1 exercises
 * @author stephenthoen
 */
public class HW1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PT: As we discussed in class, try to make main do much less, and refactor this
        //    code into other classes and methods.
        
        ProgramInfo.copyrightmessage(); //copywrite
        //PT: nice!
        
        //Exerise 1
        System.out.println("Exercise Number 1\n");
        DataOnly d = new DataOnly();
        d.i = 47;
        d.f = 12.12f; // ‘f’ after number indicates float constant
        d.b = false;
        
        System.out.printf("The value for i = %d\n", d.i);
        System.out.printf("The value for i = %-8.1f\n", d.f);
        System.out.printf("The value for i = %b\n\n", d.b);
        
        
        //Exercise 2 (2.7)
        
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println(args[i]);
        }
        
        //Exercise 3
        /**
        * This is formated in html too.
        * Javadoc should be created.
        */
        
        
        
        //Exercise 4
         System.out.println("\n\nExercise Number 4\n");
        
        System.out.println("Please Enter the Radius of the Circle: ");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        //PT: AreaFormual? Maybe AreaFormula?
        double total = AreaFormual.area(x); //Calculates the Area
        System.out.printf("The area of the circle = %-1.2f\n", total );
        
        
        //Exercise 5
        System.out.println("\n\nExercise Number 5\n");
        RandomNumbers random = new RandomNumbers();
        
        for(int i = 0; i < 25; i++)
            random.randtest();
        
        
        //Exercise 6
        
        System.out.println("\n\nExercise Number 6\n\n");
        
        PrimeNumbers.searchprime();
        
        
    }
    
}
