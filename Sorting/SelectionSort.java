import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int array[])
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[min] > array[j])
                    min = j;
            }
            if(min != i)
            {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void main(String arg[])
    {
        int array[] = {10,2,3,1,4,6,7,8,9,1,2,55,12,13,42,54};
        SelectionSort ob = new SelectionSort();
        ob.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
