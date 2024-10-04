//Array elements frequency counter

public class Freq 
{
    public static void main(String[] args)
    {
        int[] arr = {2,4,5,2,9,5};
        int[] freq = new int[arr.length];
        int counted = -1;

        for(int i=0;i< arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    freq[j] = counted;

                }
            }
            if(freq[i] != counted)
            {
                freq[i] = count;
            }
            
        }
        
        
        int[] uni = new int[arr.length];
        System.out.println("Array:");
        for(int i=0;i< arr.length;i++)
        {
            if(freq[i] != counted)
            {
                uni[i] = arr[i]; 

                System.out.println("Element "+arr[i]+" Frequency: "+freq[i]);
            }
        }

        System.out.println("Unique Elements Array:");
        for(int i=0;i< arr.length;i++)
        {    
            if(uni[i] != 0)
            {
                System.out.print(uni[i]+" "); 
            } 
              
        }
        

    }    
}
