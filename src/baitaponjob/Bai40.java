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
 * n X Y
 * sample input
11 of has
Lorem Ipsum is simply dummy text
of the printing and typesetting industry. 
Lorem Ipsum has been the industry's standard 
dummy text ever since the 1500s, when an unknown printer 
took a galley of type and scrambled it to make a type specimen book. 
It has survived not only five centuries, but also the leap into 
electronic typesetting, remaining essentially unchanged. 
It was popularised in the 1960s with the release of 
Letraset sheets containing Lorem Ipsum passages, 
and more recently with desktop publishing software 
like Aldus PageMaker including versions of Lorem Ipsum
output
B)
91
C) 
4
D)
1001100 1101111 1110010 1100101 1101101 1001001 1110000 1110011 1110101 1101101 1101001 1110011 1110011 1101001 1101101 1110000 1101100 1111001 1100100 1110101 1101101 1101101 1111001 1110100 1100101 1111000 1110100 
1101111 1100110 1110100 1101000 1100101 1110000 1110010 1101001 1101110 1110100 1101001 1101110 1100111 1100001 1101110 1100100 1110100 1111001 1110000 1100101 1110011 1100101 1110100 1110100 1101001 1101110 1100111 1101001 1101110 1100100 1110101 1110011 1110100 1110010 1111001 101110 
1001100 1101111 1110010 1100101 1101101 1001001 1110000 1110011 1110101 1101101 1101000 1100001 1110011 1100010 1100101 1100101 1101110 1110100 1101000 1100101 1101001 1101110 1100100 1110101 1110011 1110100 1110010 1111001 100111 1110011 1110011 1110100 1100001 1101110 1100100 1100001 1110010 1100100 
1100100 1110101 1101101 1101101 1111001 1110100 1100101 1111000 1110100 1100101 1110110 1100101 1110010 1110011 1101001 1101110 1100011 1100101 1110100 1101000 1100101 110001 110101 110000 110000 1110011 101100 1110111 1101000 1100101 1101110 1100001 1101110 1110101 1101110 1101011 1101110 1101111 1110111 1101110 1110000 1110010 1101001 1101110 1110100 1100101 1110010 
1110100 1101111 1101111 1101011 1100001 1100111 1100001 1101100 1101100 1100101 1111001 1101111 1100110 1110100 1111001 1110000 1100101 1100001 1101110 1100100 1110011 1100011 1110010 1100001 1101101 1100010 1101100 1100101 1100100 1101001 1110100 1110100 1101111 1101101 1100001 1101011 1100101 1100001 1110100 1111001 1110000 1100101 1110011 1110000 1100101 1100011 1101001 1101101 1100101 1101110 1100010 1101111 1101111 1101011 101110 
1001001 1110100 1101000 1100001 1110011 1110011 1110101 1110010 1110110 1101001 1110110 1100101 1100100 1101110 1101111 1110100 1101111 1101110 1101100 1111001 1100110 1101001 1110110 1100101 1100011 1100101 1101110 1110100 1110101 1110010 1101001 1100101 1110011 101100 1100010 1110101 1110100 1100001 1101100 1110011 1101111 1110100 1101000 1100101 1101100 1100101 1100001 1110000 1101001 1101110 1110100 1101111 
1100101 1101100 1100101 1100011 1110100 1110010 1101111 1101110 1101001 1100011 1110100 1111001 1110000 1100101 1110011 1100101 1110100 1110100 1101001 1101110 1100111 101100 1110010 1100101 1101101 1100001 1101001 1101110 1101001 1101110 1100111 1100101 1110011 1110011 1100101 1101110 1110100 1101001 1100001 1101100 1101100 1111001 1110101 1101110 1100011 1101000 1100001 1101110 1100111 1100101 1100100 101110 
1001001 1110100 1110111 1100001 1110011 1110000 1101111 1110000 1110101 1101100 1100001 1110010 1101001 1110011 1100101 1100100 1101001 1101110 1110100 1101000 1100101 110001 111001 110110 110000 1110011 1110111 1101001 1110100 1101000 1110100 1101000 1100101 1110010 1100101 1101100 1100101 1100001 1110011 1100101 1101111 1100110 
1001100 1100101 1110100 1110010 1100001 1110011 1100101 1110100 1110011 1101000 1100101 1100101 1110100 1110011 1100011 1101111 1101110 1110100 1100001 1101001 1101110 1101001 1101110 1100111 1001100 1101111 1110010 1100101 1101101 1001001 1110000 1110011 1110101 1101101 1110000 1100001 1110011 1110011 1100001 1100111 1100101 1110011 101100 
1100001 1101110 1100100 1101101 1101111 1110010 1100101 1110010 1100101 1100011 1100101 1101110 1110100 1101100 1111001 1110111 1101001 1110100 1101000 1100100 1100101 1110011 1101011 1110100 1101111 1110000 1110000 1110101 1100010 1101100 1101001 1110011 1101000 1101001 1101110 1100111 1110011 1101111 1100110 1110100 1110111 1100001 1110010 1100101 
1101100 1101001 1101011 1100101 1000001 1101100 1100100 1110101 1110011 1010000 1100001 1100111 1100101 1001101 1100001 1101011 1100101 1110010 1101001 1101110 1100011 1101100 1110101 1100100 1101001 1101110 1100111 1110110 1100101 1110010 1110011 1101001 1101111 1101110 1110011 1101111 1100110 1001100 1101111 1110010 1100101 1101101 1001001 1110000 1110011 1110101 1101101 
E)
Lorem Ipsum is simply dummy text 
of the printing and typesetting industry. 
Lorem Ipsum has been the industry's standard 
dummy text ever since the 1500s, when an unknown printer 
took a galley of type and scrambled it to make a type specimen book. 
It has survived not only five centuries, but also the leap into 
electronic typesetting, remaining essentially unchanged. 
It was popularised in the 1960s with the release of 
Letraset sheets containing Lorem Ipsum passages, 
and more recently with desktop publishing software 
like Aldus PageMaker including versions of Lorem Ipsum 
F)
Lorem Ipsum is simply dummy text 
has the printing and typesetting industry. 
Lorem Ipsum has been the industry's standard 
dummy text ever since the 1500s, when an unknown printer 
took a galley has type and scrambled it to make a type specimen book. 
It has survived not only five centuries, but also the leap into 
electronic typesetting, remaining essentially unchanged. 
It was popularised in the 1960s with the release has 
Letraset sheets containing Lorem Ipsum passages, 
and more recently with desktop publishing software 
like Aldus PageMaker including versions has Lorem Ipsum 
 */
public class Bai40 {
    public static String convertCharToParityBits(char c){
        String res = "";
        int n = (int)c;
//        System.out.println(n);
        while(n > 0){
            res = (n%2 == 0 ? "0" : "1" ) + res;
            n /= 2;
        }
        return res;
    }
    public static char convertParityBitsToChar(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum = (sum*2 + (s.charAt(i) == '1' ? 1 : 0));
        }
//        System.out.println(sum);
        return (char)sum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String word_X = st.nextToken();
        String word_Y = st.nextToken();
        ArrayList<ArrayList<String>> arrList = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> ParityList = new ArrayList<ArrayList<String>>();
        int d = 0, count_X = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            ArrayList<String> singleList = new ArrayList<String>();
            while(st.hasMoreTokens()){
                String w = st.nextToken();
                d++;
                singleList.add(w);
                if(word_X.equals(w)){
                    count_X++;
                }
            }
            arrList.add(singleList);
        }
        /*****************************************************/
        System.out.println("B)");
        System.out.println(d);
        /*****************************************************/
        System.out.println("C)");
        System.out.println(count_X);
        /*****************************************************/
        System.out.println("D)");
        for(ArrayList<String> singleList:arrList){
            ArrayList<String> singleBinary = new ArrayList<String>();
            for(String e:singleList){
                String Binary_ST = new String();
                for(int i = 0; i < e.length(); i++){
                    Binary_ST = convertCharToParityBits(e.charAt(i));
                    System.out.print(Binary_ST + " ");
                    singleBinary.add(Binary_ST);
                }
                Binary_ST = convertCharToParityBits(' ');
                singleBinary.add(Binary_ST);  
            }
            ParityList.add(singleBinary);
            System.out.println();
        }
        /*****************************************************/
        System.out.println("E)");
        for(ArrayList<String> singleList:ParityList){
            for(String e:singleList){
                System.out.print(convertParityBitsToChar(e));
            }
            System.out.println();
        }
        /*****************************************************/
        System.out.println("F)");
        for(ArrayList<String> singleList:arrList){
            for(String e:singleList){
                System.out.printf("%s ",(e.equals(word_X) ? word_Y : e));
            }
            System.out.println();
        }
    }
}
