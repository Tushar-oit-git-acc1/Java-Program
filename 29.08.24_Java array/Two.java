//Separate even & odd nos from an array & store them



public class Two 
{
    public static void main(String[] args) 
    {
        int[] arr  = {25,26,31,34,18,17};
        int[] earr = new int[arr.length];
        int[] oarr = new int[arr.length]; 
        int flag = 0; 
        int ecount = 0;
        int ocount = 0;  

        for(int i=0;i < arr.length;i++)
        {
            if(arr[i] %2 == 0)
            {
                earr[ecount] = arr[i];
                ecount++;
                
                /*You can write like this:
                earr[ecount++] = arr[i];
                 */
            }else
            {
                oarr[ocount] = arr[i];
                ocount++;

                /*You can write like this:
                oarr[ocount++] = arr[i];
                 */
            }
        }

        System.out.println("Even Array:");
        for(int elem:earr)
        {
            System.out.print(elem+" ");
        }
        System.out.println();

        System.out.println("Odd Array:");
        for(int elem:oarr)
        {
            System.out.print(elem+" ");
        }

        
    }    
}
