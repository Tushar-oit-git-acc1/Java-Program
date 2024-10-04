//Array: Pronic no. program

public class Three {

    public static void main(String[] args) 
    {
        int[] arr = {12,9,5,16,84,72,23,4,110};
        int[] pro_arr = new int[arr.length];
        int pro_count = 0;

        for(int i=0;i <= arr.length-1;i++)
        {
            for(int j=1;j < arr[i]/2;j++)
            {
                if(arr[i] == (j* (j+1)))
                {
                    pro_arr[pro_count++] = arr[i];
                }
            }
        }

        System.out.println("Pronic no. array: ");
        for(int elem:pro_arr)
        {
            System.out.print(elem+" ");
        }
    }
}
