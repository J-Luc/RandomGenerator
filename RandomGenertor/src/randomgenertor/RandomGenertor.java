/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomgenertor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jean-Luc
 */
public class RandomGenertor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO: Create a Scanner object to read keyboard input.
         Scanner scan= new Scanner(System.in);
         
         //TODO: Ask the user a lower and upper bound.
         System.out.print("Enter a lower bound:");
         int lowerBound = scan.nextInt();
         
         System.out.print("Enter an upper bound:");
          int upperBound = scan.nextInt();
          
        //TODO: Ask the user for the number of random integers to generate.
        System.out.print("The number of random integer that should be generated:");
        int numInt = scan.nextInt();
        
        //TODO: Generate random integers of the desired length and bound.
        Random random = new Random();
        //IntStream intStream = random.ints();
        
        IntStream intStream = random.ints(numInt, lowerBound, upperBound);

        //int num = random.nextInt(lowerBound) + upperBound + 1;
        //int num = random.nextInt((lowerBound - upperBound) + 1) +;
        //int randomNum = rand.nextInt((lowerBound - upperBound) + 1) + min;
        System.out.println(intStream);
        //TODO: Print the average, max, min, count, and sum of the integers.
    }
    
}
