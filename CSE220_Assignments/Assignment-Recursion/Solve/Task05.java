//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Recursion
package Assignment_Recursion; // Remove This Line or Make a package

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m");
        int m = sc.nextInt();
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println(m+"^"+n+" is: " + calc(m, n));
    }

    static int calc(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return m;
        }
        n--;
        return m * calc(m, n);
    }
}