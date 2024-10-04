//Accept a character and range . And print the next characters in that range.

import java.util.Scanner;

public class One{
    public static void main(String[] args) {
        
        char ch;
        int range,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        ch = sc.next().charAt(0);

        System.out.println("Enter the range");
        range = sc.nextInt();

        for(i=1;i<=range;i++)
        {
            System.out.print((ch++)+"  ");    //
        }
    }
}