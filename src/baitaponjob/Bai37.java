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
 * n b
 * a1 a2 ... an
4 5
Lan Hang Minh Thuy
Nghia Trung Minh Thuy Duc
 * output
B)
Lan Hang Minh Thuy Nghia Trung Duc
C)
Minh Thuy
D)
Lan Hang
 */
public class Bai37 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<String> arrA = new ArrayList<String>();
        List<String> arrB = new ArrayList<String>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arrA.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            arrB.add(st.nextToken());
        }
        /**********************************************/
        System.out.println("B)");
        for(int i = 0; i < n; i++){
            System.out.print(arrA.get(i) + " ");
        }
        for(int i = 0; i < m; i++){
            if(!arrA.contains(arrB.get(i))){
                System.out.print(arrB.get(i) + " ");
            }
        }
        System.out.println();
        /**********************************************/
        System.out.println("C)");
        for(int i = 0; i < n; i++){
            if(arrB.contains(arrA.get(i))){
                System.out.print(arrA.get(i) + " ");
            }
        }
        System.out.println();
        /**********************************************/
        System.out.println("D)");
        for(int i = 0; i < n; i++){
            if(!arrB.contains(arrA.get(i))){
                System.out.print(arrA.get(i) + " ");
            }
        }
        System.out.println();
    }
}
