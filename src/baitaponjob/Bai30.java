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
5
1 3 5 2 4
2
 * output
 A)
5 4
 B)
5 4 3 2 1
 C)
5 4 3 2 2 1
 */
public class Bai30 {

    
    /**
     * @param args the command line arguments
     */
    public static final int MAXN = 100000; 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] arr = new Integer[n+1];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr, 0, n, Collections.reverseOrder());
        System.out.println("A)");
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println("B)");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("C)");
        Integer x = scan.nextInt();
        int id = n - 1;
        while(x >= arr[id]){
            arr[id+1] = arr[id];
            id--;
        }
        arr[id] = x;
        System.out.println(Arrays.toString(arr));
    }
    
}
