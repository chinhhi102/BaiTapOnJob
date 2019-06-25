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
public class Bai20 {
    
    public static final int MAXN = 10000;  
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        
        boolean[] check = new boolean[MAXN + 1];
        for (int i = 2; i <= MAXN; i++) {
            check[i] = true;
        }
        List<Integer> st = new ArrayList<>();
        for (int i = 2; i <= MAXN && i <= n; i++) {
            if(check[i])
                st.add(i);
            if (check[i] == true) {
                for (int j = 2 * i; j <= MAXN; j += i) {
                    check[j] = false;
                }
            }
        }
        int a=1,b=1,c;
        while(a<=n){
            if(st.contains(a)){
                System.out.println(a);
            }
            c=a+b;
            a=b;
            b=c;
        }
        
        System.out.println();
    }
}
