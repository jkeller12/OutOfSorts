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
    }
  }
}
