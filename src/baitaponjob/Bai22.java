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
public class Bai22 {
    public static final int MAXN = 10000;  
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        boolean[] check = new boolean[MAXN + 1];
        for (int i = 2; i <= MAXN; i++) {
            check[i] = true;
        }
        List<Integer> stt = new ArrayList<>(),arrPrimes = new ArrayList<>();
        for (int i = 2; i <= MAXN; i++) {
            if(check[i])
                stt.add(i);
            if (check[i] == true) {
                for (int j = 2 * i; j <= MAXN; j += i) {
                    check[j] = false;
                }
            }
        }
        
        double sq = Math.sqrt(n);
        int d = 0;
        System.out.println("A)");
        for(int i = 1; i <= sq; i++){
            if(n%i==0){
                if(n/i == i){
                    d++;
                    System.out.print(i + " ");
                    if(stt.contains(i)){
                        arrPrimes.add(i);
                    }
                }
                else{
                    d+=2;
                    System.out.print(i + " " + n/i);
                    if(stt.contains(i))
                        arrPrimes.add(i);
                    if(stt.contains(n/i))
                        arrPrimes.add(n/i);
                }
            }
        }
        System.out.println("\nNum: " + d);
        System.out.println("B) " + arrPrimes.toString());
    }
    
}
