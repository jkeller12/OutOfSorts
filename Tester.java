import java.util.Random;
import java.util.Arrays;
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
      System.out.println("Computer");
      System.out.println(ComputerSorted);
      System.out.println("");
      System.out.println("");
      System.out.println("My method:");

      System.out.println(arr);
   }
}
