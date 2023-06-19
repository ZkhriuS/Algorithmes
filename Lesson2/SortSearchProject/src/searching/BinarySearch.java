package searching;

public class BinarySearch extends Search{
    @Override
    public int search(int value, int[] array) {
        return binaryRecursive(0, array.length, value, array);
    }

    public int binaryRecursive(int left, int right, int value, int[] array){
        if(left>right)
            return -1;
        int mid = (left+right)/2;
        if(array[mid]>value)
            return binaryRecursive(left, mid-1, value, array);
        else if (array[mid]<value)
            return binaryRecursive(mid+1, right, value, array);
        else
            return array[mid];
    }
}
