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
 * input
 3 5
 1 2 3 2 1
 1 2 1 2 8
 3 3 1 2 1
 * output
 A)
 8 1 4
 B)
 0 2 3 2 0
 0 2 0 2 0
 3 3 0 2 0
 C)
 1 2 1 2 1
 1 2 1 2 1
 1 3 3 2 8
 */
public class Bai24 {

    
    /**
     * @param args the command line arguments
     */
    public static final int MAXN = 100000; 
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean[] check = new boolean[MAXN + 1];
        // Khởi tạo tất cả các số [2...N] đều là số nguyên tố
        for (int i = 2; i < MAXN; i++) {
          check[i] = true;
        }

        // Thuật toán sàng nguyên tố
        // Nếu một số là số nguyên tố, thì tất cả các bội của nó không phải số nguyên tố
        for (int i = 2; i < MAXN; i++) {
          if (check[i] == true) {
            for (int j = 2 * i; j <= MAXN; j += i) {
              check[j] = false;
            }
          }
        }
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        int[][] arrPrimes = new int[n][m];
        int[][] arrSort = new int[m][n];
        int idx = 0,idy = 0,maxx = -1;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                arr[i][j] = scan.nextInt();
                if(arr[i][j] > maxx){
                    maxx = arr[i][j];
                    idx = i;
                    idy = j;
                }
                // if la so nguyen to thi lay gia tri nguoc lai 0
                arrPrimes[i][j] = check[arr[i][j]] ? arr[i][j] : 0;
                arrSort[j][i] = arr[i][j];
            }
        System.out.println("A)");
        System.out.println(maxx + " " + idx + " " + idy);
        System.out.println("B)");
        for(int i = 0; i < n; i++)
            System.out.println(Arrays.toString(arrPrimes[i]));
        System.out.println("C)");
        for(int i = 0; i < m; i++)
            Arrays.sort(arrSort[i]);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(arrSort[j][i] + " ");
            System.out.println();
        }
    }
    
}
