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
public class Bai19 {
    
    public static final int MAXN = 100000;  
    public static int sum(int x){
        int sum = x%10;
        while((x/=10) > 0)
            sum+=x%10;
        return sum;
    }
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer s = Integer.parseInt(br.readLine());
        
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
        
        int id = 0;
        while(st.get(++id)<10000);
        while(id < st.size() && st.get(id)<100000){
            if(sum(st.get(id)) == s){
                System.out.println(st.get(id));
            }
            id++;
        }
        
        System.out.println();
    }
}
