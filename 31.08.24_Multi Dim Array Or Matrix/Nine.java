//Copying matrix elements to new matrix

public class Nine {
    public static void main(String[] args) {
        int  A[][] =  {{1,2,4},{0,3,7},{0,0,1}};
        int count = 0;
        int[][] B = new int[A.length][A[count++].length];
        
        // //Method 1: using function
        // int[][] B = A.clone();

        //Method 2: manual Array/ Matrix copy
        for(int i=0;i< A.length;i++)
        {
            for(int j=0;j< A[i].length;j++)
            {
                B[i][j] = A[i][j];
            }
            System.out.println();
        }
        
        
        
        for(int i=0;i< B.length;i++)
        {
            for(int j=0;j< B[i].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
