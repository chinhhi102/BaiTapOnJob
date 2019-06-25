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
 */
public class Bai11 {
    private static int[] arr = new int[100];
    private static int n;
    private static void permute(int l, int r) 
    { 
        if (l == r){
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = l; i <= r; i++) { 
                swap(l, i); 
                permute(l + 1, r); 
                swap(l, i); 
            } 
        } 
    } 
  
    public static void swap(int i, int j) 
    {
        int temp;
        temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        for(int i=1;i<=n;i++){
            arr[i]=i;
        }
        
        permute(0,n-1);
        System.out.println();
    }
}
