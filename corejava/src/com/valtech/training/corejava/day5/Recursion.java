package com.valtech.training.corejava.day5;
public class Recursion {
    static public int factorial(int a) {                
        if (a == 0)
              return 1;               
              return a*factorial(a-1);
    }
    public static void main(String[] args)
     {
      int num = 5;
      System.out.println("Factorial of "+ num + " is " + factorial(5));
     }
    
}
