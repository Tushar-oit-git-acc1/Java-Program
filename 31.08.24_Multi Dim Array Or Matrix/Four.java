//Transpose of matrix i.e. Converting row to column & column to row

public class Four 
{
    public static void main(String[] args) 
    {
        int[][] arr = {{1,2,4},{2,3,7},{7,4,1}};


        System.out.println("Transpose of a matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[j][i]+"  ");
            }
            System.out.println();
        }
    }    
}
