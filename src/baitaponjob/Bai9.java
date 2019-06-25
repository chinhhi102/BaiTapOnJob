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
 * 8545604
 * output
 * 32
 */
public class Bai9 {

    private static int[] arr = new int[100];
    private static int n;
    
    public static void FindStringBinary(int x){
        if(x == n){
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for(int i=0;i<2;i++){
            arr[x]=i;
            FindStringBinary(x+1);
        }
        
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        FindStringBinary(0);
        System.out.println();
    }
}
