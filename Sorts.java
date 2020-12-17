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
    boolean InOrder = true;
    int count;

    if(data.length <= 1)
    {
      data = data;
    }
    else
    {
      while(InOrder == true)
      {
        count = 0;
        ///////////////////////////////////////
        for (int i = 0; i < data.length-1; i++)
        {
          if(data[i] < data[i+1])
          {
            count ++;
          }

          if (data[i] > data[i+1])
          {
            int Foward_Value = data[i];
            data[i]= data[i+1];
            data[i+1] = Foward_Value;
          }

        }
        ////////////////////////////////////////
        if (count == data.length-1)
        {
          InOrder = false;
        }
      //  System.out.println(Arrays.toString(data));
      }
    }

  }
}
