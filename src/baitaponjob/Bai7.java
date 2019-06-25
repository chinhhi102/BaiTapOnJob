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
 * 5
 * output
 * 5
 */
public class Bai7 {
    
    public static final int MAXN = 10000;  
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        if(n<3){
            System.out.println(1);
        }else{
            int[] fb = new int[n+2];
            fb[1]=fb[2]=1;
            for(int i=3;i<=n;i++){
                fb[i]=fb[i-1]+fb[i-2];
            }
            System.out.println(fb[n]);
        }
        
        System.out.println();
    }
}
