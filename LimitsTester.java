import java.util.Arrays;
import java.util.Random;
public class LimitsTester {
    public static long time(Runnable r) {
        long startTime = System.nanoTime();
        r.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
    public static void main(String[] args) {
        // int[] oneToSix = new int[]{5, 3, 4, 2, 1, 6};
        // Sorts.bubbleSort(oneToSix);
        // System.out.println(Arrays.toString(oneToSix));

        Random rng = new Random();
        int[] nsquared = new int[10000];
        int[] correctsquared = new int[10000];
        for(int i = 0; i < 10000; ++i) {
            correctsquared[i] = nsquared[i] = rng.nextInt();
        }
        Arrays.sort(correctsquared);
        System.out.println("Bubble sort of 10^5 random unsorted: " + time(()->{Sorts.bubbleSort(nsquared);}) + "ms");
        System.out.println(Arrays.equals(nsquared, correctsquared));

        int[] linear = new int[(int)1e8];
        for(int i = 0; i < (int)1e8; ++i) {
            linear[i] = 10 * i;
        }
        System.out.println("Bubble sort of 10^8 random sorted: " + time(()->{Sorts.bubbleSort(linear);}) + "ms");
        boolean sorted = true;
        for(int i = 0; i < linear.length - 1; ++i) {
            if(linear[i] > linear[i + 1]) sorted = false;
        }
        System.out.println(sorted);

        // oneToSix = new int[]{5, 3, 4, 2, 1, 6};
        // Sorts.selectionSort(oneToSix);
        // System.out.println(Arrays.toString(oneToSix));
/*
        for(int i = 0; i < 10000; ++i) {
            correctsquared[i] = nsquared[i] = rng.nextInt();
        }
        Arrays.sort(correctsquared);
        System.out.println("Selection sort of 10^5 random unsorted: " + time(()->{Sorts.selectionSort(nsquared);}) + "ms");
        System.out.println(Arrays.equals(nsquared, correctsquared));

        for(int i = 0; i < 10000; ++i) {
            correctsquared[i] = nsquared[i] = rng.nextInt();
        }
        Arrays.sort(correctsquared);
        System.out.println("Insertion sort of 10^5 random unsorted: " + time(()->{Sorts.insertionSort(nsquared);}) + "ms");
        System.out.println(Arrays.equals(nsquared, correctsquared));

        System.out.println("Insertion sort of 10^8 random sorted: " + time(()->{Sorts.insertionSort(linear);}) + "ms");
        sorted = true;
        for(int i = 0; i < linear.length - 1; ++i) {
            if(linear[i] > linear[i + 1]) sorted = false;
        }
        System.out.println(sorted);
        */
    }
}
