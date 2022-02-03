package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S54796 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (true) {
            StringBuilder sb=new StringBuilder();
            String[] str=br.readLine().split(" ");
            int L = Integer.parseInt(str[0]);
            int P = Integer.parseInt(str[1]);
            int V = Integer.parseInt(str[2]);

            if (L == 0 && P == 0 && V == 0) break;

            sb.append("Case ").append(i).append(": ").append(((V/P)*L)+Math.min(L,V%P));
            System.out.println(sb);
            i++;
        }
        br.close();
    }

}
