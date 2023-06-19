package sorting;

public class MergeSort extends Sort{
    @Override
    public void sort(int[] array) {
        recursiveSort(array, 0, array.length-1);
    }

    public void recursiveSort(int[] array, int left, int right){
        if(right == left)
            return;
        int mid = (right + left)/2;
        recursiveSort(array, left, mid);
        recursiveSort(array, mid+1, right);
        int[] buffer = new int[array.length];
        int i = left, k= left, j = mid + 1;
        while(i <= mid && j<=right){
            if(array[i]<array[j]){
                buffer[k++]=array[i++];
            }else {
                buffer[k++] = array[j++];
            }
        }
        while(i<=mid){
            buffer[k++] = array[i++];
        }
        while(j<=right){
            buffer[k++]=array[j++];
        }
        for(int g=left; g<=right; g++){
            array[g] = buffer[g];
        }
    }
}
