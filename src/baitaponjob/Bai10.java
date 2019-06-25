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
public class Bai10 {

    private static int[] arr = new int[100];
    private static int n,k;
    private static boolean[] kt = new boolean[100];
    
    public static void FindSubArray(int x){
        if(x == k+1){
            for(int i=1; i<=k; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=1;i<=n;i++){
            if(!kt[i]){
                kt[i]=true;
                arr[x]=i;
                FindSubArray(x+1);
                kt[i]=false;
            }
        }
        
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        for(int i=1;i<=n;i++){
            arr[i]=i;
            kt[i]=false;
        }
        
        FindSubArray(1);
        System.out.println();
    }
}
