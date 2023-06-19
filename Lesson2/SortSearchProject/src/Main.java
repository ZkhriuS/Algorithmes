import searching.BinarySearch;
import searching.Search;
import searching.SimpleSearch;
import sorting.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = new int[] {5, 2, 9, 4, 1, 0, 8, 7, 3, 6};
        printArray(array);
        //Sort bubbleSort = new BubbleSort();
        //bubbleSort.sort(array);
        //Sort directSort = new DirectSort();
        //directSort.sort(array);
        //Sort insertSort = new InsertSort();
        //insertSort.sort(array);
        //printArray(array);
        //Search simpleSearch = new SimpleSearch();
        //int value = 0;
        //System.out.println("Position of "+value+" is "+simpleSearch.search(value,array));
        //Search binarySearch = new BinarySearch();
        //int value = 7;
        //System.out.println("Position of "+value+" is "+binarySearch.search(value,array));
        //Sort quickSort = new QuickSort();
        //quickSort.sort(array);
//        Sort mergeSort = new MergeSort();
//        mergeSort.sort(array);
        Sort pyramidSort = new PyramidSort();
        pyramidSort.sort(array);
        printArray(array);
    }
}
