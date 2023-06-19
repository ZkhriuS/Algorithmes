package sorting;

public class QuickSort extends Sort{
    @Override
    public void sort(int[] array) {
        quickSort(0, array.length-1, array);
    }

    public void quickSort(int left, int right, int[] array){
        int pivot = (left+right)/2;
        int i=left;
        int j=right;
        while(array[pivot]>array[i]) i++;
        while(array[pivot]<array[j]) j--;
        if(i>=j)
            return;
        else{
            int temp = array[i];
            array[i] = array[j];
            array[j]=temp;
            quickSort(left, j-1, array);
            quickSort(i+1, right, array);
        }
    }
}
