package Lab1;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER VALUE");
        int n = sc.nextInt();

        System.out.println("PRIMES NUMBER ARE: ");
        for(int i=0;i<=n;i++)
        {
            int f=0;
            for(int j=2;j<=i/2;j++)
                if((i%j)==0)
                {
                    f=1;
                    break;
                }
            if(f==0)
                System.out.print(i+"   ");
        }
        }
    }

    /*
ENTER VALUE
10
PRIMES NUMBER ARE: 
0   1   2   3   5   7
*/