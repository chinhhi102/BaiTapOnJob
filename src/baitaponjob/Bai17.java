/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaponjob;

import java.io.*;
import java.util.*;
import java.lang.Iterable;
import java.util.Arrays;
import java.io.IOException;

/**
 *
 * @author isc
 */
public class Bai17 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Double[] arr = new Double[n];
        for(int i=0;i<n;i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
    }
}