package sorting;

public class DirectSort extends Sort{
    @Override
    public void sort(int[] array) {
        for(int begin = 0; begin<array.length-1; begin++){
            int min = begin;
            for (int i = begin+1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            int temp = array[min];
            array[min] = array[begin];
            array[begin] = temp;
        }
    }
}
