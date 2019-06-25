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
public class Bai21 {
    
    public static final int MAXN = 10000;  
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer k,sum = 0,n = Integer.parseInt(br.readLine());
        k = n;
        sum = k%10;
        while((k /= 10) > 0){
            sum+=k%10;
        }
        System.out.println("A) " + sum);
        
        boolean[] check = new boolean[MAXN + 1];
        for (int i = 2; i <= MAXN; i++) {
            check[i] = true;
        }
        List<Integer> st = new ArrayList<>();
        for (int i = 2; i <= MAXN; i++) {
            if(check[i])
                st.add(i);
            if (check[i] == true) {
                for (int j = 2 * i; j <= MAXN; j += i) {
                    check[j] = false;
                }
            }
        }
        
        System.out.print("B) ");
        int id = 0;
        Integer fac = st.get(id);
        boolean b = false;
        
        while(n>1){
            while(n%fac==0){
                if(b)
                    System.out.print("x");
                System.out.print(fac);
                n /= fac;
                b = true;
            }
            fac = st.get(++id);
        }
        System.out.println();
    }
}
