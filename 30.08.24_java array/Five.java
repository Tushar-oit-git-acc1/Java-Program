//Array: Find the frequency of each element of an array
/*
2 : 3
4 : 2
1 : 1
5 : 1
2 : 0
4 : 0
2 : 0
 */

public class Five 
{
    public static void main(String[] args)
    {
        int[] arr = {2,4,1,5,2,4,2};
        int[] freq = new int[arr.length];
        int[] dummy = new int[arr.length];
        //int count = 0;
        
        for(int i =0;i< arr.length;i++)
        {
            for(int k =0;k<arr.length;k++)
            {
                if(arr[i] == dummy[k])
                {
                    break;
                }else
                {
                    int count = 1;
                    for(int j= i+1;j< arr.length;j++)
                    {
                        if(arr[i] == arr[j])
                        {
                            count = count + 1;
                            freq[i] = count;
                            
                        }else
                        {
                            count = count + 1;
                            freq[i] = count;
                        }
                    }
                    dummy[i] = arr[i];
                }

            }
            
            
            
            
            
        }

        System.out.println("Original Array: ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]+" : "+freq[i]);
        }
        System.out.println();


    }    
}
