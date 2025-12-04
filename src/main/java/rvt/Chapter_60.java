package rvt;
import java.util.Scanner;

class Exercize1
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 

    int sum = 0;

    for (int i = 0; i <val.length; i++){
        sum += val[i];
    }
 
    System.out.println( "Sum of all numbers = " + sum );
 
   }
}

class Exercise2
{
  public static void main ( String[] args )
  {
    int[] val = {13, -4, 82, 17}; 
    int[] twice = new int[val.length];
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    for (int i = 0; i < val.length; i++){
      twice[i] = val[i] + 2;
    }
 
    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
   }
}