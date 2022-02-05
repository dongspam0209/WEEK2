package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;

public class S42217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for (int i=0;i<N;i++){//로프당 들어올릴 수 있는 무게 입력
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr); //오름차순으로 정렬
        int max=arr[0]*N;

        for (int i=1;i<N;i++){
            if (max < arr[i] * (N - i)) {
                max = arr[i] * (N - i);
            }
        }
        System.out.println(max);
    }
}
