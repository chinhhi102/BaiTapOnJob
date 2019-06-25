/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaponjob;

import java.io.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

/**
 *
 * @author isc
 * input
 * 5 2
 * output
 * 101
 */
public class Bai2 {
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        List<Integer> prefix = new ArrayList<>();
        prefix.add(n%b);
        while((n/=b)>0){
            prefix.add(n%b);
        }
        for(int i = prefix.size()-1; i >= 0; i--) {
            System.out.print(prefix.get(i));
        }
        System.out.println();
    }
}
