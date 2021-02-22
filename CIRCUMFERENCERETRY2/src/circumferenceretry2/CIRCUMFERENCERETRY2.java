/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circumferenceretry2;

import java.util.Scanner; 
public class CIRCUMFERENCERETRY2 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in); 
    
    System.out.println( 
     "I can compute the circumference of one of the followings: Rect, Square, or Triangle " 
     ); 
    
      System.out.println( 
     "Enter a shape: " 
     ); 
 
    String shape; 
        shape = input.nextLine().trim();
         
     int circum = 0; 
     
     int side1, side2, side3; 
 
        switch (shape) {
            case "Triangle":
                System.out.println("Enter side 1: ");
                side1 = input.nextInt();
                System.out.println("Enter side 2: ");
                side2 = input.nextInt();
                System.out.println("Enter side 3: ");
                side3 = input.nextInt();
                circum = side1 + side2 + side3;
                System.out.println("The circumference is: ");
                System.out.println(circum);
                break;
            case "Square":
                System.out.print("Enter side: ");
                side1 = input.nextInt();
                circum = side1 * 4;
                System.out.println("The circumference is: ");
                System.out.println(circum);
                break;
            case "Rect":
                System.out.println("Enter side 1: ");
                side1 = input.nextInt();
                System.out.println("Enter side 2: ");
                side2 = input.nextInt();
                circum = 2 * (side1 + side2);
                System.out.println("The circumference is: ");
                System.out.println(circum);
                break;
            default:
                break;
    }
       }
}
