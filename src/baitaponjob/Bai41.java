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
 * c1 c2 ... cn
5 7
3 2 1 2 5
1 2 3 4 5
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

 */
public class Bai41 {

    private static int[] arr = new int[100];
    private static int[] arrA = new int[100];
    private static int[] arrC = new int[100];
    private static int n, b, sum = 0;
    private static int minC = 10000000;
    
    public static void FindStringBinary(int x){
        if(x == n){
            if(sum == b){
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
    
    public static void FindStringBinaryS(int x){
        if(x == n){
            if(sum <= b){
                int subSum = 0;
                for(int i=0;i<n;i++){
                    subSum += arr[i] * arrC[i];
                }
                minC = Math.min(subSum, minC);
            }
            return;
        }
        for(int i=0;i<2;i++){
            arr[x]=i;
            sum += arrA[x] * arr[x];
            FindStringBinaryS(x+1);
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
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arrC[i] = Integer.parseInt(st.nextToken());
        }
        /*****************************************/
        System.out.println("A)");
        FindStringBinary(0);
        System.out.println();
        /*****************************************/
        System.out.println("B)");
        FindStringBinary(0);
        System.out.println();
        /*****************************************/
        System.out.println("C)");
        FindStringBinaryS(0);
        System.out.println(minC);
        System.out.println();
    }
}
