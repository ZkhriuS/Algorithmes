package sorting;

public class InsertSort extends Sort{
    @Override
    public void sort(int[] array) {
        for(int begin = 0; begin < array.length - 1; begin++){
            for(int i=begin+1; i< array.length; i++){
                if(array[i]<array[begin]){
                    int temp = array[begin];
                    array[begin] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
