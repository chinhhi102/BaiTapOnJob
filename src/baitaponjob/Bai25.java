/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaponjob;

import java.io.*;
import java.util.*;

/**
 *
 * @author student
 * input

 * output
 A)

 B)

 C)

 */
public class Bai25 {

    
    /**
     * @param args the command line arguments
     */
    public static final int MAXN = 10000000; 
    
    static Vector<Boolean>isprime = new Vector<>(MAXN); 
    static Vector<Integer>prime = new Vector<>(); 
    static Vector<Integer>SPF = new Vector<>(MAXN);
    static Vector<String>Str = new Vector<>();
    static Vector<Integer>DigitsPrimes = new Vector<>();
    static void manipulated_seive(int N) { 
        isprime.set(0, false); 
        isprime.set(1, false); 
        for (int i=2; i<N ; i++) { 
            if (isprime.get(i)) { 
                prime.add(i); 
                SPF.set(i,i); 
            } 
            for (int j=0; j < prime.size() && i*prime.get(j) < N && prime.get(j) <= SPF.get(i); j++) { 
                isprime.set(i*prime.get(j),false); 
                SPF.set(i*prime.get(j),prime.get(j)) ; 
            } 
        } 
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < MAXN; i++){ 
            isprime.add(true); 
            SPF.add(2); 
        } 
        
        manipulated_seive(MAXN); 
        
        System.out.println("A)");
        for(int i = 10000; i < MAXN; i++){
//            if(isprime.get(i))
//                System.out.println(i);
            String s = Integer.toString(i);
            String rev = "";
            for(int j = s.length() - 1; j >= 0; j--){
                rev = rev + s.charAt(j);
            }
            if(s.equals(rev))
                Str.add(s);
            int d = i;
            boolean kt = true;
            while(d > 0){
                int mod = d % 10;
                if(mod != 2 && mod != 3 && mod != 5 && mod != 7)
                    kt = false;
                d /= 10;
            }
            if(kt)
                DigitsPrimes.add(i);
        }
        System.out.println("B)");
        for(int i = 0; i < Str.size(); i++)
            System.out.println(Str.get(i));
        System.out.println("C)");
        for(int i = 0; i < DigitsPrimes.size(); i++)
            System.out.println(DigitsPrimes.get(i));
    }
}
