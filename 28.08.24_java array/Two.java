//Check the prime and not prime nos. in array and make two new arrays from it containing prime & not prime.



public class Two 
{
    public static void main(String[] args)
    {
        int[] nums = {21,19,37,12,81,83};
        int[] pnums = new int[7];
        int[] npnums = new int[3];
        int pcount = 0;
        int npcount = 0;

        for(int i=0;i < nums.length;i++)
        {
            int flag = 1;
            for(int j=2; j <= nums[i] /2; j++)
            {
                if(nums[i] % j == 0)
                {
                    flag = 0;
                    npnums[npcount] = nums[i];
                    npcount++;
                    break;
                }

            }
            if(flag == 1)
            {
                pnums[pcount] = nums[i];
                pcount ++;
            }
        }

        System.out.println("Prime Arr: ");
        for(int i = 0;i < pnums.length;i++)
        {
            System.out.println(pnums[i]);
        }
        System.out.println("");
        System.out.println("Non prime Arr: ");
        for(int i = 0;i < npnums.length;i++)
        {
            System.out.println(npnums[i]);
        }

        
    }    
}




/*Correct the logic:
int i=0,j,flag=0;

        int[] nums = {21,19,37,12,81,83};
        int[] prime = new int[10];
        int[] non_prime = new int[10];

        while(i<= nums.length-1)
        {
            int n = nums[i]; 
            for(j=2;j <= (n/2);j++)
            {
                if(nums[i] % j ==0)
                {
                    flag = 1;
                }
            }
            if(flag==1)
            {
                prime[i] = nums[i];
                i++; 
            }else
            {
                non_prime[i] = nums[i];
                i++;
            }
        }

        System.out.println("Prime: "+ prime);
        System.out.println("Non Prime: "+non_prime);
 */