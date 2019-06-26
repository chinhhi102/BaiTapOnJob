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
 * input
 * n m r
 * a11 a12 ... a1m
 * a21 a22 ... a2m
 * ...
 * an1 an2 ... anm
 * b11 b12 ... b1m
 * b21 b22 ... b2m
 * ...
 * bn1 bn2 ... bnm
 * n k m
 * a11 a12 ... a1k
 * a21 a22 ... a2k
 * ...
 * an1 an2 ... ank
 * b11 b12 ... b1m
 * b21 b22 ... b2m
 * ...
 * bk1 bk2 ... bkm
 * N
 * a11 a12 ... a1N
 * a21 a22 ... a2N
 * ...
 * aN1 aN2 ... aNN
2 3 2
1 0 1
0 1 0
0 1 1
1 1 0
3 2 3
1 0
0 1
1 0
1 1 0
0 1 1
3
1 2 1
2 1 2
2 1 1
 * output
A)
0 0 0 1 1 
0 1 0 0 1 
1 1 0 1 0
B)
0 0 0 1 1 
0 1 0 0 1 
1 1 0 1 0
C)
0
D)
7 5 6 
8 7 6 
6 6 5 
 */
public class Bai42 {
    public static int N = 0;
    static long[][] matrixPower(long [][] base, long pow){
	long [][] ans = new long [N][N];
	// generate identity matrix
	for (int i = 0; i < N; i++)
            ans[i][i] = 1;
	// binary exponentiation
	while(pow != 0){
		if((pow&1) != 0 )
                    ans = multiplyMatrix(ans, base);
		base = multiplyMatrix(base, base);
		pow /= 2;
	}
	return	ans;
    }
	/**
	 * compute m * m2
	 * O(N^3)
	**/
    static long [][] multiplyMatrix(long [][] m, long [][] m2)	{
	long [][] ans = new long [N][N];
	for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)	{
		ans[i][j] = 0;
		for (int k = 0; k < N; k++)	{
                    ans[i][j] += m[i][k] * m2[k][j];
		}
            }
 	return	ans;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int[][] arrA = new int[n][m];
        int[][] arrB = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int k1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int[][] arrrA = new int[n1][k1];
        int[][] arrrB = new int[k1][m1];
        for(int i = 0; i < n1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < k1; j++){
                arrrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < k1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m1; j++){
                arrrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        long[][] Matrix = new long[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                Matrix[i][j] = Long.parseLong(st.nextToken());
            }
        }
        /********************************************************/
        System.out.println("A)");
        int[][] resA = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                resA[i][j] = (arrA[i][j] | arrB[i][j]);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(resA[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        /********************************************************/
        System.out.println("B)");
        int[][] resB = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                resB[i][j] = (arrA[i][j] & arrB[i][j]);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(resB[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        /********************************************************/
        System.out.println("C)");
        int[][] resC = new int[n1][m1];
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m1; j++){
                resC[i][j] = 0;
                for(int k = 0; k < k1; k++)
                    resC[i][j] |= (arrrA[i][k] & arrrB[k][j]);
            }
        }
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m1; j++)
                System.out.print(resC[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        /********************************************************/
        System.out.println("D)");
        long[][] resD = matrixPower(Matrix,r);
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++)
                System.out.print(resD[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
}
