import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int array[])
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if(array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String arg[])
    {
        int array[] = {3,1,4,6,7,0,13,15,65,34,26,78,89,93,44};
//        int array[] = {10,2,3,1,4,6,7,8,9,1,2,55,12,13,42,54};
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
