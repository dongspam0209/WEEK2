package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B22864{
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int A=Integer.parseInt(str[0]);
        int B=Integer.parseInt(str[1]);

        String a= Integer.toString(A);
        String b= Integer.toString(B);

        min(a,b);
        max(a,b);

    }
    public static void   min(String a,String b){
        String ma= a.replace("6","5");
        String mb= b.replace("6","5");
        int result=Integer.parseInt(ma)+Integer.parseInt(mb);
        System.out.println(result);
    }
    public static void  max(String a,String b){
        String ma= a.replace("5","6");
        String mb= b.replace("5","6");
        int result=Integer.parseInt(ma)+Integer.parseInt(mb);
        System.out.println(result);
    }

}
