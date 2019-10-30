package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số: ");
        int x = sc.nextInt();
        System.out.println("Nhập một chỉ số để thêm vào mảng: ");
        int index = sc.nextInt();
        if(index <= 1 || index > array.length){
            System.out.println("Không chèn được phần tử vào mảng");
        }else{
            for (int i = array.length-1;i>index;i-- ){
                array[i] = array[i-1];
            }
            array[index] = x;
        }
        for (int output : array) {
            System.out.println(output);
        }
    }
}
