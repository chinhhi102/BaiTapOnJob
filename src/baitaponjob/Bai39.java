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
 * N
 * a11 a12 ... a1N
 * a21 a22 ... a2N
 * ...
 * aN1 aN2 ... aNN
sample input
3
1 2 3
4 5 6
7 8 9
A)
row: 2
col: 2
dig: 2

 */
public class Bai39 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] row = new int[n];
        int[] col = new int[n];
        int[] dig = new int[n+n];
        int maxRow = 0, maxCol = 0, maxDig = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                row[i] += arr[i][j];
                col[j] += arr[i][j];
                dig[i-j+n-1] += arr[i][j];
                maxRow = Math.max(maxRow, row[i]);
                maxCol = Math.max(maxCol, col[j]);
                maxDig = Math.max(maxDig, dig[i-j+n-1]);
            }
        }
        System.out.println("A)");
        for(int i = 0; i < n; i++){
            if(maxRow == row[i]){
                System.out.println("Row: " + i);
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(maxCol == col[i]){
                System.out.println("Col: " + i);
                break;
            }
        }
        for(int i = 0; i < n+n; i++){
            if(maxDig == dig[i]){
                System.out.println("Dig: " + i);
                break;
            }
        }
    }
}
