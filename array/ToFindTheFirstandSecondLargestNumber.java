package array;

import java.util.Scanner;

public class ToFindTheFirstandSecondLargestNumber {

   public static int[] inputArray() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number of element: ");
    int n = input.nextInt();

    if (n <= 0) {
      System.out.println("Enter a valid number of elements");
      System.exit(n);
    }

    int[] arr = new int[n];
    int i = 0;
    while (i < n) {
      System.out.println("Please enter the element no." + (i + 1) + ":");
      arr[i] = input.nextInt();
      i++;
    }
    return arr;
  }

  public static void displayAnArray(int[] arr)
  {
    System.out.print("{");
    for(int i=0; i<arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.print("}");
  }

  
  public static void toFindTwoMaxValue(int[] arr)
  {
    int max1;
    int max2;
    if(arr[0]>arr[1])
    {
      max1 = arr[0];
      max2 = arr[1];
    }
    else
    {
      max2 = arr[0];
      max1 = arr[1];
    }

    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]>max1)
      {
        max2 = max1;
        max1 = arr[i];
      }
      else if(arr[i]>max2)
      {
        max2 = arr[i];
      }
    }

    System.out.println();
    System.out.println("The First maximum numeber is: " + max1);
    System.out.println("The Second maximum numeber is: " + max2);
  }

  public static void main(String args[])
  {

    int arr[] = inputArray();

    displayAnArray(arr);

    toFindTwoMaxValue(arr);

  }
}
