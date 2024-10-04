//Array Sorting: With optimized bubble Sort


public class One
{
    public static void main(String[] args) 
    {
        //int[] arr = {12,41,5,87,9,3,63,52};
        int[] arr = {12,41,5,87,9,3,63,52};

        for(int i=0;i <= arr.length - 1;i++)
        {
            for(int j =0;j <= arr.length -2 - i;j++)
            {
                if(arr[j] > arr[j+1])  /*Swap only if the next consecutive no. is greater. For sorting in ascending order, inverse the sign for descennding order*/
                {
                    int temp  = arr[j];
                    arr[j]    = arr[j+1];
                    arr[j+1]  = temp;
                }
            }
        }

        System.out.println("Array");

        for(int elem:arr)  /*Enhanced for loop */
        {
            System.out.print(elem +" ");
        }
    }
}