/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaponjob;

import java.io.*;
import java.util.*;

/**
 *
 * @author student
 * input format
 *  n x
 * a1 a2 ... an+1
 * m
 * b1 b2 ... bm+1
3 3
3 2 1 0
2
2 1 3
 * output
 A)
102
 B)
9 4 1
 C)
126
 */
public class Bai29 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 0; i <= n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("A)");
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = (sum + arr[i]) * x;
        }
        sum += arr[n];
        System.out.println(sum);
        System.out.println("B)");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] * (n - i) + " ");
        System.out.println();
        System.out.println("C)");
        int m = scan.nextInt();
        int[] arrB = new int[m + 1];
        for(int i = 0; i <= m; i++){
            arrB[i] = scan.nextInt();
        }
        int sumB = 0;
        for(int i = 0; i < m; i++){
            sumB = (sumB + arrB[i]) * x;
        }
        sumB += arrB[m];
        System.out.println(sum + sumB);
    }
    
}
