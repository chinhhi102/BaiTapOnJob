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
public class Bai12 {
    private static int[] arr = new int[100];
    private static int n,x;
    
    private static int HonnerFomular(int id){
        if(id==n)
            return arr[id]*x;
        return (HonnerFomular(id+1) + arr[id])*x;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=n;i>=0;i--){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(HonnerFomular(1) + arr[0]);
    }
}
