//Matrix subtraction

public class Three 
{
    public static void main(String[] args) 
    {
        int[][] A = {{1,2,4},{2,3,7},{7,4,1}};
        
        int[][] B = {{2,3,7},{7,4,1},{1,2,4}};  

        int[][] C = new int[3][3];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(C[i][j]+"  ");
            }
            System.out.println();
        }
    }    
}
