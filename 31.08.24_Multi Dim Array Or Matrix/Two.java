//Replacing the array element

public class Two 
{
    public static void main(String[] args) 
    {
       
        
        int  arr[][] = {{1,5,7},{4,3,9}};  //the no. of elements in each sub array should be same.

        arr[1][2] = 2; //Replacing 8 with 2
        
        int c =0;
        int k = 0;
        System.out.println(arr.length);
       

        for(int i=0;i< 3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }   
            System.out.println();     
        }

        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }   
            System.out.println();     
        }
    }    
}
