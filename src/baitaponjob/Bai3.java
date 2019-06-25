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
 * 8545604
 * output
 * 32
 */
public class Bai3 {
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] n = br.readLine().toCharArray();
        int sum = 0;
        for(char i:n){
            sum += i-'0';
        }
        System.out.println(sum);
    }
}
