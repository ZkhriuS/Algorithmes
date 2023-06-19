package sorting;

public class PyramidSort extends  Sort{
    @Override
    public void sort(int[] array) {
        for(int i=array.length/2 - 1; i>=0; i--)
            recursiveSort(array, i, array.length);
        for(int i= array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0]=array[i];
            array[i] = temp;
            recursiveSort(array, 0, i);
        }
    }

    public void recursiveSort(int[] array, int parentIndex, int level){
            int min = parentIndex;
            int left = 2*parentIndex+1;
            int right = 2*parentIndex+2;
            if(right < level && array[right]>array[min]) {
                min = right;
            }
            if(left < level && array[left]>array[min]){
                min = left;
            }
            if(min!=parentIndex) {
                int temp = array[min];
                array[min] = array[parentIndex];
                array[parentIndex] = temp;
                recursiveSort(array, min, level);
            }
    }
}
