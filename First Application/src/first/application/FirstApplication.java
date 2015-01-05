/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.application;
import java.util.Scanner;
/**
 *
 * @author stephenthoen
 */
public class FirstApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Stephen";
        System.out.printf("Hello %s, what is your score?", name);
        
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        System.out.printf("Your Score = %d ", score);
        
        
        
    }
    
}
