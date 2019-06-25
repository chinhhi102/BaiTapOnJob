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
public class Bai13 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Cin arr A
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Double[] arrOfA = new Double[n];
        for(int i=0;i<n;i++){
            arrOfA[i] = Double.parseDouble(st.nextToken());
        }
        // Cin arr B
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Double[] arrOfB = new Double[m];
        for(int i=0;i<m;i++){
            arrOfB[i] = Double.parseDouble(st.nextToken());
        }
        
        Double[] arrOfC = new Double[n+m];
        int i=0,j=0,k=0;
        for(;i<n&&j<m;){
            if(arrOfA[i]<arrOfB[j])
                arrOfC[k++]=arrOfA[i++];
            else
                arrOfC[k++]=arrOfB[j++];
        }
        while(i<n)
            arrOfC[k++]=arrOfA[i++];
        while(j<m)
            arrOfC[k++]=arrOfB[j++];
        
        System.out.println(Arrays.toString(arrOfC));
    }
}
