/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exb115;

import java.util.Scanner;

/**
 *
 * @author xxaci
 */
public class ExB115 {
 public static void cottrellWasHere(){
        System.out.println("Cottrell was here");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int adultQuantity;
        int childQuantity;
cottrellWasHere();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many adult meals? ");
        adultQuantity = keyboard.nextInt();
        
        System.out.print("How many child meals? ");
        childQuantity = keyboard.nextInt();
        
        int total = calcAllTotal(adultQuantity, childQuantity);
        int adultTotal = calcAdultTotal(adultQuantity);
        int childTotal = calcChildTotal(childQuantity);
        double adultProfit = calcAdultProfit(adultQuantity, adultTotal);
        double childProfit = calcChildProfit(childQuantity, childTotal);
        double totalProfit = adultProfit + childProfit;
        
        
        
        System.out.println("Total price of adult meals: $" + adultTotal); 
        System.out.println("Total price of child meals: $" + childTotal);
        System.out.println("Total price for all meals: $" + total);
        System.out.printf("Total profit for adult meals: $%.2f", adultProfit);
        System.out.println("");
        System.out.printf("Total profit for child meals: $%.2f", childProfit);
        System.out.println("");
        System.out.printf("Total profit: $%.2f", totalProfit);
          
    }


    private static int calcAdultTotal(int adultQuantity) {
        int totalA = 0;
        totalA = adultQuantity * 7;
        return totalA;
    }
    
    private static int calcChildTotal(int childQuantity){
        int totalC;
        totalC = childQuantity * 4;
        return totalC;
        
    }

    private static int calcAllTotal(int adultQuantity, int childQuantity) {
        int total;
        total = (adultQuantity * 7) + (childQuantity * 4);
        return total;
    }
    
    private static double calcAdultProfit(int adultQuantity, int adultTotal){
        double adultProfit;
        adultProfit = adultTotal - (adultQuantity * 4.35);
        return adultProfit;
    }
    
    private static double calcChildProfit(int childQuantity, int childTotal){
        double childProfit;
        childProfit = childTotal - (childQuantity * 3.10);
        return childProfit;
    }
    

    
    
    
}
