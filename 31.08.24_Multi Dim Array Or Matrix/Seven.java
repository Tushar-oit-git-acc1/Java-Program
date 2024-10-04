/*!Checking if the matrix is symmetric i.e. opp. elements should be same
Matrix 1: It's Symmetric
1  2  3
2  5  9
3  9  7
Matrix 2: It's Non-Symmetric/ Asymmetric
 1    2   3
-2    5  -9
-3    9   7
 */


public class Seven 
{
    public static void main(String[] args) 
    {
        int  A[][] =  {{1,2,4},{2,3,7},{7,4,1}};
        int  B[][] =  {{1,2,4},{0,3,7},{0,0,1}};
        int flag1 =0;
        int flag2 =0;
        
        //Checking for matrix A   
        for(int i=0;i< A.length;i++)
        {
            for(int j=0;j< A[i].length;j++)
            {
                if(i > j && A[i][j] == 0)
                {
                    flag1 = 1;
                }
                
            }
        }

        //Checking for matrix B
        for(int i=0;i< A.length;i++)
        {
            for(int j=0;j< B[i].length;j++)
            {
                if(i > j && B[i][j] == 0)
                {
                    flag2 = 1;
                }
                
            }
        }
        
        //For matrix A
        if(flag1 ==0)
        {
            System.out.println("Matrix A is not an upper triangular matrix");
        }else
        {
            System.out.println("Matrix A is an upper triangular matrix");
        }

        //For matrix B
        if(flag2 ==0)
        {
            System.out.println("Matrix B is not an upper triangular matrix");
        }else
        {
            System.out.println("Matrix B is an upper triangular matrix");
        }    
    }    
}
