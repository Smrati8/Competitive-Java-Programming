import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int array[], int start,int end)
    {
        if(start <  end)
        {
            int mid = start + (end - start)/2;
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            merge(array,start,end,mid);
        }
    }

    public void merge(int array[], int start, int end, int mid)
    {
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int array1[] = new int[size1];
        int array2[] = new int[size2];

        for(int i = 0; i < size1; i++)
        {
            array1[i] = array[start + i];
        }

        for(int i = 0; i < size2; i++)
        {
            array2[i] = array[mid + 1 + i];
        }
        int i = 0, j = 0, k = start;

        while(i < size1 && j < size2)
        {
            if(array1[i] < array2[j])
                array[k] = array1[i++];
            else
                array[k] = array2[j++];
            k++;
        }

        while(i < size1)
        {
            array[k++] = array1[i++];
        }

        while(j < size2)
        {
            array[k++] = array2[j++];
        }
    }
    public static void main(String arg[])
    {
        int array[] = {10,2,3,1,4,6,7,8,9,1,2,55,12,13,42,54};
        MergeSort ob = new MergeSort();
        ob.mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
