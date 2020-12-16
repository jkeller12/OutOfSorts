public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */


  public static void bubbleSort(int[] data)
  { boolean InOrder = false;
    while(InOrder == false)
    {
      int count = 0;
      for (int i = 0; i < data.length; i++)
      {
        if (data[i] > data[i+1])
        {
          int Foward_Value = data[i];
          data[i]= data[i+1];
          data[i+1] = Foward_Value;
        }
        if(data[i] < data[i+1])
        {
          count ++;
        }
      }

      if (count == data.length)
      {
        InOrder = true;
      }
    }
  }
}
