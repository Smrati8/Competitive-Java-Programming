import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int array[])
    {
        for(int i = 1; i < array.length; i++)
        {
            int Key = array[i];
            int j = i - 1;
            while( j >= 0 && array[j] > Key)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = Key;
        }
    }
    public static void main(String arg[])
    {
        int array[] = {3,2,11,13,42,25,65,28,9,6,0};
        InsertionSort ob = new InsertionSort();
        ob.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
