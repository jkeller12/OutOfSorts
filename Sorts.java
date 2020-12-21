import java.util.Arrays;
import java.io.*;
import java.util.*;
public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */


  public static void bubbleSort(int[] data)
  {
    int length = data.length-1;

    for(int i = 0 ; i < length; i++)
    {
      for(int j = 0; j < length - i; j++)
      {
        if (data[j] > data[j+1])
        {
          int Foward_Value = data[j];
          data[j] = data[j+1];
          data[j+1] = Foward_Value;
        }
      }
    //  System.out.println(Arrays.toString(data));
    }
  }

  public static void selectionSort(int[] data)
  {
    for (int i = 0; i < data.length-1; i++)
    {
      int Smallest = data[i];
      int Smallest_Index = i;
      for(int j = i; j < data.length; j++)
      {
        if(data[j] < Smallest)
        {
          Smallest = data[j];
          Smallest_Index = j;
        }
      }

      data[Smallest_Index] = data[i];
      data[i] = Smallest;
    }
  }

  public static void insertionSort(int[] data)
  {
    // First I need to find the index it belongs.

    for(int i = 0; i < data.length; i++)
    {
      int CorrectIndex = i; // initalized at 0
      int Insert_value = data[i]; // The insert value
      boolean Value = false; // Recalls if an insert should happen

      for (int j = 0; j < i; j++)
      {
        if(data[j] > Insert_value) // Finds value greater than that at data[i] so it's earliest swap (stays in order)
        {
          CorrectIndex = j; // Sets insert index
          Value = true; // Allows second for loop

          j = i+1; // Breaks loop


        }
      }

      for(int k = i; k > CorrectIndex && Value; k--)
      {
        data[k] = data[k-1];


      }
      data[CorrectIndex] = Insert_value;


    //  System.out.println(Arrays.toString(data));

    }
  }
}
