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
baI  tApp vE   Nha
 * output
Bai Tap Ve Nha
 */
public class Bai31 {

    
    /**
     * @param args the command line arguments
     */
    public static final int MAXN = 100000; 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        String subString;
        while(st.hasMoreTokens()){
            subString = st.nextToken();
            subString = subString.substring(0,1).toUpperCase() + subString.substring(1).toLowerCase();
            System.out.print(subString + " ");
        }
    }
    
}
