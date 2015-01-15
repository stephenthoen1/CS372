/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.*;

/**
 * User input takes 10 integers and then calculates Min Max Avg
 *
 * @author stephenthoen
 */
public class UserInput {

    /**
     * Retrieves the numbers and outputs three Min Max Avg
     *
     * @author stephenthoen
     */
    public static void retrieveNum() {
        System.out.println("Please Enter 10 Integers\n");

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.printf("#%d Enter Number:", i);
                int x = scan.nextInt();
                list.add(x);
            } catch (Exception e) {
                System.out.println("Please Enter a valid input \n");
                scan.nextLine();
                i--;
            }
        }

        System.out.println("Min" + MinMaxAvg.Min(list));
        System.out.println("Max" + MinMaxAvg.Max(list));
        System.out.println("Avg" + MinMaxAvg.Avg(list));

    }

    public static void triangleNum() {
        ArrayList tri_list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        Boolean complete = false;
       
        while (!complete) {
            try {
                for (int i = 0; i < 3; i++) {
                    try {
                        System.out.printf("Please enter side %d of the Triangle: ", i);
                        tri_list.add(scan.nextInt());
                    } catch (Exception e) {
                        System.out.println("Please Enter a valid input \n");
                        scan.nextLine();
                        i--;
                    }
                }
                Triangle newTriangle = new Triangle(tri_list);
                
                System.out.println("Triangle Area = "+ newTriangle.getArea());
                System.out.println("Triangle Perimeter = " + newTriangle.getPerimeter());
               
                complete = true;

            } catch (Exception ex) {
                tri_list.clear();
            }
        }
        
    }
    
    public static void rectangleNum()
    {
        ArrayList rect_list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        Boolean complete = false;
       
        while (!complete) {
            try {
                for (int i = 0; i < 2; i++) {
                    try {
                        if(i == 0)
                            System.out.print("Enter Width: ");
                        else
                            System.out.print("Enter Height: ");
                        
                        rect_list.add(scan.nextInt());
                    } catch (Exception e) {
                        System.out.println("Please Enter a valid input \n");
                        scan.nextLine();
                        i--;
                    }
                }
                Rectangle rect = new Rectangle(rect_list);
                
                System.out.println("Rectangle Area = "+ rect.getArea());
                System.out.println("Rectangle Perimeter = " + rect.getPerimeter());
               
                complete = true;

            } catch (Exception ex) {
                rect_list.clear();
            }
        }
    }
    
    
    public static void ellipseNum()
    {
        ArrayList ellipse_list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        Boolean complete = false;
       
        while (!complete) {
            try {
                for (int i = 0; i < 2; i++) {
                    try {
                        if(i == 0)
                            System.out.print("Enter Axis A: ");
                        else
                            System.out.print("Enter Axis B: ");
                        
                        ellipse_list.add(scan.nextInt());
                    } catch (Exception e) {
                        System.out.println("Please Enter a valid input \n");
                        scan.nextLine();
                        i--;
                    }
                }
                Ellipse ellip = new Ellipse(ellipse_list);
                
                System.out.println("Rectangle Area = "+ ellip.getArea());
                System.out.println("Rectangle Perimeter = " + ellip.getPerimeter());
               
                complete = true;

            } catch (Exception ex) {
                ellipse_list.clear();
            }
        }
    }

}
