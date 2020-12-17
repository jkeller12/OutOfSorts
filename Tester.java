import java.util.Random;
import java.util.Arrays;
import java.io.*;
import java.util.*;
public class Tester{
   public static void main(String[] args)
   {
      Random rd = new Random(); // creating Random object
      int[] arr = new int[10];

      for (int i = 0; i < arr.length; i++)
      {
         arr[i] = rd.nextInt(); // storing random integers in an array
      }
      int[] ComputerSorted = arr;
      System.out.println("Before Bubble Sort");
      System.out.println(Arrays.toString(arr));
      System.out.println();
      System.out.println("Bubble Sort");
      Sorts.bubbleSort(arr);
    //  System.out.println(Arrays.toString(arr))
      ;
      System.out.println();
      System.out.println();
      System.out.println("Computer Sorted Array");
      Arrays.sort(ComputerSorted);
      System.out.println(Arrays.toString(ComputerSorted));

      System.out.println("Did your buble sort work?");
      boolean Return_Value = true;
      for (int i = 0; i < arr.length; i++)
      {
        Return_Value = Return_Value && (arr[i] == ComputerSorted[i]);
      //  System.out.println("it actually ran");
      }
      if(Return_Value)
      {
        System.out.println("Yes!!!!");
      }
      else{
        System.out.println("No");
      }

   }
}
