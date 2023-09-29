import javax.swing.*;
import java.util.Scanner;
public class assignment1dsa {
    public static void main(String[] args) {
        //Q1
        System.out.println("******");
        System.out.println("    *");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("******");

        //Q2
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("Good");
        } else if (marks > 70) {
            System.out.println("Fair");
        } else if (marks > 60) {
            System.out.println("Meets Expectation");
        } 
      
        //Q3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = sc.nextInt();
        if (isPrime(no)) {
            System.out.println(no + " is a prime number");
        } else {
            System.out.println(no + " is a non-prime number");
        }
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

    //Q4
    {
        Scanner scn = new Scanner(System.in);
        int small = scn.nextInt();
        int big = scn.nextInt();
        for (int n = small; n <= big; n++)
            System.out.println(n);
    }

    //Q5
    {
        int count = 0, num = 7844490223445;
        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }

    //Q6
    {
        int no = 63, reversed = 0;
        System.out.println("Original Number: " + no);
        while (no != 0) {
            int digit = no % 10;
            reversed = reversed * 10 + digit;
            no /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

    //Q7
    {
        Scanner scn = new Scanner(System.in);
        {
            int n = scn.nextInt();
            int i = 0;
            int p = 1;
            while (n > 0) {
                int dig = n % 10;
                n = n / 10;
                i += p * Math.pow(10, dig - 1);
                p++;
                System.out.println(i);
            }
        }
      
        //Q9
        {

            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            int tnum1 = num1;
            int tnum2 = num2;
            while (tnum1 % tnum2 != 0) {
                int rem = tnum1 % tnum2;
                tnum1 = tnum2;
                tnum2 = rem;
            }
            int gcd = tnum2;
            int lcm = (num1 * num2) / gcd;
            System.out.println(gcd);
            System.out.println(lcm);
        }
      
        //Q10
        int n = scn.nextInt();
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if(n != 1)
            System.out.print(n);
    }
}
