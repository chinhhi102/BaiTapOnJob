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
Doan Cong Chinh
 * output
Chinh Doan Cong
 */
public class Bai33 {

    
    /**
     * @param args the command line arguments
     */
    public static final int MAXN = 100000; 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        String name = "";
        String F_name = "";
        while(st.hasMoreTokens()){
            name = st.nextToken();
            if(st.hasMoreTokens())
                F_name += name + " ";
        }
        System.out.println(name + " " + F_name);
    }
}
