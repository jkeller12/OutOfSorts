import java.util.*;
public class StevenSortTester{
    public static void main(String[] args) {
        // AMOUNT OF TESTS TO RUN. CHANGE IF YOU THINK YOUR COMPUTER CAN HANDLE IT
        //
        int testAmt = 100;
        String finalMessage = "found failed cases";
        for(int i = 0; i < testAmt; i++){
            Random seed = new Random(); // set the seed for element so we can trace it back if neceessary
            Random arrSize = new Random();
            int seedVal = seed.nextInt() % 1000;
            Random element = new Random(seedVal);

            int[] arr = new int[arrSize.nextInt(10)]; //set the size bound for the testing array
            for(int j = 0; j < arr.length; j++){
              arr[j] = element.nextInt() % 1000; // set the element bound for the testing array
            }
            int[] clone = arr.clone(); // clone the current arr
            int[] IS_clone = arr.clone(); // clones for insertion sort
            int[] SS_clone = arr.clone(); // clones for selection sort

            Sorts.bubbleSort(arr);
            Sorts.insertionSort(IS_clone);
            Sorts.selectionSort(SS_clone);
            Arrays.sort(clone);
            //System.out.println(Arrays.toString(arr));
            //System.out.println(Arrays.toString(clone));
            if (!Arrays.equals(arr,clone)) {
                System.out.println("Bubble Sort");
                throw new Error ("failure at random test " +  i + " . \n Expected: " + Arrays.toString(clone) + " \n Received: " + Arrays.toString(arr));
            }
            if (!Arrays.equals(IS_clone,clone)) {
                System.out.println("Insertion Sort");
                throw new Error ("failure at random test " +  i + " . \n Expected: " + Arrays.toString(clone) + " \n Received: " + Arrays.toString(arr));
            }
            if (!Arrays.equals(SS_clone,clone)) {
                System.out.println("Selection Sort");
                throw new Error ("failure at random test " +  i + " . \n Expected: " + Arrays.toString(clone) + " \n Received: " + Arrays.toString(arr));
            }
            //REVERSE THE ARRAYS AND CHECK IF SORT STILL WORKS
            reverse(clone);
            reverse(arr);
            reverse(SS_clone);
            reverse(IS_clone);
            Sorts.bubbleSort(arr);
            Sorts.selectionSort(SS_clone);
            Sorts.insertionSort(IS_clone);

            Arrays.sort(clone);
            if (!Arrays.equals(arr,clone)) {
                throw new Error ("failure at reverse test " +  i + " . \n Expected: " + Arrays.toString(clone) + " \n Received: " + Arrays.toString(arr));
            }
            if (!Arrays.equals(IS_clone,clone)) {
                System.out.println("Insertion Sort");
                throw new Error ("failure at random test " +  i + " . \n Expected: " + Arrays.toString(clone) + " \n Received: " + Arrays.toString(arr));
            }
            if (!Arrays.equals(SS_clone,clone)) {
                System.out.println("Selection Sort");
                throw new Error ("failure at random test " +  i + " . \n Expected: " + Arrays.toString(clone) + " \n Received: " + Arrays.toString(arr));
            }

            finalMessage = "------Test passed------";
        }
        System.out.println(finalMessage);
        //
    }
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        }
    }
}
