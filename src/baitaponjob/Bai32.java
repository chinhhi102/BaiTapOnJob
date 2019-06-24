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
'tApp' is the longest word at index 4
 */
public class Bai32 {

    
    /**
     * @param args the command line arguments
     */
    public static final int MAXN = 100000; 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        String subString;
        String MaxString = "";
        int id = 0;
        int idMax = 0;
        while(st.hasMoreTokens()){
            subString = st.nextToken();
            if(MaxString.length() < subString.length()){
                MaxString = subString;
                idMax = id;
            }
            id += subString.length() + 1;
        }
        System.out.printf("'%s' is the longest word at index %d\n",MaxString,idMax);
    }
    
}
