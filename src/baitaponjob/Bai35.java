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
 * n b
 * a1 a2 ... an
5 7
3 2 1 2 5
 * output
0 0 0 0 0 
0 0 0 0 1 
0 0 0 1 0 
0 0 0 1 1 
0 0 1 0 0 
0 0 1 0 1 
0 0 1 1 0 
0 1 0 0 0 
0 1 0 0 1 
0 1 0 1 0 
0 1 1 0 0 
0 1 1 1 0 
1 0 0 0 0 
1 0 0 1 0 
1 0 1 0 0 
1 0 1 1 0 
1 1 0 0 0 
1 1 0 1 0 
1 1 1 0 0 
 */
public class Bai35 {

    private static int[] arr = new int[100];
    private static int[] arrA = new int[100];
    private static int n, b, sum = 0;
    
    public static void FindStringBinary(int x){
        if(x == n){
            if(sum <= b){
                for(int i=0;i<n;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        for(int i=0;i<2;i++){
            arr[x]=i;
            sum += arrA[x] * arr[x];
            FindStringBinary(x+1);
            sum -= arrA[x] * arr[x];
        }
        
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        FindStringBinary(0);
        System.out.println();
    }
}
