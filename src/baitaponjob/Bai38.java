/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaponjob;

import java.io.*;
import java.util.*;
import java.lang.Iterable;
import java.io.IOException;

/**
 *
 * @author isc
 * P^n(x) = An.x^n + A(n-1).x^n-1 + ... + A0
 * Q^m(x) = Bm.x^m + B(m-1).x^m-1 + ... + B0
 * Dao ham cap d
 * input
 * n m x0 d
 * An An-1 ... A0
 * Bm Bm-1 ... B0
 * d
 * output
 * A)
 * B)
 * C) dao ham cua P(x)
 * D)
 * E)
 * F)
 * 
 * sample input
3 2 2 1
3 2 3 2
1 2 5
output
B)
40 13
C) 
9 4 3
D)
53
E)
27
F)
3 1
 */
public class Bai38 {
    private static int[] arrA = new int[100];
    private static int[] arrB = new int[100];
    private static int n,m,x,d;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<=n;i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<=m;i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }
        /****************************************************/
        System.out.println("B)");
        int sumA = 0;
        for(int i = 0; i < n; i++){
            sumA = (sumA + arrA[i]) * x;
        }
        sumA += arrA[n];
        int sumB = 0;
        for(int i = 0; i < m; i++){
            sumB = (sumB + arrB[i]) * x;
        }
        sumB += arrB[m];
        System.out.println(sumA + " " + sumB);
        /****************************************************/
        System.out.println("C)");
        int[] daoHamA = arrA;
        for(int i = 0; i < d; i++){
            for(int j = 0; j < (n - i); j++){
                daoHamA[j] = (daoHamA[j] * (n - j - i));
            }
        }
        for(int i = 0; i < (n - d + 1); i++){
            System.out.print(daoHamA[i] + " ");
        }
        System.out.println();
        /****************************************************/
        System.out.println("D)");
        System.out.println(sumA + sumB);
        /****************************************************/
        System.out.println("E)");
        System.out.println(sumA - sumB);
        /****************************************************/
        System.out.println("F)");
        System.out.println(sumA / sumB + " " + sumA % sumB);
    }
}
