//Array: Perfect no. program

public class Two 
{
    public static void main(String[] args)
    {
        int[] arr = {496,15,44,49,6,77,28,25,3,10,60}; 
        int[] p_arr = new int[arr.length];
        int pcount = 0;
        int sum = 0;

        for(int i=0;i<= arr.length - 1;i++)
        {
            for(int j=1;j <= (arr[i] / 2);j++)
            {
                if(arr[i] % j == 0)
                {
                    sum +=j;
                    

                }
            }
            if(sum == arr[i])
            {
                p_arr[pcount++] = arr[i];
            }
            sum = 0;
        }

        for(int elem:p_arr)
        {
            System.out.print(elem+" ");
        }
    }    
}
