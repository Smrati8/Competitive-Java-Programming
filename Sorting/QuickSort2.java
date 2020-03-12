import java.util.Arrays;

public class QuickSort2 {
    public void quickSort(int array[], int start, int end)
    {
        if(start < end)
        {
            int index = partition(array, start, end);
            quickSort(array, start, index - 1);
            quickSort(array, index + 1, end);
        }
    }

    public int partition(int array[], int start, int end)
    {
        int pivot = array[start]; // Chosen First element as pivot
        int left = start;
        int right = end;

        while(left < right)
        {
            while((start <= left && left <= end) && array[left] <= pivot)
                left++;
            while((start <= right && right <= end) && array[right] > pivot)
                right--;
            if(left <  right)
            {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        array[start] = array[right];
        array[right] = pivot;
        return right;
    }

    public static void main(String arg[])
    {
        int array[] = {3,1,5,6,17,8,22,31,13,10,4,5};
//        int array[] = {3,1,2,4,5};
        QuickSort2 ob = new QuickSort2();
        ob.quickSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
