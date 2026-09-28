package com.mycompany.question1;


public class Question1 {

    public static void main(String[] args) {
        

        // Single-dimensional array containing the city names
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Two-dimensional array containing gaming console sales:
        // Column 0 = PS5 Sales
        // Column 1 = XBOX Sales
        // Column 2 = SWITCH Sales
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200},
        };

       
        System.out.println("========================================");
        System.out.println("       GAMING CONSOLE REPORT");
        System.out.println("========================================");


        // Display gaming cosnole sales report
        System.out.println("----------------------------------------");
        System.out.printf("%-18s %-10s %-10s %-10s%n",
                "", "PS5", "XBOX", "SWITCH");
        System.out.println("----------------------------------------");

        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-18s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        // Calculate totals and determine the city with the most sales
        int[] totals = new int[cities.length];
        int highestIndex = 0;

        for (int i = 0; i < cities.length; i++) {

            totals[i] = sales[i][0] + sales[i][1] + sales[i][2];

            if (totals[i] > totals[highestIndex]) {
                highestIndex = i;
            }
        }

        // Display totals
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + ": " + totals[i]);
        }

        // Display city with highest total
        
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex].toUpperCase());
       

        
    }
}
