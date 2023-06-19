package searching;

public class SimpleSearch extends Search{
    @Override
    public int search(int value, int[] array) {
        for(int i=0; i<array.length; i++){
            if(array[i]==value)
                return i;
        }
        return -1;
    }
}
