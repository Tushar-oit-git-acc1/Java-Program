//Check if an array is a palindrome no.


public class One
{
    public static void main(String[] args) {
        int i=0,flag=0,check=1;

        int[] num = {1,2,3,2,1};
        int j = num.length - 1; 

        while(check <= num.length / 2)
        {
            if(num[i] != num[j])
            {
                flag = 1;
                System.out.println("given no. is not palindrome no.");
            }
            check ++;
            i ++;
            j--;
        }

        if(flag==0)
        {
            
            System.out.println("given no. is a palindrome no.");
        }
        
    }
}