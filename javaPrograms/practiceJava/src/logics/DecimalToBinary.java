package logics;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a[] = new int[10];
        int rem;
        int i = 0;

        while (n != 0) {
            rem = n % 2;
            n = n / 2;
            a[i] = rem;
            i++;
        }

        System.out.print("Binary representation: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }
    }
}
