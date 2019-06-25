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
public class Bai14 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Map kt = new HashMap();
        st = new StringTokenizer(br.readLine());
        Double[] arr = new Double[n+1];
        for(int i=0;i<n;i++){
            arr[i] = Double.parseDouble(st.nextToken());
            if(kt.containsKey(arr[i])){
                Integer val = (Integer) kt.get(arr[i]);
                kt.put(arr[i], val + 1);
            }else{
                kt.put(arr[i], 1);
            }
        }
        
        for(Object key: kt.keySet()){
            if((Integer) kt.get(key) == 1){
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }
}
