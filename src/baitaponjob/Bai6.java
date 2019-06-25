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
 * 3
 * output
 * 2 3 5
 */
public class Bai6 {
    
    public static final int MAXN = 10000;  
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        
        boolean[] check = new boolean[MAXN + 1];
        for (int i = 2; i <= MAXN; i++) {
            check[i] = true;
        }
        int id = 0;
        List<Integer> st = new ArrayList<>();
        for (int i = 2; i <= MAXN && id < n; i++) {
            if(check[i]){
                System.out.print(i + " ");
                id++;
            }
            if (check[i] == true) {
                for (int j = 2 * i; j <= MAXN; j += i) {
                    check[j] = false;
                }
            }
        }
        
        System.out.println();
    }
}
