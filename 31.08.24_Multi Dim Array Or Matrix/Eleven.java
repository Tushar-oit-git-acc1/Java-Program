//Multiplication of two matrices

public class Eleven 
{
    public static void main(String[] args) 
    {
        int[][] A = {{1,2,4},{2,3,7},{7,4,1}};
        
        int[][] B = {{2,3,7},{7,4,1},{1,2,4}};

        int[][] C = new int[A.length][A.length];

        
        int multi = 1;
        
        for(int i=0;i< A.length;i++)
        {   
            
            for(int j=0;j< A[i].length;j++)
            {
                for(int k =0;k < B[i].length;k++)
                {
                    multi += A[i][j] * B[i][k];
                }
                
                C[i][j] = multi;
                
            }
           
        }


        System.out.println("Matrix A: ");

        for(int[] elem:A)
        {
            for(int j=0;j < elem.length;j++)
            {
                System.out.print(elem[j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix B: ");

        for(int[] elem:B)
        {
            for(int j=0;j < elem.length;j++)
            {
                System.out.print(elem[j]+" ");
            }
            System.out.println();
        }

        System.out.println("Multiplication of matrices: ");

        for(int[] elem:C)
        {
            for(int j=0;j < elem.length;j++)
            {
                System.out.print(elem[j]+" ");
            }
            System.out.println();
        }
    }    
}
