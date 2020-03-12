import java.util.Arrays;

public class QuickSort {

    public void quickSort(int array[], int start, int end)
    {
        if(start < end)
        {
            int index = partition(array, start, end);
            quickSort(array,start,index - 1);
            quickSort(array,index + 1, end);
        }
    }

    public int partition(int array[], int start, int end)
    {
        int pivot = array[end]; //Chosen Last element as Pivot
        int index = start - 1;
        for(int j = start; j < end; j++)
        {
            if(array[j] < pivot)
            {
                index++;
                int temp = array[index];
                array[index] = array[j];
                array[j] = temp;
            }
        }
        index++;
        array[end] = array[index];
        array[index] = pivot;
        return index;
    }

    public static void main(String arg[])
    {
        int array[] = {3,1,5,6,17,8,22,31,13,10,4,5};
        QuickSort ob = new QuickSort();
        ob.quickSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
