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
 * 
 * output
 * 100001
 * 101101
 * ...
 * 999999
 */
public class Bai8 {
    public static final int MINN = 100000;
    public static final int MAXN = 1000000;
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
//        int i = 123456;
//        System.out.println(i/100000 + " " + i%10 + " " + (i/10000)%10 + " " + ((i%100)/10) + " " + (i/1000)%10 + " " + ((i%1000)/100));
        for(int i=MINN;i<MAXN;i++){
            if(i/100000==i%10 && (i/10000)%10 == ((i%100)/10) && (i/1000)%10 == ((i%1000)/100)){
                System.out.println(i);
            }
        }
        
        System.out.println();
    }
}
