import java.util.Random;
import java.util.Arrays;
import java.io.*;
import java.util.*;
public class Tester{
   public static void main(String[] args)
   {
      Random rd = new Random(); // creating Random object
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++)
      {
         arr[i] = rd.nextInt(); // storing random integers in an array
      }
      int[] ComputerSorted = arr;

      Sorts.bubbleSort(arr);

      Arrays.sort(ComputerSorted);
      System.out.println("Did your buble sort work?");



      if(arr == ComputerSorted)
      {
        System.out.println("Yes!!!!");
      }
      else{
        System.out.println("No");
      }

   }
}
